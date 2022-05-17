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
	private int Horas;

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
	public Proyecto(int id, String nombre, int Horas) {
		this.id = id;
		this.nombre = nombre;
		this.Horas = Horas;
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
	public int getHoras() {
		return Horas;
	}



	/**
	 * @param director the director to set
	 */
	public void setHoras(int Horas) {
		this.Horas = Horas;
	}





	@Override
	public void usarBaseDatos(String nombreBaseDatos) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		super.usarBaseDatos(nombreBaseDatos);
	}

	@Override
	public void crearRegistro(String nombreBaseDatos, String tabla, String registros) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "videos";
		super.crearRegistro(nombreBaseDatos, tabla, registros);
	}

	@Override
	public String leerTablaBaseDatos(String nombreBaseDatos, String tabla, int numeroAtributos) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "videos";
		return super.leerTablaBaseDatos(nombreBaseDatos, tabla, numeroAtributos);
	}

	@Override
	public void actualizarRegistro(String nombreBaseDatos, String tabla, String atributo, String identificador) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "videos";
		super.actualizarRegistro(nombreBaseDatos, tabla, atributo, identificador);
	}

	@Override
	public void eliminarRegistro(String nombreBaseDatos, String tabla, String identificador) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "videos";
		super.eliminarRegistro(nombreBaseDatos, tabla, identificador);
	}

	
	@Override
	public String toString() {
		
	
		String titleAux;
		String directorAux;
		
		if(!this.nombre.equals("")) {
			titleAux = "'" + this.nombre + "'";
		}else {
			titleAux = null;
		}
		
		if(!this.nombre.equals("")) {
			directorAux = "'" + this.nombre + "'";
		}else {
			directorAux = null;
		}
		
	
		
		return "(default ," + id + ", " + titleAux + ", " + directorAux+")";
	}
		
	
}
