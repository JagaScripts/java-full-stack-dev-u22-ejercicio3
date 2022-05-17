/**
 * 
 */
package com.team2.u22.ejercicio3.modelo;

import java.sql.Date;
import java.sql.SQLException;

import com.team2.u22.ejercicio3.modelo.gestiondb.ServicioBD;

/**
 * ejercicio1 - com.team2.u22.ejercicio1.modelo - Cliente
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 10/05/2022
 */
public class Cientificos extends ServicioBD{
	
	private String DNI;
	private String nombre;
	private String apellido;
	
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param dirección
	 * @param dni
	 * @param fecha
	 */
	public Cientificos(String nombre, String apellido, String Dni) {
		super();
		this.DNI = Dni;
		this.nombre = nombre;
		this.apellido = apellido;

	}
	public Cientificos() {
		
	}
	/**
	 * @return the id
	 */
	public String getDNI() {
		return DNI;
	}
	/**
	 * @param id the id to set
	 */
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public void usarBaseDatos(String nombreBaseDatos) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		super.usarBaseDatos(nombreBaseDatos);
	}
	@Override
	public void crearRegistro(String nombreBaseDatos, String tabla, String cliente) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "cientificos";
		super.crearRegistro(nombreBaseDatos, tabla, this.toString());
	}
	@Override
	public String leerTablaBaseDatos(String nombreBaseDatos, String tabla, int numeroAtributos) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		
		return super.leerTablaBaseDatos(nombreBaseDatos, tabla, numeroAtributos);
	}
	@Override
	public void actualizarRegistro(String nombreBaseDatos, String tabla, String atributo, String identificador) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		super.actualizarRegistro(nombreBaseDatos, tabla, atributo, identificador);
	}
	@Override
	public void eliminarRegistro(String nombreBaseDatos, String tabla, String identificador) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		super.eliminarRegistro(nombreBaseDatos, tabla, identificador);
	}
	
	@Override
	public String toString() {
		
		String nombreAux;
		String apellidoAux;
		String DniAux;
		
		if(!this.nombre.equals("")) {
			nombreAux = "'" + this.nombre + "'";
		}else {
			nombreAux = null;
		}
		
		if(!this.apellido.equals("")) {
			apellidoAux = "'" + this.apellido + "'";
		}else {
			apellidoAux = null;
		}
	
		if(!this.DNI.equals("")) {
			DniAux = "'" + this.DNI + "'";
		}else {
			DniAux = null;
		}
		
		return "(default ," + DniAux + ", "+ nombreAux + ", " + apellidoAux + ")";
	}
	
	
	

}
