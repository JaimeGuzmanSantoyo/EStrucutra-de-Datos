/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cola;

import javax.swing.JOptionPane;

/**
 *
 * @author josej
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int opcion= 0,nodo_informacion = 0;
        
        Cola cola = new Cola();
        
        do {            
            try {
              opcion =   Integer.parseInt(JOptionPane.showInputDialog(null,"Menu de Cola\n"
                      + "1. Insertar un nodo \n"
                      + "2. extraer un nodo \n"
                      + "3. mostrar el contenido del nodo \n"
                      + "4. salir \n"));
              
              
              
                switch (opcion) {
                    case 1:
                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Humano ingresa un valor a guardar "));
                       cola.Agregarfin(nodo_informacion);
                        break;
                        
                          case 2:
                        if(!cola.EstaVacia()){
                             JOptionPane.showInputDialog(null,"Humano se extrajo un valor:  "+cola.ExtrarElemento());
                        
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
