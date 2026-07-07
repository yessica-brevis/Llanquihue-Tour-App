
package model;

public class ServicioTuristico {
    // Atributos de la clase
    private String nombre;
     private int duracionHoras;
    
    // Constructor con parámetros
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }
    
    // Métodos getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }


   
   // Método que muestra la información general del servicio turístico. 
 
    public void mostrarInformacion() {
        System.out.println("Servicio Turistico");
        System.out.println("Nombre: " + nombre);
        System.out.println("Duracion: " + duracionHoras + "hrs.");
    
        
    }
    
    }
    
    
                
        
    

    
    
    
    

