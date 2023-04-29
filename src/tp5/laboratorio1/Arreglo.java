
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
    
}
