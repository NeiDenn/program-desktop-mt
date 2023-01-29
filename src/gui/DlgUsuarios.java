package gui;
//ImporteUsuarios
import login.Usuarios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtContraseña;
	private JTextField txtUsuario;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgUsuarios frame = new DlgUsuarios();
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
	public DlgUsuarios() {
		setTitle("Login de usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel icono = new JLabel("");
		icono.setIcon(new ImageIcon("C:\\Users\\Usuario\\Desktop\\PROYECTO_ALGORITMOS_2021\\Proyecto_2021\\img\\registrarStudent.png"));
		icono.setBounds(295, 58, 86, 76);
		contentPane.add(icono);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(137, 65, 96, 19);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(137, 115, 96, 19);
		contentPane.add(txtContraseña);
		txtContraseña.setColumns(10);
		
		lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(21, 68, 79, 13);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(21, 118, 79, 13);
		contentPane.add(lblNewLabel_1);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LOGIN
				
				
			}
		});
		btnLogin.setBounds(74, 159, 85, 21);
		contentPane.add(btnLogin);
	}
}
