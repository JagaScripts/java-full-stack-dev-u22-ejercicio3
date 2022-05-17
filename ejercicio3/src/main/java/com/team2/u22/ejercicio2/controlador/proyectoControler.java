/**
 * 
 */
package com.team2.u22.ejercicio2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.team2.u22.ejercicio3.modelo.Proyecto;
import com.team2.u22.ejercicio3.vista.Vista;

/**
 * ejercicio2 - com.team2.u22.ejercicio2.controlador - VideoControler
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 *         Fecha de creación 17/05/2022
 */
public class proyectoControler implements ActionListener {

	private Proyecto proyecto;
	private Vista vista;


	/**
	 * @param video
	 * @param vista
	 */
	public proyectoControler(Proyecto proyecto, Vista vista) {
		this.proyecto = proyecto;
		this.vista = vista;

		// Boton de Crear Proyectos
		this.vista.botonCU_1_1.addActionListener(this);
		this.vista.botonAU_1.addActionListener(this);
		this.vista.botonAU_1_3.addActionListener(this);
		this.vista.botonBU_1.addActionListener(this);

	}

	/**
	 *
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		this.proyecto.setId("");
		this.proyecto.setNombre("");
		this.proyecto.sethoras(0);

		// Crear Proyecto
		if (this.vista.botonCU_1_1 == e.getSource()) {
			try {

				if (!"".equals(this.vista.txtIdVideoA.getText())) {
					this.proyecto.setId(this.vista.txtIdVideoA.getText());
				}

				if (!"".equals(this.vista.txtTituloA.getText())) {
					this.proyecto.setNombre(this.vista.txtTituloA.getText());
				}
				
				if (!"".equals(this.vista.txtDirectorA.getText())) {
					this.proyecto.sethoras(Integer.parseInt(this.vista.txtDirectorA.getText()));
				}

				proyecto = new Proyecto();
				proyecto.setId("");
				proyecto.setNombre("");
				proyecto.sethoras(0);

				if (!"".equals(this.vista.txtIdVideoA.getText())) {
					this.proyecto.setId(this.vista.txtIdVideoA.getText());
					proyecto = new Proyecto();
				}

				proyecto.crearRegistro("ud22_ejercicios_db_clientes", "proyectos", proyecto.toString());

				System.out.println(proyecto);
				System.out.println(proyecto);

			} catch (Exception e2) {

				JOptionPane.showMessageDialog(null, e2.getMessage());
			}
			// Boton Filtrar usuarios
		} else if (this.vista.botonFU_1 == e.getSource()) {

			try {
				vista.textAreaVideos.setText(proyecto.leerTablaBaseDatos("ud22_ejercicios_db_clientes", "proyecto", 4));
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// Actualizar Usuario
		} else if (this.vista.botonAU_1 == e.getSource()) {

			try {
				if (!"".equals(vista.txtTituloA.getText())) {
					String actualizarid = "nombre = '" + vista.txtTituloA.getText() + "'";
					proyecto.actualizarRegistro("ud22_ejercicios_db_clientes", "id", actualizarid,
							"id = " + vista.txtIdVideoA.getText());
				}

				if (!"".equals(vista.txtDirectorA.getText())) {
					String actualizarnombre = "apellido = '" + vista.txtDirectorA.getText() + "'";
					proyecto.actualizarRegistro("ud22_ejercicios_db_clientes", "nombre", actualizarnombre,
							"nombre = " + vista.txtIdVideoA.getText());
				}

			} catch (Exception ex) {

				JOptionPane.showMessageDialog(null, ex.getMessage());

			}

			// Borrar Usuario
		} else if (this.vista.botonAU_1_3 == e.getSource()) {

			try {
				proyecto.eliminarRegistro("ud22_ejercicios_db_clientes", "proyectos", "id = " + vista.txtIdVideoA.getText());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

}
