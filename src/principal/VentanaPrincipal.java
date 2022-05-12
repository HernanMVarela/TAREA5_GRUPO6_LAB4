package principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.PanelListadoPeliculas;
import dominio.Pelicula;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.TreeSet;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private static DefaultListModel<Pelicula> listModel;
	
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		menuBar.setBounds(45, 0, 97, 21);
		contentPane.add(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		mnPeliculas.setBounds(10, 2, 55, 19);
		contentPane.add(mnPeliculas);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				contentPane.removeAll();
//				PanelAgregarPeliculas agregar = new PanelAgregarPeliculas();
//				agregar.setDefaultListModel(listModel);
//				contentPane.add(agregar);
//				contentPane.repaint();
//				contentPane.revalidate();
				
			}
		});
		mnPeliculas.add(mntmAgregar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				contentPane.removeAll();
//				PanelListadoPeliculas listado = new PanelListadoPeliculas();
//				ordenar_lista();
//				listado.setDefaultListModel(listModel);
//				contentPane.add(listado);
//				contentPane.repaint();
//				contentPane.revalidate();
				
			}
		});
		mnPeliculas.add(mntmListar);
	}
	
	private void ordenar_lista() {
		TreeSet<Pelicula> lista = new TreeSet<Pelicula>();
		
		for (int x=0; x<listModel.getSize(); x++) {
			lista.add(listModel.getElementAt(x));
		}
		listModel.clear();
		Iterator<Pelicula> ite = lista.iterator();
		while (ite.hasNext()) {
			listModel.addElement(ite.next());
		}
	}
}
