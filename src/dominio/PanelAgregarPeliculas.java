package dominio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregarPeliculas extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelAgregarPeliculas frame = new PanelAgregarPeliculas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PanelAgregarPeliculas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(60, 30, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel idPelicula = new JLabel("1");
		idPelicula.setBounds(181, 30, 46, 14);
		contentPane.add(idPelicula);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(60, 80, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Genero");
		lblNewLabel_2.setBounds(59, 130, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtFieldNombre = new JTextField();
		txtFieldNombre.setBounds(181, 80, 130, 20);
		contentPane.add(txtFieldNombre);
		txtFieldNombre.setColumns(10);
		
		JComboBox<Categoria> comboBoxGenero = new JComboBox<Categoria>();
		comboBoxGenero.setBounds(181, 130, 130, 20);
		contentPane.add(comboBoxGenero);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtFieldNombre.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nombre pelicula invalido");
				
				}else if(comboBoxGenero.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "Seleccione un genero valido");
				}else {
				Pelicula pelicula = new Pelicula();
				pelicula.setCategoria((Categoria)comboBoxGenero.getSelectedItem());
				pelicula.setNombre(txtFieldNombre.getText());
				
				JOptionPane.showMessageDialog(null, pelicula.toString());
				}
				
				
			}
		});
		btnAceptar.setBounds(60, 180, 122, 23);
		contentPane.add(btnAceptar);
		
		comboBoxGenero.addItem(new Categoria(0,"Seleccione Genero"));
		comboBoxGenero.addItem(new Categoria(1,"Terror"));
		comboBoxGenero.addItem(new Categoria(2,"Accion"));
		comboBoxGenero.addItem(new Categoria(3,"Suspenso"));
		comboBoxGenero.addItem(new Categoria(4,"Romantica"));
	}
}
