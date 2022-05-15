package dominio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;

public class PanelAgregarPeliculas extends JPanel {


	private static final long serialVersionUID = 1L;
	private JTextField txtFieldNombre;
	private DefaultListModel<Pelicula> listModel;
	private JLabel lblID;
	private JLabel idPelicula;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JComboBox<Categoria> comboBoxGenero;
	private JButton btnAceptar;
	private String nombre;
	private String aux;
	private Pelicula pelicula;

	public PanelAgregarPeliculas() {
		setLayout(null);
		
		lblID = new JLabel("ID:");
		lblID.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblID.setToolTipText("");
		lblID.setBounds(60, 30, 82, 37);
		add(lblID);
		
		idPelicula = new JLabel(Integer.toString(Pelicula.getCont()+1));
		idPelicula.setFont(new Font("Tahoma", Font.BOLD, 15));
		idPelicula.setBounds(181, 30, 103, 37);
		add(idPelicula);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setBounds(60, 80, 82, 37);
		add(lblNombre);
		
		lblGenero = new JLabel("G\u00E9nero:");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGenero.setBounds(59, 130, 83, 37);
		add(lblGenero);
		
		txtFieldNombre = new JTextField();
		txtFieldNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFieldNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtFieldNombre.getText().length()>25) {
					e.consume();
				}
			}
		});
		txtFieldNombre.setBounds(181, 80, 228, 37);
		add(txtFieldNombre);
		txtFieldNombre.setColumns(10);
		
		comboBoxGenero = new JComboBox<Categoria>();
		comboBoxGenero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxGenero.setBounds(181, 130, 228, 37);
		add(comboBoxGenero);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean pass=true;
				try {
					if(txtFieldNombre.getText().isEmpty()) {txtFieldNombre.setBackground(Color.RED);pass=false;}
					else {txtFieldNombre.setBackground(Color.WHITE);}
					if(comboBoxGenero.getSelectedIndex()==0) {JOptionPane.showMessageDialog(null, "Seleccione un género"); pass=false;}
					
					for(int x=0; x < listModel.getSize(); x++){
						nombre = listModel.getElementAt(x).getNombre();
						aux = txtFieldNombre.getText();
						if(nombre.equalsIgnoreCase(aux)) {
							JOptionPane.showMessageDialog(null, "Esa película ya se encuentra cargada");
							txtFieldNombre.setText("");
							comboBoxGenero.setSelectedIndex(0);
							pass=false;
						}
					}
					if(pass) {						
						pelicula = new Pelicula();
						pelicula.setCategoria((Categoria)comboBoxGenero.getSelectedItem());
						pelicula.setNombre(txtFieldNombre.getText());
						listModel.addElement(pelicula);
						txtFieldNombre.setText("");
						comboBoxGenero.setSelectedIndex(0);
						idPelicula.setText(Integer.toString(Pelicula.getCont()+1));
					}			
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,e.toString());
					e.printStackTrace();
				}
			}
		});
		btnAceptar.setBounds(60, 196, 141, 37);
		add(btnAceptar);
		
		comboBoxGenero.addItem(new Categoria(0,"Seleccione Genero"));
		comboBoxGenero.addItem(new Categoria(1,"Terror"));
		comboBoxGenero.addItem(new Categoria(2,"Accion"));
		comboBoxGenero.addItem(new Categoria(3,"Suspenso"));
		comboBoxGenero.addItem(new Categoria(4,"Romantica"));
	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> listModel) {
		this.listModel = listModel;
	}
}
