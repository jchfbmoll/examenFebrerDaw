/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author joch
 */
public class ejercicio2 {
    public static boolean ejercicio2(String mensaje){
        
        int numParentesis = 0;
        int numCorchetes = 0;
        
        for(int i = 0; i<mensaje.length();i++){
            
            if (mensaje.charAt(i)=='('){
                numParentesis++;
                boolean notParentesis = true;
                boolean corchetes = false;
                for(int j = i+1; j<mensaje.length() && notParentesis; j++){
                    if (mensaje.charAt(j)==')'){
                        notParentesis = false;
                    } else if (mensaje.charAt(j)=='['){
                        corchetes = true;
                    } else if (mensaje.charAt(j)==']' && !corchetes){
                        return false;
                    } else {
                        corchetes = false;                        
                    }
                }
                
            } else if (mensaje.charAt(i)=='['){
                numCorchetes++;
                boolean notCorchetes = true;
                boolean parentesis = false;
                for(int j = i+1; j<mensaje.length() && notCorchetes; j++){
                    if (mensaje.charAt(j)==']'){
                        notCorchetes = false;
                    } else if (mensaje.charAt(j)=='('){
                        parentesis = true;
                    } else if (mensaje.charAt(j)==')' && !parentesis){
                        return false;
                    } else {
                        parentesis = false;                        
                    }
                }
                
            } else if (mensaje.charAt(i)==')'){
                
                if (numParentesis==0){
                    return false;
                }                
                numParentesis--;   
                
            } else if (mensaje.charAt(i)==']'){
                
                if (numCorchetes==0){
                    return false;
                }               
                numCorchetes--; 
                
            }    
            
        }

        if (numParentesis != 0 || numCorchetes != 0){
           
            return false;
        }
        
        return true;
    }
}
