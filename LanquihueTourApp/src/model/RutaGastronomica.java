package model;

// Clase que representa una ruta gastronómica ofrecida por la agencia.
public class RutaGastronomica extends ServicioTuristico {
    
// Número de paradas que contempla la ruta gastronómica.  
 private int numeroDeParadas;   

// Constructor que inicializa los datos de la ruta gastronómica.
    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
        
    }
    
 // Métodos getter y setter

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }
    // Método que muestra la información de la ruta gastronómica 
 @Override
    public void mostrarInformacion() {
        System.out.println("RUTA GASTRONOMICA");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duracion Horas: " + getDuracionHoras ());
        System.out.println("Numero de Paradas: " + numeroDeParadas);
        
 
}


}


