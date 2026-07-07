package model;

// Clase que representa un paseo lacustre ofrecida por la agencia.
public class PaseoLacustre extends ServicioTuristico {
    
// Tipo de embarcación utilizada para realizar el paseo.  
 private String tipoDeEmbarcacion;

// Constructor que inicializa los datos del paseo lacustre.
 public PaseoLacustre(String nombre, int duracionHoras, String tipoDeEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoDeEmbarcacion = tipoDeEmbarcacion;
        
    }
    
 // Métodos getter y setter
        public String getTipoDeEmbarcacion() {
            return tipoDeEmbarcacion;
        }

        public void setTipoDeEmbarcacion(String tipoDeEmbarcacion) {
            this.tipoDeEmbarcacion = tipoDeEmbarcacion;
        }
 
   // Método que muestra la información de paseo lacustre. 
 @Override
    public void mostrarInformacion() {
        System.out.println("PASEO LACUSTRE");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duracion Horas: " + getDuracionHoras ());
        System.out.println("Tipo de Embarcacion: " + tipoDeEmbarcacion);
}
 
}
 


 
 
    
