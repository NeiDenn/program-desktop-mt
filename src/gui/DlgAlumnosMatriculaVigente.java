package gui;

//IMPORTE
import arreglos.*; //1
import clases.*; //2

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgAlumnosMatriculaVigente extends JFrame {
	//global2
	private ArregloAlumnos arAlumno=new ArregloAlumnos();

	private JPanel contentPane;
	private JButton btnListar;
	private JTextArea txtSalida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgAlumnosMatriculaVigente frame = new DlgAlumnosMatriculaVigente();
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
	public DlgAlumnosMatriculaVigente() {
		setTitle("Alumnos con matr\u00EDcula vigente:");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LISTAR: ALUMNOS CON MATRICULAS VIGENTES
				txtSalida.setText("");
				for(int i=1; i<arAlumno.tamanio(); i++) {
					if(arAlumno.obtener(i).getEstado() ==1) {
						imprimir(" CÓDIGO         : "+arAlumno.obtener(i).getCodAlumno());
						imprimir(" NOMBRES     : "+arAlumno.obtener(i).getNombres());
						imprimir(" APELLIDOS   : "+arAlumno.obtener(i).getApellidos());
						imprimir(" DNI                 : "+arAlumno.obtener(i).getDni());
						imprimir(" EDAD            : "+arAlumno.obtener(i).getEdad());
						imprimir(" CELULAR      : "+arAlumno.obtener(i).getCelular());
						imprimir(" ESTADO       : "+nombreEstado(arAlumno.obtener(i).getEstado()));
						imprimir("-------------------------------------------------");
					}
				}
			}
		});
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnListar.setBounds(157, 10, 94, 29);
		contentPane.add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 53, 416, 377);
		contentPane.add(scrollPane);
		
		txtSalida = new JTextArea();
		scrollPane.setViewportView(txtSalida);
	}
	
	String nombreEstado(int i) {
		switch(i) {
		case 0: return "REGISTRADO";
		case 1: return "MATRICULADO";
		case 2: return "RETIRADO";
		default : return null;
		}
	}
	
	void imprimir(String s) {
		txtSalida.append(s+"\n");
	}
}
