package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.table.DefaultTableModel;//ayuda

//importar
import arreglos.ArregloAlumnos;
import clases.Alumno;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmAlumno extends JFrame {
	//global
	private ArregloAlumnos arAlumno=new ArregloAlumnos(); //arAlumno = EsElglobal

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombres;
	private JTextField txtDni;
	private JTextField txtEdad;
	private JTextField txtCelular;
	private JTextField txtApellidos;
	private JTable tblAlumnos;
	private JComboBox cboEstado;
	private JButton btnNuevo;
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnConsultar;
	private JButton btnEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAlumno frame = new frmAlumno();
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
	public frmAlumno() {
		setTitle("Alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CODIGO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(10, 10, 63, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRES");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(10, 33, 63, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("APELLIDOS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2.setBounds(10, 56, 73, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DNI");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setBounds(10, 82, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("EDAD");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4.setBounds(10, 111, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ESTADO");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_5.setBounds(10, 174, 63, 13);
		contentPane.add(lblNewLabel_5);
		
		txtCodigo = new JTextField();
		txtCodigo.setEnabled(false);
		txtCodigo.setBounds(93, 7, 96, 19);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setEnabled(false);
		txtNombres.setBounds(93, 30, 159, 19);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setEnabled(false);
		txtDni.setBounds(93, 79, 96, 19);
		contentPane.add(txtDni);
		txtDni.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setEnabled(false);
		txtEdad.setBounds(93, 108, 96, 19);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		txtCelular = new JTextField();
		txtCelular.setEnabled(false);
		txtCelular.setBounds(93, 137, 96, 19);
		contentPane.add(txtCelular);
		txtCelular.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setEnabled(false);
		txtApellidos.setBounds(93, 53, 159, 19);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		cboEstado = new JComboBox();
		cboEstado.setFont(new Font("Tahoma", Font.BOLD, 10));
		cboEstado.setModel(new DefaultComboBoxModel(new String[] {"Registrado", "Matriculado", "Retirado"}));
		cboEstado.setBounds(93, 170, 143, 21);
		contentPane.add(cboEstado);
		
		JLabel lblNewLabel_6 = new JLabel("CELULAR");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6.setBounds(10, 140, 73, 13);
		contentPane.add(lblNewLabel_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 197, 570, 165);
		contentPane.add(scrollPane);
		
		tblAlumnos = new JTable();
		tblAlumnos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nombres", "Apellidos", "DNI", "Edad", "Celular", "Estado"
			}
		));
		tblAlumnos.getColumnModel().getColumn(0).setPreferredWidth(85);
		tblAlumnos.getColumnModel().getColumn(1).setPreferredWidth(89);
		tblAlumnos.getColumnModel().getColumn(2).setPreferredWidth(85);
		tblAlumnos.getColumnModel().getColumn(3).setPreferredWidth(93);
		tblAlumnos.getColumnModel().getColumn(5).setPreferredWidth(83);
		tblAlumnos.getColumnModel().getColumn(6).setPreferredWidth(88);
		tblAlumnos.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblAlumnos);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//BOTON NUEVO
				limpiarCajas();
				
				//Limpiar
				//listado();
				txtCodigo.setText("");
				txtNombres.setText("");
				txtApellidos.setText("");
				txtDni.setText("");
				txtEdad.setText("");
				txtCelular.setText("");
				txtCodigo.setText(""+arAlumno.generarCodigo());
				txtNombres.requestFocus();
				
				//llamar al metodo
				habilitar(true);
				txtDni.setEnabled(true);//para que aparesca en el boton nuevo(se habilita)
				
				cboEstado.setSelectedIndex(0);
				cboEstado.setEnabled(false);
			}
		});
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNuevo.setBounds(456, 29, 105, 21);
		contentPane.add(btnNuevo);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//BOTON ADICIONAR
				
				//invocar el al metodo DNI
				Alumno a=arAlumno.buscarDNI(leerDNI());
				//validar a
				if (a!=null) {
					mensaje("DNI Existe...");
				}else {
					//Crear objeto de la clase alumno
					Alumno al=new Alumno(leerCodigo(),leerNombres(),leerApellidos(),leerDNI(), leerEdad(), leerCelular(), 0);
					//invocarMetodoAdicionar
					arAlumno.adicionar(al);
					//mensaje
					mensaje("Alumno registrado correctamente");
				//actualizar tabla
					listado();
				}
			}
		});
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAdicionar.setBounds(456, 56, 105, 21);
		contentPane.add(btnAdicionar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//BOTON MODIFICAR
				
				//invocar el al metodo buscar
				Alumno a=arAlumno.buscar(leerCodigo());
				//modificar datos
				a.setNombres(leerNombres());
				a.setApellidos(leerApellidos());
				a.setEdad(leerEdad());
				a.setCelular(leerCelular());
				a.setEstado(leerEstado());
				
				//Llamar al metodo listado
				listado();
				
				habilitar(false);//Se bloquean las cajas
			}
		});
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnModificar.setBounds(456, 86, 105, 21);
		contentPane.add(btnModificar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//BOTON CONSULTAR
				
				int cod;
				cod=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar código : "));
				Alumno a=arAlumno.buscar(cod);
				//validar
				if(a==null) {
					mensaje("Codigo no existe");
					limpiarCajas();
					//habilitar
					habilitar(false);
				}else {
					txtCodigo.setText(""+a.getCodAlumno());
					txtNombres.setText(a.getNombres());
					txtApellidos.setText(a.getApellidos());
					txtDni.setText(a.getDni());
					txtEdad.setText(""+a.getEdad());
					txtCelular.setText(""+a.getCelular());
					cboEstado.setSelectedItem(a.nombreEstado());
					
					//habilitar las cajas
					habilitar(true);
					txtDni.setEnabled(false);
					cboEstado.setEnabled(true);
				}
			}
		});
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnConsultar.setBounds(456, 117, 105, 21);
		contentPane.add(btnConsultar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//BOTON ELIMINAR
				
				int boton;
				
				boton=JOptionPane.showConfirmDialog(null, "Seguro de eliminar","Sistema",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				
				if(boton==0) {
					Alumno a=arAlumno.buscar(leerCodigo());
					if(a!=null) {
						mensaje("Alumno eliminado");
						arAlumno.eliminar(a);
						listado();
						limpiarCajas();
						habilitar(false);
					}else {
						mensaje("Codigo no existe");
					}
				}

			}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnEliminar.setBounds(456, 148, 105, 21);
		contentPane.add(btnEliminar);
		
		
		//imagen
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Usuario\\Desktop\\PROYECTO_ALGORITMOS_2021\\Proyecto_2021\\img\\student.png"));
		lblNewLabel_8.setBounds(336, 56, 63, 91);
		contentPane.add(lblNewLabel_8);
		
		//invocar al metodo listado
		listado();
	}
	
	//Metodo listado
	void listado() {
		//1
		DefaultTableModel modeloAlumnos=(DefaultTableModel) tblAlumnos.getModel(); //click in cast(yellow)
		//2 limpiarelmodelo
		modeloAlumnos.setRowCount(0);
		//3
		for(int i=0; i<arAlumno.tamanio(); i++) {
			//4 obtener
			Alumno a=arAlumno.obtener(i);
			//5 ArregloDeObject
			Object fila[]= {a.getCodAlumno(),a.getNombres(),a.getApellidos(),a.getDni(),a.getEdad(),a.getCelular(),a.nombreEstado()};//Se cambia el get.Estado
			//6
			modeloAlumnos.addRow(fila);
		}
	}
	int leerCodigo() {
		return Integer.parseInt(txtCodigo.getText());
	}
	
	String leerNombres() {
		return txtNombres.getText();
	}
	
	String leerApellidos() {
		return txtApellidos.getText();
	}
	
	String leerDNI() {
		return txtDni.getText();
	}
	
	
	int leerEdad() {
		return Integer.parseInt(txtEdad.getText());
	}
	
	int leerCelular() {
		return Integer.parseInt(txtCelular.getText());
	}
	
	int leerEstado() {
		return cboEstado.getSelectedIndex();
	}
	
	void mensaje(String m) {
		JOptionPane.showMessageDialog(null, m);
	}
	
	//VOID HABILITAR
	void habilitar(boolean estado) {
		//txtCodigo.setEnabled(estado);=EstaBloqueado
		txtNombres.setEnabled(estado);
		txtApellidos.setEnabled(estado);
		txtDni.setEnabled(estado);
		txtEdad.setEnabled(estado);
		txtCelular.setEnabled(estado);
	}
	
	void limpiarCajas() {
		//limpiar
		txtCodigo.setText("");
		txtNombres.setText("");
		txtApellidos.setText("");
		txtDni.setText("");
		txtEdad.setText("");
		txtCelular.setText("");
	}
}
