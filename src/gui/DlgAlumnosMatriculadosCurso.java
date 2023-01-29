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
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgAlumnosMatriculadosCurso extends JFrame {
	//global
	private ArregloAlumnos arAlumno=new ArregloAlumnos();
	//private ArregloCursos---------------------------------
	//private ArregloMatriculas-----------------------------

	private JPanel contentPane;
	private JTextArea txtSalida;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgAlumnosMatriculadosCurso frame = new DlgAlumnosMatriculadosCurso();
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
	public DlgAlumnosMatriculadosCurso() {
		setTitle("Alumnos matriculados por curso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LISTAR: ALUMNOS MATRICULADOS CURSOS
				txtSalida.setText("");
				//for(int i=0; i<ac.tamanio(); i++) {
					boolean x= false;
				  //imprimir(" "+ac.obtener(i).getAsignatura());
					imprimir("");
					//int CodCurso = ac.obtener(i).getCodCurso;
					//for(int j=0; j<am.tamaño(); j++) {
						//Matricula m=am.obtener(j);
					    //if(m.getCodigoCurso()==CodCurso) {
					    	//int estado = arAlumno(m.getCodigoAlumno().getEstado());
					        //if(estado ==1) {
					        	//if(!x) x = true;
					        	//imprimir(" *ALUMNO : "+arAlumno.buscar(m.getCodigoAlumno()).getNombres()+""+
					        			               //arAlumno.buscar(m.getCodigoAlumno()).getApellidos());
				}
			}
			//if(!x) imprimir("NO EXISTEN ALUMNOS MATRICULADOS EN ESTE CURSO");
			//imprimir("--------------------------------------------------------")
		});
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnListar.setBounds(165, 10, 91, 29);
		contentPane.add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 49, 418, 405);
		contentPane.add(scrollPane);
		
		txtSalida = new JTextArea();
		scrollPane.setViewportView(txtSalida);
	}

String nombreEstado(int i) {
	switch(i) {
	case 0: return "REGISTRADO";
	case 1: return "MATRICULADO";
	case 2: return "RETIRADO";
	default: return null;
	}
	
	void imprimir(String s) {
		txtSalida.append(s+"\n");
	}

}
