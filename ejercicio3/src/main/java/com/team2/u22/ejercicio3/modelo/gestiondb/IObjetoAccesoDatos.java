/**
 * 
 */
package com.team2.u22.ejercicio3.modelo.gestiondb;

import java.sql.SQLException;

/**
 * java-full-stack-dev-u18 - modelo.gestiondb - IObjetoAccesoDatos
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 29/04/2022
 * 
 * Interfaz que define las operaciones de interacción con la base de datos.
 * * @param <T> Tipo de datos que manejará.
 * 
 */
public interface IObjetoAccesoDatos {
	
	
	void usarBaseDatos(String nombreBaseDatos) throws SQLException;
	

	/**
	 * Función para insertar objetos.
	 *
	 * @param elemento Elemento con los datos que se desean insertar
	 */
	void crearRegistro(String nombreBaseDatos, String tabla, String registro) throws SQLException;
	


    /**
     * Función para actualizar un elemento.
     *
     * @param elemento Elemento con los datos que se desean actualizar.
     */
	void actualizarRegistro(String nombreBaseDatos, String tabla, String atributo, String identificado) throws SQLException;

    
    
    /**
     * Función para eliminar un objeto.
     *
     * @param id String valor del filtro.
     */
    void eliminarRegistro(String nombreBaseDatos, String tabla, String identificador) throws SQLException;

    /**
     * Función para leer registros de la base de datos.
     *
     * @return List con los objetos cargados.*/
    
    String leerTablaBaseDatos(String nombreBaseDatos, String tabla, int numeroAtributos) throws SQLException; 
  

}
