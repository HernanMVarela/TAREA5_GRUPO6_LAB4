package dominio;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.util.Arrays;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class PanelListadoPeliculas extends JPanel {
	
	private static final long serialVersionUID = 1L;
//	private JScrollPane scrollPane;
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
/*	
	//Se le asignan valores determinados a una instancia DefaultListModel RECIEN creada,,, ListModel1 seria la instancia recien creada y ListModel2 a agregar 
	//Se repiten dos veces el método setDefaultListModel() porque el ListModel del PanelAgregarPeliculas.java se tiene que ordenar creando otro
	//ListModel aqui en PanelListadoPeliculas.java
	public void setDefaultListModel(DefaultListModel<Pelicula> listModel2)
	{
		
		int n= listModel2.getSize();   // n = tamaño del DefaultListModel recibido
		String[] data= new String [n];  // Crea un Array de strings  (con el largo del listModel2)
		for (int i = 0; i < n; i++) {
			data[i]= listModel2.get(i).getNombre();	// el Array en el subindice i = al nombre del DefaultListModel listModel2
		}
		Arrays.sort(data);  //Se ordena el Array de strings
		
	//luego se tiene que convertir en otro listmodel ya que un Array no puede ir en el jList
	DefaultListModel<Pelicula> orderlist = new DefaultListModel<Pelicula>();  // Nueva instancia de DefaultListModel llamada "orderlist"
	orderlist.clear(); //limpio orderlist
	
	for(int i=0;i<n;i++) {
		orderlist.add(i,PeliculaOrdenada(i,listModel2,data)); 
	}
	 //orderlist guardara las peliculas a ordenarse (LLAMANDO AL METODO PeliculaOrdenada(subindice, listmodel2, Array de strings) )
		jList.setModel(orderlist);  //a jList le asigno el modelo orderlist Y lo muestro en instruccion:  add(jList); --> línea 39

	}
	
	public Pelicula PeliculaOrdenada(int a, DefaultListModel<Pelicula> b, String v[]) {
	int n = b.getSize();    //n = tamaño del DefaultListModel recibido b
	  for(int i=0;i<n;i++) {
		  if(v[a].equals(b.getElementAt(i).getNombre())) {   //Si ArrayString[en subindice del método anterior] = nombre del  DefaultListModel recibido
			  return b.getElementAt(i);  //retorno el id del DefaultListModel
		  }}                                           // EN SINTESIS: comparo si el String en cuestion es = al nombre del DefaultListModel en cuestion											// Los DefaultListModel se guardaran siguiendo el orden del Array de Strings
	return null;	
	}
 */
}
