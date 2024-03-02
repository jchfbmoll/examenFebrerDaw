/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author joch
 */
public class ejercicio1 {
    
    public static int ejercicio1(String mensaje){
        
        Map<Character, String> code  = new HashMap<>();
        
        int keycode = 1;
        
        for (char i = 'z' ; i>='a'; i--, keycode++){
        
           code.put(i, keycode+"");       
        
        }
        
        int formes = 0;
        
        for (char i = 'a'; i<='z'; i++){
            
            String codigo = "";
            codigo += code.get(i)+"";
            if (codigo.equals(mensaje)){
                formes++;
            } 
           
            for (char j = 'a'; j<='z'; j++){
                String codigo2 = codigo + code.get(j);
                if (codigo2.equals(mensaje)){
                    formes++;
                }
                        
                for (char k = 'a'; k<='z'; k++){                     
                    String codigo3 = codigo2 + code.get(k)+"";
                    if (codigo3.equals(mensaje)){
                        formes++;
                    }
                }
                
                
            }
            
            
        }
        
        return formes;
    }
        
    public static int ejercicio1a(String mensaje){
        int formes = 0;
        
        
        return formes;
    }
        
        
        
    
    
}
