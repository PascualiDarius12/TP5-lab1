
package tp5.laboratorio1;

public class Arreglo {
    
    
 //a) Método sumarLista que reciba por parámetro un arreglo unidimensional de
//enteros y muestre por pantalla la suma y promedio de los mismos
    public static void sumarLista(int[] unidimensional) {

        int suma = 0;

        for (int i = 0; i < unidimensional.length; i++) {

            suma = unidimensional[i] + suma;

        }

        double promedio = suma / unidimensional.length;

        System.out.println("Suma: " + suma + "\nPromedio: " + promedio);

    }
    
    //b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e
    //irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
    public static int buscarMayor(int[][] bidimensional){
        
        int mayor = bidimensional[0][0];
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                if (bidimensional[i][j]>mayor){
                    mayor=bidimensional[i][j];
                }
                
            }
    
        }
    return mayor;
    }
    
}
