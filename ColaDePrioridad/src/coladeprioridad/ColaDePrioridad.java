/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coladeprioridad;

import java.util.PriorityQueue;
import javax.swing.JOptionPane;

/**
 *
 * @author josej
 */
public class ColaDePrioridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PriorityQueue qp = new PriorityQueue();
        
        qp.add(5);
        qp.add(1);
        qp.add(7);
        qp.add(3);
        
        
        System.out.println(qp);
        int opcion = 0,nodoInformacion = 0;
        MetodosCola cola = new MetodosCola();
        
        do {            
            try {
              opcion =   Integer.parseInt(JOptionPane.showInputDialog(null,"Menu de Cola\n"
                      + "1. Insertar un nodo \n"
                      + "2. extraer un nodo \n"
                      + "3. mostrar el contenido del nodo \n"
                      + "4. salir \n"));
              
              
              
                switch (opcion) {
                    case 1:
                        nodoInformacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Humano nodo con un valor de prioridad  "));
                       cola.agregar(opcion, nodoInformacion);
                        
                          case 2:
                        if(!cola.Sacar()){
                             JOptionPane.showInputDialog(null,"Humano se extrajo un valor:  "+cola.Sacar());
                        
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola esta vacia ,por lo que no se puede sacar nada ");
                        }
                        break;
                        
                        
                          case 3:
                        cola.MostrarDAatos();
                        break;
                        
                        
                          case 4:
                        opcion  = 4 ;
                        break;
                    default:
                        JOptionPane.showInputDialog(null,"la opcion no esta disponible");
                }
            } catch (NumberFormatException e) {
            }
        } while (opcion !=4);
    }
    
}

    
    
