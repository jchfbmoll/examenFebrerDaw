/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author joch
 */
public class ejercicio3 {
    
    public static int ejercicio3(boolean[][] matriu, int[][] inici, int[][] fi){
        
        int pases = lava(matriu, inici, fi);
       
        return pases - 1;
        
    }
    
    public static int lava(boolean[][] matriu, int[][] inici, int[][] fi){
        
        int[][] seguentPasa = {{1,0}, {0,1}, {-1, 0}, {0, -1}};
        
        if (inici[0][0] == fi[0][0] && inici[1][0] == fi[1][0]){
            
            return 1;
            
        }
        
        matriu[inici[0][0]][inici[1][0]] = true;
        
        int minPases = 0;
        
        for (int[] pasa: seguentPasa){
            
            int nextX = inici[0][0] + pasa[0];
            int nextY = inici[1][0] + pasa[1];
            
            if (isValid(matriu, nextX, nextY)){
                int[][] nextCasella = {{nextX}, {nextY}};
                int pases = lava(matriu, nextCasella, fi);
                if (pases != 0 && (minPases == 0 || pases < minPases)) {
                    minPases = pases;
                }
            } 
        }
        
        matriu[inici[0][0]][inici[1][0]] = false; 

       
        return minPases==0 ? 0: minPases+1;
    }
    
    


    public static boolean isValid(boolean[][] matriu, int x, int y) {
        return x >= 0 && x < matriu.length && y >= 0 && y < matriu[0].length && !matriu[x][y];
    }

    
}
