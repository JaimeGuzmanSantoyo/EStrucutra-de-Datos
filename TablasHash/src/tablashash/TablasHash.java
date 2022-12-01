
package tablashash;

import java.util.Arrays;

/**
 *
 * @author josej
 */
public class TablasHash {

    /**
     * @param args the command line arguments
     */
    
     String [] Arreglo;
    int tamanio, contador;
    public TablasHash(int tam){
        tamanio = tam;
        Arreglo=new String [tam];
        Arrays.fill(Arreglo,"-1");  
    }
    
    
    public void funcionTablaHash(String[] cadenaArreglo, String[] arreglo){
        int i;
        for (i = 0; i < cadenaArreglo.length; i++) {
            String elemento=cadenaArreglo[i];
            int indiceArreglo=Integer.parseInt(elemento)%7;
            System.out.println("El Valor del Indice es : " + indiceArreglo + 
                    " Para el elemento" + elemento);
            while (arreglo[indiceArreglo] != "-1") {  
                indiceArreglo++;
                System.out.println(" Ocurrio un chcoque  dentro  indice " + 
                        (indiceArreglo-1) + " Modificar el valor del indice: " + 
                        indiceArreglo);
                indiceArreglo%=tamanio;
            }
            arreglo[indiceArreglo] = elemento;
        }
    }
    
    public void mostrarValores(){
        int incremento = 0, i, j;
        for (i = 0; i < 1; i++) {
            incremento += 8;
            for ( j = 0; j < 71; j++) {
                System.out.print("....");
            }
            System.out.println();
            for (j = incremento -8; j < incremento; j++) {
                System.out.format("| %3s" + " ", j);
            }
            System.out.println("|");
            for (int n = 0; n < 71; n++) {
                System.out.print(".....");
            }
            
            System.out.println();
            
            for (j = incremento - 8; j < incremento; j++) {
                if (Arreglo[j].equals("-1")) {
                    System.out.print("|      ");
                }else {
                    System.out.print(String.format("| %3s " + " ", Arreglo[j]));
                }
                
            }
            System.out.println("|");
            for (j = 0; j < 71; j++) {
                System.out.print("");
            }
            System.out.println();
        }
    }
    
    public String buscarHash(String elemento){
        int indiceArreglo=Integer.parseInt(elemento)%7;
        int contador = 0;
        while(Arreglo[indiceArreglo]!="-1"){
            if (Arreglo[indiceArreglo]==elemento) {
                System.out.println("El valor del elemento es: " + elemento + 
                        " se encontro el valor del indice y es : " + indiceArreglo);
                return Arreglo[indiceArreglo];
            }
            indiceArreglo++;
            indiceArreglo%=tamanio;
            contador++;
            if (contador > 7) {
                break;
            }
        }
        return null;
    }
    
    
    
    
    public static void main(String[] args) {
        TablasHash tabla = new TablasHash(10);
        String[] elementos = {"10","43","66","1","88","11","100","22","0","15"};
        tabla.funcionTablaHash(elementos, tabla.Arreglo);
        tabla.mostrarValores();
        
        String buscado=tabla.buscarHash("1000");
        String buscado1=tabla.buscarHash("100");
        String buscado2=tabla.buscarHash("43");
        String buscando3=tabla.buscarHash("1");
        String buscando4=tabla.buscarHash("88");
        String buscando5=tabla.buscarHash("0");
        
        if (buscado == null) {
            System.out.println("El elemento 1000 no se encuentra en la tabla\n " );
        }
        
        System.out.println("Listo ahí estan tus resultados en :)");
    }
    
}
