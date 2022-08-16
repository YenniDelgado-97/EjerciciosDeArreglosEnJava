
package arreglo2;

import javax.swing.JOptionPane;


public class Arreglo2 {

    public static void main(String[] args) {
       final int tamano = 10;
       int num[] = new int[tamano];
       
       //Invocar los metodos
       
       rellenarArray(num);
       mostrarArray(num);
       
       
       
    }
    
    public static void rellenarArray(int lista[]){
    
        for(int i=0;i<lista.length;i++ ){
            String texto =JOptionPane.showInputDialog("Digite el numero:");
            lista[i]=Integer.parseInt(texto);
    }
 
   }
    
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++ ){
            System.out.println("En el indice "+ i+ "El numero almacenado es: " + lista[i]);
        }
        
    }
}
