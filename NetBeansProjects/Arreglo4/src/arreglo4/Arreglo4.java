
package arreglo4;


public class Arreglo4 {

   
    public static void main(String[] args) {
       int numero []= new int [100];
       
       double suma = 0;
       double media;
       
       // REcorrido del arreglo, asignación de vlores
       for (int i=0;i<numero.length;i++){
           numero[i]= i + 1;
           suma += numero[i];
       }
       
       // calcular la media, mostrar la suma y la media
       
        System.out.println("La suma de lso elementos es: " + suma );
        
        media = suma/numero.length;
        
        System.out.println("la media de los elementos es: " + media );
    }
    
}
