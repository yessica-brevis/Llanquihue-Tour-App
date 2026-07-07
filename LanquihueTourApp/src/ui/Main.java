
package ui;

import data.GestorServicios;
import java.util.ArrayList;
import model.ServicioTuristico;

// Clase principal que ejecuta el sistema Llanquihue Tour.
public class Main {

    public static void main(String[] args) {
 
        // Crea una instancia del gestor de servicios.
        GestorServicios gestor = new GestorServicios();

        // Genera la colección de servicios turísticos.
        ArrayList<ServicioTuristico> servicios = gestor.generarServicios();

        // Muestra el encabezado del listado.
        System.out.println("=== LISTA DE SERVICIOS TURISTICOS ===");

        // Recorre la colección de servicios utilizando polimorfismo.
        for (ServicioTuristico servicioTuristico : servicios) {

            System.out.println("-----------------------------");
            servicioTuristico.mostrarInformacion();
        }
    }
}
  
  

  

 

        
    
    

