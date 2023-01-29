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
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class DlgAlumnosMatriculaPendiente extends JFrame {
	//global
	private ArregloAlumnos arAlumno=new ArregloAlumnos(); //arAlumno = EsElglobal

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
					DlgAlumnosMatriculaPendiente frame = new DlgAlumnosMatriculaPendiente();
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
	public DlgAlumnosMatriculaPendiente() {
		setTitle("Alumnos con matr\u00EDcula pendiente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnListar = new JButton("LISTAR");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LISTAR: ALUMNOS CON MATRICULAS PENDIENTES
				txtSalida.setText("");
				for(int i=0; i<arAlumno.tamanio(); i++) {
					if(arAlumno.obtener(i).getEstado()==0) {
						imprimir(" CÓDIGO          : "+arAlumno.obtener(i).getCodAlumno());
						imprimir(" NOMBRES       : "+arAlumno.obtener(i).getNombres());
						imprimir(" APELLIDOS     :  " + arAlumno.obtener(i).getApellidos());
						imprimir(" DNI                   : "+arAlumno.obtener(i).getDni());
						imprimir(" EDAD               : "+arAlumno.obtener(i).getEdad());
						imprimir(" CELULAR         : "+arAlumno.obtener(i).getCelular());
						imprimir(" ESTADO          : "+nombreEstado(arAlumno.obtener(i).getEstado()));
						imprimir("---------------------------------------------------");
					}
				}
			}
		});
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnListar.setBounds(172, 21, 94, 28);
		contentPane.add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 416, 391);
		contentPane.add(scrollPane);
		
		txtSalida = new JTextArea();
		scrollPane.setViewportView(txtSalida);
	}
	
	//nombreEstado
	String nombreEstado(int i) {
		switch(i) {
		case 0: return "REGISTRADO";
		case 1: return "MATRICULADO";
		case 2: return "RETIRADO";
		default: return null;
		}
	}
	
	//imprimir
	void imprimir(String s) {
		txtSalida.append(s+ "\n");
	}

}
