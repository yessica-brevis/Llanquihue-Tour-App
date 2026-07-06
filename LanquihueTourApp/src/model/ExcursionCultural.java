package model;

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
 
    
   // Método toString para mostrar la información del objeto 
 @Override
    public void mostrarInformacion() {
        System.out.println("EXCURSION CULTURAL");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duracion Horas: " + getDuracionHoras ());
        System.out.println("Lugar Hitorico: " + lugarHistorico);
}
 
}
    
  
        
        
    
   
    
    
    

