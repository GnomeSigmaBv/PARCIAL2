
package carbondcalbon;

public class Carbondcalbon {

  
    public static void main(String[] args) {
            
        int MATRIZ [][]={{5, 7, 9}, 
                        {4, 2, 1}, 
                        {1, 1, 1}};
        
//        
//        for (int R = 0; R < MATRIZ.length; R++) {
//            for (int M = 0; M < MATRIZ.length; M++) {
//                
//            }
            System.out.println(MATRIZ);
//        }
//        
        
    }
    
    public static String devolver(int matriz[][]){
        
        for (int R = 0; R < matriz.length; R++) {
             matriz = matriz + String.valueOf(matriz[R][R]);
        }
        
        return matriz;
    }
    
}
