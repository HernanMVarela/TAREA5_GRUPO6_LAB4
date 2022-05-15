package dominio;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class PanelListadoPeliculas extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JLabel lblPeliculas;
	private JList<Pelicula> jList;
	private DefaultListModel<Pelicula> listModel;
	private JScrollPane scrollPane;

	public PanelListadoPeliculas() {
		setLayout(null);
		listModel = new DefaultListModel<Pelicula>();
		
		lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPeliculas.setBounds(10, 11, 70, 33);
		add(lblPeliculas);
		
		jList = new JList<Pelicula>();
		jList.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 55, 420, 200);
	    scrollPane.setViewportView(jList);
	    jList.setLayoutOrientation(JList.VERTICAL);
		add(scrollPane);
	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> listModel) {
		this.listModel = listModel;
		jList.setModel(this.listModel);
	}
}
