package dominio;

import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class PanelListadoPeliculas extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JLabel lblPeliculas;
	private JList<Pelicula> jList;
	private DefaultListModel<Pelicula> listModel;

	public PanelListadoPeliculas() {
		setLayout(null);
		listModel = new DefaultListModel<Pelicula>();
		
		lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPeliculas.setBounds(10, 11, 70, 33);
		add(lblPeliculas);
		
		jList = new JList<Pelicula>();
		jList.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jList.setBounds(29, 55, 390, 223);
		
		add(jList);
	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> listModel) {
		this.listModel = listModel;
		jList.setModel(this.listModel);
	}
}
