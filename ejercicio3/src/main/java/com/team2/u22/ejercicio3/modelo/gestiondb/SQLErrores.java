/**
 * 
 */
package com.team2.u22.ejercicio3.modelo.gestiondb;

/**
 * java-full-stack-dev-u18 - modelo.gestiondb - SQLErrores
 * 
 * Interfaz con los mensajes de error de la base de datos.
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 29/04/2022
 */
public interface SQLErrores {
	
	/**
     * Error en la sentencia SQL.
     */
    public static final String ERROR_SQL_SENTENCIA
            = "Error al ejecutar la sentencia SQL.";
    /**
     * Error al cerrar la conexión SQL.
     */
    public static final String ERROR_SQL_CERRAR_CONEXION
            = "Error al cerrar la sentencia o conexión.";
    /**
     * Error enlace columnas y propiedades.
     */
    public static final String ERROR_SQL_ENLACE
            = "Error al enlazar las propiedades con las columnas resultantes.";
    /**
     * Error con el SQL driver.
     */
    public static final String ERROR_SQL_DRIVER
            = "No se encontró la clase para iniciar la conexión.";
    /**
     * Error al abrir conexión la SQL.
     */
    public static final String ERROR_SQL_ABRIR_CONEXION
            = "Error al iniciar la conexión de MySQL.";

}
