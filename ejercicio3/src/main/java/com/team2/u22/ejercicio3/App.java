package com.team2.u22.ejercicio3;

import com.team2.u22.ejercicio3.controlador.CientificosControler;
import com.team2.u22.ejercicio3.controlador.ProyectoControler;
import com.team2.u22.ejercicio3.controlador.AsignadoAControlador;
import com.team2.u22.ejercicio3.modelo.AsignadoA;
import com.team2.u22.ejercicio3.modelo.Cientificos;
import com.team2.u22.ejercicio3.modelo.Proyecto;
import com.team2.u22.ejercicio3.vista.Vista;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	public void run() {
			try {
				Vista frame = new Vista();
				frame.setVisible(true);
				Cientificos cientifico = new Cientificos();
				Proyecto proyecto = new Proyecto();
				AsignadoA asignadoa = new AsignadoA();
				CientificosControler cc = new CientificosControler(cientifico, frame);
				ProyectoControler pc = new ProyectoControler(proyecto, frame);
				AsignadoAControlador ac = new AsignadoAControlador(cientifico, proyecto, frame);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    }
}
