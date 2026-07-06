package model;

public class RutaGastronomica extends ServicioTuristico {
    
 private int numeroDeParadas;   

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
    
   // Método toString para mostrar la información del objeto 
 @Override
    public void mostrarInformacion() {
        System.out.println("RUTA GASTRONOMICA");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duracion Horas: " + getDuracionHoras ());
        System.out.println("Numero de Paradas: " + numeroDeParadas);
        
 
}


}


