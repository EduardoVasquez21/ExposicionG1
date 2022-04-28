package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.Nombre = "Kevin";
        System.out.println("Persona1 nombre: " + persona1.Nombre + "\n");
        CambiarValor(persona1);
        System.out.println("Persona 1 cambio nombre: " + persona1.Nombre);
        
    }

    public static void CambiarValor(Persona persona) {
        Persona persona1 = new Persona();
        persona1.Nombre = "Mauricio";
    }

     
    
}
