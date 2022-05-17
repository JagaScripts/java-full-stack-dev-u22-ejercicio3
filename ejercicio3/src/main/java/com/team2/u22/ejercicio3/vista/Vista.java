package com.team2.u22.ejercicio3.vista;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * ejercicio1 - vista - Vista
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 *         Fecha de creación 10/05/2022
 */
public class Vista extends JFrame {

	public JPanel contentPane;
	
	public JButton botonCU_1;
	public JButton botonAU_1;
	public JButton botonFU_1;
	public JButton botonBU_1;
	
	public JTextField txtIdVideo;
	public JTextField txtTítulo;
	public JTextField txtDirector;
	public JTextField txtIdVideoA;
	public JTextField txtTituloA;
	public JTextField txtDirectorA;
	public JTextArea textAreaVideos;
	public JTextField textField;
	public JTextField textField_1;

	
	
	public JButton botonAU_1_2;
	public JButton botonBU_1_1;
	public JTextArea textAreaVideos_1_1;
	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 917);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelCrear_1 = new JPanel();
		panelCrear_1.setLayout(null);
		panelCrear_1.setBounds(10, 11, 352, 205);
		contentPane.add(panelCrear_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("DNI:");
		lblNewLabel_1_2.setBounds(10, 55, 61, 14);
		panelCrear_1.add(lblNewLabel_1_2);
		
		txtIdVideo = new JTextField();
		txtIdVideo.setColumns(10);
		txtIdVideo.setBounds(65, 52, 122, 20);
		panelCrear_1.add(txtIdVideo);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombre:");
		lblNewLabel_2_2.setBounds(10, 83, 56, 14);
		panelCrear_1.add(lblNewLabel_2_2);
		
		txtTítulo = new JTextField();
		txtTítulo.setColumns(10);
		txtTítulo.setBounds(65, 80, 86, 20);
		panelCrear_1.add(txtTítulo);
		
		JLabel lblNewLabel_3_2 = new JLabel("Apellido:");
		lblNewLabel_3_2.setBounds(10, 111, 41, 14);
		panelCrear_1.add(lblNewLabel_3_2);
		
		txtDirector = new JTextField();
		txtDirector.setColumns(10);
		txtDirector.setBounds(65, 108, 122, 20);
		panelCrear_1.add(txtDirector);
		
		botonCU_1 = new JButton("Enviar");
		botonCU_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonCU_1.setBounds(10, 171, 89, 23);
		panelCrear_1.add(botonCU_1);
		
		JLabel lblNewLabel_6_4 = new JLabel("Cientificos");
		lblNewLabel_6_4.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6_4.setBounds(20, 11, 106, 21);
		panelCrear_1.add(lblNewLabel_6_4);
		
		JButton botonAU_1_1 = new JButton("Actualizar");
		botonAU_1_1.setBounds(119, 171, 101, 23);
		panelCrear_1.add(botonAU_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("DNI:");
		lblNewLabel_1_2_1.setBounds(119, 155, 61, 14);
		panelCrear_1.add(lblNewLabel_1_2_1);
		
		JButton botonAU_1_1_1 = new JButton("Borrar");
		botonAU_1_1_1.setBounds(241, 171, 101, 23);
		panelCrear_1.add(botonAU_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("DNI:");
		lblNewLabel_1_2_1_1.setBounds(241, 155, 61, 14);
		panelCrear_1.add(lblNewLabel_1_2_1_1);
		
		JPanel panelLeer_1 = new JPanel();
		panelLeer_1.setLayout(null);
		panelLeer_1.setBounds(390, 11, 352, 205);
		contentPane.add(panelLeer_1);
		
		textAreaVideos = new JTextArea();
		textAreaVideos.setBounds(10, 41, 332, 124);
		panelLeer_1.add(textAreaVideos);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Filtrar Cientifico");
		lblNewLabel_6_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6_1_1.setBounds(33, 9, 179, 21);
		panelLeer_1.add(lblNewLabel_6_1_1);
		
		botonFU_1 = new JButton("Filtrar");
		botonFU_1.setBounds(121, 171, 89, 23);
		panelLeer_1.add(botonFU_1);
		
		JPanel panelActualizar_1 = new JPanel();
		panelActualizar_1.setLayout(null);
		panelActualizar_1.setBounds(10, 242, 352, 205);
		contentPane.add(panelActualizar_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Id:");
		lblNewLabel_1_1_1.setBounds(10, 46, 61, 14);
		panelActualizar_1.add(lblNewLabel_1_1_1);
		
		txtIdVideoA = new JTextField();
		txtIdVideoA.setColumns(10);
		txtIdVideoA.setBounds(65, 43, 86, 20);
		panelActualizar_1.add(txtIdVideoA);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Nombre:");
		lblNewLabel_2_1_1.setBounds(10, 74, 56, 14);
		panelActualizar_1.add(lblNewLabel_2_1_1);
		
		txtTituloA = new JTextField();
		txtTituloA.setColumns(10);
		txtTituloA.setBounds(65, 71, 86, 20);
		panelActualizar_1.add(txtTituloA);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Horas:");
		lblNewLabel_3_1_1.setBounds(10, 103, 61, 14);
		panelActualizar_1.add(lblNewLabel_3_1_1);
		
		txtDirectorA = new JTextField();
		txtDirectorA.setColumns(10);
		txtDirectorA.setBounds(65, 95, 86, 20);
		panelActualizar_1.add(txtDirectorA);
		
		botonAU_1 = new JButton("Actualizar");
		botonAU_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonAU_1.setBounds(109, 151, 101, 23);
		panelActualizar_1.add(botonAU_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Actualizar Proyecto");
		lblNewLabel_6_2_1.setBounds(10, 9, 204, 21);
		panelActualizar_1.add(lblNewLabel_6_2_1);
		lblNewLabel_6_2_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		
		JButton botonCU_1_1 = new JButton("Enviar");
		botonCU_1_1.setBounds(10, 151, 89, 23);
		panelActualizar_1.add(botonCU_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Id:");
		lblNewLabel_1_1_1_1.setBounds(109, 136, 61, 14);
		panelActualizar_1.add(lblNewLabel_1_1_1_1);
		
		JButton botonAU_1_3 = new JButton("Borrar");
		botonAU_1_3.setBounds(229, 151, 101, 23);
		panelActualizar_1.add(botonAU_1_3);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Id:");
		lblNewLabel_1_1_1_1_1.setBounds(231, 136, 61, 14);
		panelActualizar_1.add(lblNewLabel_1_1_1_1_1);
		
		JPanel panelBorrar_1 = new JPanel();
		panelBorrar_1.setLayout(null);
		panelBorrar_1.setBounds(390, 242, 352, 205);
		contentPane.add(panelBorrar_1);
		
		JLabel lblNewLabel_6_3_1 = new JLabel("Filtrar Proyecto");
		lblNewLabel_6_3_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6_3_1.setBounds(10, 11, 280, 21);
		panelBorrar_1.add(lblNewLabel_6_3_1);
		
		botonBU_1 = new JButton("Filtrar");
		botonBU_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonBU_1.setBounds(132, 171, 89, 23);
		panelBorrar_1.add(botonBU_1);
		
		JTextArea textAreaVideos_1 = new JTextArea();
		textAreaVideos_1.setBounds(10, 43, 332, 124);
		panelBorrar_1.add(textAreaVideos_1);
		
		JPanel panelActualizar_1_1 = new JPanel();
		panelActualizar_1_1.setLayout(null);
		panelActualizar_1_1.setBounds(10, 458, 352, 205);
		contentPane.add(panelActualizar_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Id:");
		lblNewLabel_1_1_1_2.setBounds(10, 46, 61, 14);
		panelActualizar_1_1.add(lblNewLabel_1_1_1_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(34, 43, 86, 20);
		panelActualizar_1_1.add(textField);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("DNI");
		lblNewLabel_2_1_1_1.setBounds(175, 46, 56, 14);
		panelActualizar_1_1.add(lblNewLabel_2_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(207, 43, 86, 20);
		panelActualizar_1_1.add(textField_1);
		
		botonAU_1_2 = new JButton("Asignar");
		botonAU_1_2.setBounds(130, 171, 101, 23);
		panelActualizar_1_1.add(botonAU_1_2);
		
		JLabel lblNewLabel_6_2_1_1 = new JLabel("Asignar Proyecto");
		lblNewLabel_6_2_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6_2_1_1.setBounds(10, 9, 204, 21);
		panelActualizar_1_1.add(lblNewLabel_6_2_1_1);
		
		JPanel panelBorrar_1_1 = new JPanel();
		panelBorrar_1_1.setLayout(null);
		panelBorrar_1_1.setBounds(390, 458, 352, 205);
		contentPane.add(panelBorrar_1_1);
		
		JLabel lblNewLabel_6_3_1_1 = new JLabel("Filtrar Proyecto Asignados");
		lblNewLabel_6_3_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6_3_1_1.setBounds(10, 11, 280, 21);
		panelBorrar_1_1.add(lblNewLabel_6_3_1_1);
		
		botonBU_1_1 = new JButton("Filtrar");
		botonBU_1_1.setBounds(132, 171, 89, 23);
		panelBorrar_1_1.add(botonBU_1_1);
		
		textAreaVideos_1_1 = new JTextArea();
		textAreaVideos_1_1.setBounds(10, 43, 332, 124);
		panelBorrar_1_1.add(textAreaVideos_1_1);
	}
}
