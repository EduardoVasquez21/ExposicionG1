/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package split;

/**
 *
 * @author COREI5 10TH GEN
 */
public class SPLIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //SEPARACION DE CARACTERES  SPLIT
       
       
       //EJEMPLO 1
        
       
        String cadena = "PROGRAI,PROGRAII,PROGRAIII,,MATEI,MATEII,,";
        String[] split = cadena.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println("MATERIAS: " + split[i]);
        }

          
}
}
    

