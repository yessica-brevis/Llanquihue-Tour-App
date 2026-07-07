package model;

// Clase que representa una excursión cultural ofrecida por la agencia y hereda de ServicioTuristico.
public class ExcursionCultural extends ServicioTuristico {
    
    private String lugarHistorico;
    
    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
        
    }
    
 // Métodos getter y setter

        public String getLugarHistorico() {
            return lugarHistorico;
        }

        public void setLugarHistorico(String lugarHistorico) {
            this.lugarHistorico = lugarHistorico;
        }
 
    
  // Método que muestra la información de la excursión cultural. 
 @Override
    public void mostrarInformacion() {
        System.out.println("EXCURSION CULTURAL");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duracion Horas: " + getDuracionHoras ());
        System.out.println("Lugar Hitorico: " + lugarHistorico);
}
 
}
    
  
        
        
    
   
    
    
    

