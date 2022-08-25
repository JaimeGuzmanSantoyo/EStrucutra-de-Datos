
package arreglo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author josej
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion =5;
        Scanner Al = new Scanner(System.in);
        
        
        String Alumnos[] = new String [10];
        
        
        String AlUMNOS; int posicion = 0;
        
        metodos Metodos = new metodos();
        
        do {            
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "MENU DE OPCIONES PARA LOS ARREGLOS\n\n"
                                + "1. ESCRIBIR LOS DATOS DE LOS ALUMNOS COON SU RESPECTIVO NUMERO DE CUENTA \n "
                                + "2. mostrar la posicion \n"
                                + "3. establecer una nueva posicion para el nuevo alumno \n"
                                + "4. limpiar\n"
                         
                                + "5 salir \n\n "));
                                
            
                switch (opcion) {
                    case 1:
                           for(int i =0;i<8;i++){
            System.out.println((i+1)+"Escriba el nombre del alumno deseado :   ");
            Alumnos[i]=Al.nextLine();
        }
        System.out.println("Escribe el nombre del nuevo alumno:");
        AlUMNOS=Al.nextLine();
        System.out.println("ingresa la posicion que deseas que tome");
        posicion=Al.nextInt();
        for(int i =7;i>=posicion;i--){
        Alumnos[i+1]=Alumnos[i];
                
        }
            
        Alumnos[posicion]= AlUMNOS;
        System.out.println("nuevos alumnos");
        for (int i = 0;i< 9; i++){
        
            System.out.println(Alumnos[i]+"");
        }
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"la posicion del nuevo alumno es la siguiente ");
                        System.out.println("-------------");
                     Metodos.getElemento(posicion);
                     
                        
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Humano elige un nuevo valor para la posicion ");
                        System.out.println("---------------");
                        posicion=Al.nextInt();
                        Metodos.setElemento(posicion);
                        break;
                    case 4:
                        AlUMNOS= null;
                         for(int i =0;i<8;i++){
            System.out.println((i+1)+"Escriba el nombre del alumno deseado :   ");
            Alumnos[i]=Al.nextLine();
                             System.out.println(Alumnos[i]);
        }
                        Metodos.Limpiar();
                        
                        break;
                    case 5:
                        opcion = 5;
                        break;
                        
                    default:
                        throw new AssertionError();
                }
            } catch (NumberFormatException e) {
            }
        } while (opcion!=5);
        
        
   
            
    }
    
    }
}
