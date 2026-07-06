package data;

import java.util.ArrayList;
import model.ServicioTuristico;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;


// Clase encargada de leer los datos
public class GestorServicios {
    
  public ArrayList<ServicioTuristico> generarServicios() {

        ArrayList<ServicioTuristico> servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica("City Tour ", 4 , 5));
        servicios.add(new RutaGastronomica("Ruta del Salmon", 3 , 3));
        servicios.add(new PaseoLacustre("Lago Todos Los Santos", 2 , "Catamaran"));
        servicios.add(new ExcursionCultural("Frutillar ", 6 , "Teatro del Lago")); 
        servicios.add(new RutaGastronomica("Ruta de Miel y Queso ", 4 , 5));
        servicios.add(new PaseoLacustre("Lago Llanquihue ", 3 , "Catamaran Bandurria"));
        servicios.add(new ExcursionCultural("Puerto Varas Patrimonial ", 2 , "Museo Pablo Fierro"));                                                               
        servicios.add(new ExcursionCultural("Llanquihue Historico ", 5 , "Museo del Lago Llanquihue y Monumento a los Colones Alemanes"));
        servicios.add(new PaseoLacustre ("Bahia de Frutillar ", 2 , "Lancha Turistica"));
                
        return servicios;   
        
        
     
    }    
       
}

