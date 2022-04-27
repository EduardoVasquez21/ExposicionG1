/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoclase1;

import java.text.Normalizer;
import java.util.Scanner;

/**
 *
 * @author Vkaiido
 */
public class Main {
    public static void main(String[] args){
        
        //EXPOSICION
        
        /*String srcstring="Esta es una prueba acerca de separar";
        String [] stringArray =srcstring.split(" ");
        for (String stemp:stringArray){
            //Uso de la funcion Split() en Java 2
            System.out.println(stemp);
        
        }*/
        
        //Separando por puntos ejemplo IP
        
        /*String ipString= "59.64.159.224";
        String[] ipArray= ipString.split("\\.");
        for(String stemp:ipArray){
        System.out.println(stemp);
        
        }*/
        
        
        
        //Ejemplos de split
        
       /* String st = "Este/ es/ un/ ejemplo/ de/ Split";
        //String st = "Este - es - otro/ ejemplo/ de/ Split";
        //String st = "Este/ es/ un, tercer/ ejemplo/ de/ Split";
        String [] partes = st.split("/");
        for (int i = 0; i < partes.length; i++) {
            //System.out.println(partes[i]);
            //System.out.println(partes[4]);
            //System.out.println(partes[i]+"\n");
            System.out.println(partes[1]+"-"+partes[3]+"/"+partes[4]);
        }*/
       
        
        //Ejemplo de SPLIT CON NUMEROS DE TELEFONO
       
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero telefonico: ");
        String numeroTelefonico1 = scanner.nextLine();
        //String numeroTelefonico1 ="503-78911537";
        //String numeroTelefonico2 ="504-78654737";
        String[] numero1 = numeroTelefonico1.split("-");
        //String [] numero2 = numeroTelefonico2.split("-");
        
        if(numero1[0].equals("503")){
            System.out.println("El numero ingresado es de el salvador");
        }else if(numero1[0].equals("504")){
            System.out.println("El numero ingresado es de Honduras");}
    else{
            System.out.println("El numero es de otro país");}*/
        
        
        /*
        String srcstring="Esta es una prueba acerca de separar";
        String [] stringArray =srcstring.split(" ");
        for (String stemp:stringArray){
            System.out.println(stemp);
        
        }*/
        
        
        //ejemplo de is empty
        //checkString("Eduardo");
        //checkString("");
        //checkString(null);
        //checkString("  ");
        
        
       //Ejemplo de Replace
       //Replace se encarga de buscar un delimitador y sustituirlo
       /*String oldString1 = "My name is Sam & I am a software developer.";

        String newString1 = oldString1.replace(" &", ",");

        System.out.println(newString1);*/

    
    
        
}
    //Ejemplo de null, is empty y isBlank
    

    /*public static void checkString (String name){
   
        //if(!name.isEmpty()&& name!=null){
        //if(name!=null && !name.isEmpty()){
        //if(!name.isEmpty()&& name!=null && !name.isBlank()){
    if(name!=null && !name.isEmpty()&& !name.isBlank()){
    
        System.out.println("El nombre guardado es "+name);
    } else{
        System.out.println("campo invalido");
    }*/
    
    
   
}
