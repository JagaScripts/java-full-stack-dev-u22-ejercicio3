/**
 * 
 */
package com.team2.u22.ejercicio3.modelo;

import java.sql.SQLException;

import com.team2.u22.ejercicio3.modelo.gestiondb.ServicioBD;

/**
 * ejercicio2 - com.team2.u22.ejercicio2.modelo - Video
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 15/05/2022
 */
public class AsignadoA extends ServicioBD{
	
	private Cientificos cientifico ;
	private Proyecto proyecto;


	/**
	 * 
	 */
	public AsignadoA() {
	}
	
	

	/**
	 * @param id
	 * @param title
	 * @param director
	 * @param cliente
	 */
	public AsignadoA(Cientificos cientifico, Proyecto proyecto) {
		this.cientifico = cientifico;
		this.proyecto = proyecto;

	}


	public Cientificos getCientifico() {
		return cientifico;
	}



	public void setCientifico(Cientificos cientifico) {
		this.cientifico = cientifico;
	}



	public Proyecto getProyecto() {
		return proyecto;
	}



	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}



	@Override
	public void usarBaseDatos(String nombreBaseDatos) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		super.usarBaseDatos(nombreBaseDatos);
	}

	@Override
	public void crearRegistro(String nombreBaseDatos, String tabla, String registros) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "asignado_a";
		super.crearRegistro(nombreBaseDatos, tabla, registros);
	}

	@Override
	public String leerTablaBaseDatos(String nombreBaseDatos, String tabla, int numeroAtributos) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "asignado_a";
		return super.leerTablaBaseDatos(nombreBaseDatos, tabla, numeroAtributos);
	}

	@Override
	public void actualizarRegistro(String nombreBaseDatos, String tabla, String atributo, String identificador) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "asignado_a";
		super.actualizarRegistro(nombreBaseDatos, tabla, atributo, identificador);
	}

	@Override
	public void eliminarRegistro(String nombreBaseDatos, String tabla, String identificador) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "asignado_a";
		super.eliminarRegistro(nombreBaseDatos, tabla, identificador);
	}

	
	@Override
	public String toString() {
		
	
	
	
		
		return "(" + this.cientifico.getDNI() + ", " + this.proyecto.getId() + ")";
	}
		
	
}
