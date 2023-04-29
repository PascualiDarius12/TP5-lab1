
package tp5.laboratorio1;


public class PruebaArreglo {

    
    public static void main(String[] args) {
        //ARREGLO UNIDIMENSIONAL:
        int[] unidimensional = new int[10];
        for (int i = 0; i < unidimensional.length; i++) {

            unidimensional[i] = (int) (Math.random() * 25 + 1);
            System.out.print("[" + unidimensional[i] + "]");
        }
        System.out.println("");
        Arreglo.sumarLista(unidimensional);
    }
    
}
