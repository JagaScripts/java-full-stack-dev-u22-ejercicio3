package com.team2.u22.ejercicio3.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import com.team2.u22.ejercicio3.modelo.Cientificos;
import com.team2.u22.ejercicio3.modelo.Proyecto;
import com.team2.u22.ejercicio3.vista.Vista;

public class Asignado_AControlador implements ActionListener{

	private Cientificos cientifico;
	private Proyecto proyecto;
	private Vista vista;
	
	public Asignado_AControlador(Cientificos c ,Proyecto p, Vista v) {
		
		this.cientifico = c;
		this.proyecto = p;
		this.vista = v;
		
		this.vista.botonBU_1_1.addActionListener(this);
		this.vista.botonAU_1_2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(this.vista.botonAU_1_2 == e.getSource()) {
			
			if(!"".equals(vista.textField.getText())){
				//Añadir Id proyecto
			}
			
			if(!"".equals(vista.textField_1.getText())) {
				//Añadir DNI cientifico
			}
			
		}else if(this.vista.botonBU_1_1 == e.getSource()) {
			
			try {
				vista.textAreaVideos_1_1.setText(cientifico.leerTablaBaseDatos("ud22_ejercicios_db_clientes", "cientificos", 3));
				vista.textAreaVideos_1_1.setText(proyecto.leerTablaBaseDatos("ud22_ejercicios_db_clientes", "proyecto", 3));
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
		}
		
	}
	
	

}
