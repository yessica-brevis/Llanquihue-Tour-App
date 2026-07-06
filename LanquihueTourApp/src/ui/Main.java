
package ui;

import data.GestorServicios;
import java.util.ArrayList;
import model.ServicioTuristico;

public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        ArrayList<ServicioTuristico> servicios = gestor.generarServicios();

        System.out.println("=== LISTA DE SERVICIOS TURISTICOS ===");

        for (ServicioTuristico servicioTuristico : servicios) {

            System.out.println("-----------------------------");
            servicioTuristico.mostrarInformacion();
        }
    }
}
  
  

  

 

        
    
    

