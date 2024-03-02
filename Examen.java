/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;
import static examen.ejercicio1.ejercicio1;
import static examen.ejercicio2.ejercicio2;
import static examen.ejercicio3.ejercicio3;


/**
 *
 * @author joch
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int prueba1 = ejercicio1("111");
        int prueba2 = ejercicio1("526");
        int prueba3 = ejercicio1("777");
        
        System.out.println("Ejercicio 1\n");

        System.out.println("Para el mensaje 111 podemos encontrar " + prueba1 + " combinaciones");
        System.out.println("Para el mensaje 526 podemos encontrar " + prueba2 + " combinaciones");
        System.out.println("Para el mensaje 777 podemos encontrar " + prueba3 + " combinaciones");
        
        
        System.out.println("\nEjercicio 2\n");
        
        
        System.out.println("Para el mensaje (()) la respuesta es " + ejercicio2("(())"));
        System.out.println("Para el mensaje [()] la respuesta es " + ejercicio2("[()]"));
        System.out.println("Para el mensaje ]()[ la respuesta es " + ejercicio2("]()["));
        System.out.println("Para el mensaje ()[] la respuesta es " + ejercicio2("()[]"));
        System.out.println("Para el mensaje ()() la respuesta es " + ejercicio2("()()"));
        System.out.println("Para el mensaje []() la respuesta es " + ejercicio2("[]()"));

        System.out.println("Para el mensaje ((() la respuesta es " + ejercicio2("((()"));
        System.out.println("Para el mensaje )(() la respuesta es " + ejercicio2(")(()"));
        System.out.println("Para el mensaje ((()) la respuesta es " + ejercicio2("((())"));

        System.out.println("Para el mensaje ([][]()) la respuesta es " + ejercicio2("([][]())"));
        System.out.println("Para el mensaje ([][]()( la respuesta es " + ejercicio2("([][]()("));

        
        System.out.println("\nEjercicio 3\n");       
        
        boolean[][] matriu1 = {
            {false, false, false, false},
            {true, true, false, true},
            {false, false, false, false},
            {false, false, false, false}
        };
        
        int[][] inici1 = {{3},{0}};
        int[][] final1 = {{0},{0}};
        
        boolean[][] matriu2 = {
            {false, false, false, false},
            {true, true, false, true},
            {false, false, false, false},
            {false, false, false, false}
        };
        int[][] inici2 = {{3},{1}};
        int[][] final2 = {{0},{3}};
        
        boolean[][] matriu3 = {
            {false, false, false, false},
            {true, true, true, true},
            {false, false, false, false},
            {false, false, false, false}
        };
        int[][] inici3 = {{3},{0}};
        int[][] final3 = {{0},{0}};
        
        boolean[][] matriu4 = {
            {false, false, false, true,  false, false, true},
            {true,  false, false, false, false, false, true},
            {false, false, false, true,  false, false, true},
            {true,  true,  true,  true,  false, true,  true},
            {false, false, false, false, false, false, false},
            {true,  true,  true,  true,  true,  false, false}
        };
        int[][] inici4 = {{0},{0}};
        int[][] final4 = {{5},{6}};
        
        boolean[][] matriu5 = {
            {true, false, false, false, false, false, true},
            {true, false, true, false, false, false, true},
            {true, false, false, false, false, false, false},
            {true, true, true, true, true, true, true},
            {false, false, false, false, false, true, false},
            {true, true, true, true, true, true, true}
        };
        int[][] inici5 = {{1},{0}};
        int[][] final5 = {{4},{6}};
        
        System.out.println("En el caso 1 el numero de pasos necesario es " + ejercicio3(matriu1, inici1, final1));
        System.out.println("En el caso 2 el numero de pasos necesario es " + ejercicio3(matriu2, inici2, final2));
        System.out.println("En el caso 3 el numero de pasos necesario es " + ejercicio3(matriu3, inici3, final3));
        System.out.println("En el caso 4 el numero de pasos necesario es " + ejercicio3(matriu4, inici4, final4));
        System.out.println("En el caso 5 el numero de pasos necesario es " + ejercicio3(matriu5, inici5, final5));
        
    }
    
}
