package com.team2.u22.ejercicio3.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
import com.team2.u22.ejercicio3.modelo.Cientificos;
import com.team2.u22.ejercicio3.vista.Vista;

/**
 * 
 * ejercicio1 - com.team2.u22.ejercicio1.controlador - ClienteControler
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 *         Fecha de creación 10/05/2022
 */
public class CientificosControler implements ActionListener {

	private Cientificos cientifico;
	private Vista vista;

	/**
	 * Contructor de clase le pasamos el moledo cliente y vista cliente
	 * 
	 * @param cliente
	 * @param clienteVista
	 */
	public CientificosControler(Cientificos cientifico, Vista vista) {
		this.cientifico = cientifico;
		this.vista = vista;

		// Boton de Crear Usuario
		this.vista.botonCU_1.addActionListener(this);
		this.vista.botonFU_1.addActionListener(this);
		this.vista.botonBU_1.addActionListener(this);
		this.vista.botonAU_1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		this.cientifico.setDNI("");
		this.cientifico.setNombreCompleto("");
		

		// Crear Usuario
		if (this.vista.botonCU_1 == e.getSource()) {
			try {

				if (!"".equals(this.vista.txtDni.getText())) {
					
					if (this.vista.txtDni.getText().length() < 9) {
						
						this.cientifico.setDNI(this.vista.txtDni.getText());
						
					} else {

						JOptionPane.showMessageDialog(null, "El dni tiene que tener como máximo 8 caracteres");
					}
				}

				if (!"".equals(this.vista.txtNombre.getText())) {
										
					this.cientifico.setNombreCompleto(this.vista.txtNombre.getText());
						
				}

				
				cientifico.crearRegistro("ud22_ejercicios_db_clientes", "cientificos", cientifico.toString());


			} catch (Exception e2) {

				JOptionPane.showMessageDialog(null, e2.getMessage());
			}
			// Boton Filtrar usuarios
		} else if (this.vista.botonFU_1 == e.getSource()) {

			try {
				vista.textAreaCientificos.setText(this.cientifico.leerTablaBaseDatos("ud22_ejercicios_db_clientes", "cientificos", 3));
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// Actualizar Usuario
		} else if (this.vista.botonAU_1 == e.getSource()) {

			try {
			if (!"".equals(this.vista.txtDni.getText())) {
				String actualizarDni = "DNI = '" + vista.txtDni.getText() + "'";
				this.cientifico.actualizarRegistro("ud22_ejercicios_db_clientes", "cientificos", actualizarDni,
						"DNI = " + vista.txtDni.getText());
			}

			if (!"".equals(vista.txtNombre.getText())) {
				String actualizarApellido = "nombre_completo = '" + vista.txtNombre.getText() + "'";
				this.cientifico.actualizarRegistro("ud22_ejercicios_db_clientes", "cliente", actualizarApellido,
						"id = " + vista.txtDni.getText());
			}

				
			}catch (Exception ex) {
			
				JOptionPane.showMessageDialog(null, ex.getMessage());
				
			}

			// Borrar Usuario
		} else if (this.vista.botonBU_1 == e.getSource()) {

			try {
				cientifico.eliminarRegistro("ud22_ejercicios_db_clientes", "cliente", "DNI = " + vista.txtDni.getText());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

}
