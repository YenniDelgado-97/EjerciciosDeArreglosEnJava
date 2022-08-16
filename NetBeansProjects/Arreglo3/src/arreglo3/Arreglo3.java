
package arreglo3;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;


public class Arreglo3 {


    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite el tamaño del array");
        int num[] = new int [parseInt(texto)];
        
        //llamamos los metodos
        
        
    }
    
    public static void rellenarAleatorioArray(int list [], int a, int b ){
        for (int i=0; i<list.length; i++){
            //generar un numero entre los parametros 0 y 9
            list[i] = ((int) Math.floor(Math.random()*(a-b)+b));
        }
    
    public static void mostrarArray(int list[]){
        for(int i=0;i<list.length;i++ ){
            System.out.println("En el indice "+ i+ "El numero almacenado es: " + list[i]);    
            
    }
    
}
  }
