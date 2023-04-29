
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
        
        //ARREGLO BIDIRECCIONAL IRREGULAR:
        
        
        System.out.println("\n");
        int arreglo[][] = new int[3][];

        arreglo[0] = new int[3];
        arreglo[1] = new int[5];
        arreglo[2] = new int[2];

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] = (int) (Math.random() * 100 + 1);
                System.out.print("[" + arreglo[i][j] + "]");

            }
            System.out.println("");
        }
        System.out.println("Numero mayor:" + Arreglo.buscarMayor(arreglo));
    }
    
}
