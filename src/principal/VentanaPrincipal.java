package principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.PanelAgregarPeliculas;
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
	private static DefaultListModel<Pelicula> listModel;
	
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 350);
		listModel = new DefaultListModel<Pelicula>();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				PanelAgregarPeliculas agregar = new PanelAgregarPeliculas();
				agregar.setDefaultListModel(listModel);
				contentPane.add(agregar);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnPeliculas.add(mntmAgregar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				PanelListadoPeliculas listado = new PanelListadoPeliculas();
				ordenar_lista();
				listado.setDefaultListModel(listModel);
				contentPane.add(listado);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnPeliculas.add(mntmListar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	private void ordenar_lista() {
		TreeSet<Pelicula> lista = new TreeSet<Pelicula>();
		if (listModel.isEmpty()) return;
		for (int x=0; x<listModel.getSize(); x++)
			lista.add(listModel.getElementAt(x));
		listModel.clear();
		Iterator<Pelicula> ite = lista.iterator();
		while (ite.hasNext())
			listModel.addElement(ite.next());
	}
}
