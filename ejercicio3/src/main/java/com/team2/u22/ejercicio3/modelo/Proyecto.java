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
public class Proyecto extends ServicioBD{
	
	private int id;
	private String nombre;
	private int horas;

	/**
	 * 
	 */
	public Proyecto() {
	}
	
	

	/**
	 * @param id
	 * @param title
	 * @param director
	 * @param cliente
	 */
	public Proyecto(int id, String nombre, int horas) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @return the title
	 */
	public String getnombre() {
		return nombre;
	}



	/**
	 * @param title the title to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the director
	 */
	public int gethoras() {
		return horas;
	}



	/**
	 * @param director the director to set
	 */
	public void sethoras(int horas) {
		this.horas = horas;
	}





	@Override
	public void usarBaseDatos(String nombreBaseDatos) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		super.usarBaseDatos(nombreBaseDatos);
	}

	@Override
	public void crearRegistro(String nombreBaseDatos, String tabla, String registros) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "proyecto";
		super.crearRegistro(nombreBaseDatos, tabla, registros);
	}

	@Override
	public String leerTablaBaseDatos(String nombreBaseDatos, String tabla, int numeroAtributos) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "proyecto";
		return super.leerTablaBaseDatos(nombreBaseDatos, tabla, numeroAtributos);
	}

	@Override
	public void actualizarRegistro(String nombreBaseDatos, String tabla, String atributo, String identificador) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "proyecto";
		super.actualizarRegistro(nombreBaseDatos, tabla, atributo, identificador);
	}

	@Override
	public void eliminarRegistro(String nombreBaseDatos, String tabla, String identificador) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "proyecto";
		super.eliminarRegistro(nombreBaseDatos, tabla, identificador);
	}

	
	@Override
	public String toString() {

		String nombreAux;

		if(!this.nombre.equals("")) {
			nombreAux = "'" + this.nombre + "'";
		}else {
			nombreAux = null;
		}

		
		
		return "(default ," + id + ", " + nombreAux + ")";
	}
		
	
}
