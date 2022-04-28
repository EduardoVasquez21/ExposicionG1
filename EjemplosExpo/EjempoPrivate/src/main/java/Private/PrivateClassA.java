/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Private;

/**
 *
 * @author Josss_k4ptalp
 */
public class PrivateClassA {

    public static void main(String[] args) {
        PrivateClassB p = new PrivateClassB();
        p.MostrarPrivate();
        System.out.println(p.value);
    }





static class PrivateClassB {

    private String value = "Java";

    private void MostrarPrivate() {
        System.out.println("Esto es un metodo privado");
    }
}
}

//ANTES DE HACER CAMBIOS

//    public static void main(String[] args) {
//        PrivateClassB p = new PrivateClassB();
//        p.MostrarPrivate();
//        System.out.println(p.value);
//    }
//}
//
//
//
//
//class PrivateClassB {
//
//    private String value = "Java";
//
//    private void MostrarPrivate() {
//        System.out.println("Esto es un metodo privado");
//    }






        


