/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_java;

import java.util.ArrayList;

/**
 *
 * @author COREI5 10TH GEN
 */
public class ArrayList_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //DECLARACION DE ARRAYLIST
        ArrayList<String> cadenas;

        //CREAMOS LA INSTANCIA
        cadenas = new ArrayList<String>();

        //AGREGAMOS ELEMENTOS
        cadenas.add("ESTA");
        cadenas.add("ES");
        cadenas.add("UNA");
        cadenas.add("PRUEBA");

         
         //    ELIMINAR ELEMENTOS
         
      //  cadenas.remove(3);
        
        
        
        //RECORREMOS ARRAYLIST CON FOR
        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println("-->" + cadenas.get(i) + "<--");
        }

        
        
        
      
    }

}
