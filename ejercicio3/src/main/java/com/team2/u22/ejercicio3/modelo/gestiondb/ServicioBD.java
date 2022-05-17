/**
 * 
 */
package com.team2.u22.ejercicio3.modelo.gestiondb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * ejercicio1 - com.team2.u22.ejercicio1.modelo.gestiondb - ServicioBD
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 10/05/2022
 */
public class ServicioBD implements IObjetoAccesoDatos{
	
	private Connection conexion;
	
	/**
	 * 
	 */
	public ServicioBD() {
		this.setConexion(GestionSql.abrirConexion());
	}

	/**
	 * @param conexion
	 */
	public ServicioBD(Connection conexion) {
		this.setConexion(conexion);
	}

	@Override
	public void usarBaseDatos(String nombreBaseDatos) throws SQLException{
	
		String queryDb = "USE " + nombreBaseDatos + ";";

		Statement statement = this.getConexion().createStatement();
		statement.executeUpdate(queryDb);
			
		
	}

	
	
	@Override
	public void crearRegistro(String nombreBaseDatos, String tabla, String registros) throws SQLException{
		

		// Database use statement
		String consultaCrearRegistros = "INSERT INTO " + tabla + " VALUES " + registros + ";";
		this.ejecutarConsulta(consultaCrearRegistros, nombreBaseDatos);
		
	}

	@Override
	public String leerTablaBaseDatos(String nombreBaseDatos, String tabla, int numeroAtributos) throws SQLException{
		String resultadoConsulta = "";

			// Database use statement SELECT * FROM

			this.usarBaseDatos(nombreBaseDatos);

			Statement statement = this.getConexion().createStatement();
			String consultaSeleccionarRegistros = "SELECT * FROM " + tabla + ";";
			//PreparedStatement ps = conexion.prepareStatement(querySelect);
			ResultSet resultado = statement.executeQuery(consultaSeleccionarRegistros);
			
			//Por cada fila de datos
			while (resultado.next()) {
				//Miramos sus atributos --> numAtributos es el numero de atributos que tiene
				for (int i = 1; i <= numeroAtributos; i++) {
					
					resultadoConsulta += resultado.getString(i) + " ";
			
				}
				
				resultadoConsulta += "\n";//Salto de linea
				
			}

	
		return resultadoConsulta;
		
	}

	@Override
	public void actualizarRegistro(String nombreBaseDatos, String tabla, String atributo, String identificador) throws SQLException{

			// Database use statement
			String consultaActualizarRegistros = "UPDATE " + tabla + " SET " + atributo + " WHERE " + identificador + " ;";
		
			this.ejecutarConsulta(consultaActualizarRegistros, nombreBaseDatos);

	}
	
	@Override
	public void eliminarRegistro(String nombreBaseDatos, String tabla, String identificador) throws SQLException {
		
			// Database use statement
			String consultaEliminarRegistros = "DELETE FROM " + tabla + " WHERE " + identificador + " ;";
			this.ejecutarConsulta(consultaEliminarRegistros, nombreBaseDatos);

		
		
	}

	private void ejecutarConsulta(String consulta, String nombreBaseDatos) throws SQLException {
		
		this.usarBaseDatos(nombreBaseDatos);
	
		Statement statement = this.getConexion().createStatement();
		statement.executeUpdate(consulta);
		
	}

	/**
	 * @return the conexion
	 */
	public Connection getConexion() {
		return conexion;
	}

	/**
	 * @param conexion the conexion to set
	 */
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public boolean cerrarConexion() {
		return GestionSql.cerrarConexion(getConexion());
	}
}

