/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pila;

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
  int opcion = 0  ,Nodo = 0;;
      pila pilas = new pila();
      
        do {            
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu de opciones\n\n"
                        + "1. insertar un nodo\n"
                        + "2. eliminar un nodo \n"
                        + "3. la pila se encuentra vacia \n"
                        + "4. mostrar el ultimo valor ingresado \n"
                        + "5. cuantos nodos tiene la pila \n"
                        + "6. vaciar pila \n"
                        + "7. mostrar datos de la pila \n"
                        + "8. salir \n\n"));
                
                switch (opcion) {
                    case 1:
                     Nodo=Integer.parseInt(JOptionPane.showInputDialog(null, " escibre el valor numerico del  nodo"));
                        pilas.Insertar(Nodo);
                     break;
                        case 2:
                        if(!pilas.estaVacia()){
                            JOptionPane.showMessageDialog(null, "se ha eliminado el nodo con valor :"+pilas.eliminar());
                        }else{
                         JOptionPane.showMessageDialog(null, "no se puede elinar nada ,ya que no existe nada");
                        }
                        break;
                         case 3:
                             if(!pilas.estaVacia()){
                                 JOptionPane.showMessageDialog(null,"la pila no esta vacia");
                             }else{
                              JOptionPane.showMessageDialog(null, "la pila esta vacia");
                             }
                        
                        break;
                         case 4:
                        if(!pilas.estaVacia()){
                            JOptionPane.showMessageDialog(null, "el ultimo valor es "+ pilas.MostrarTope());
                            
                        }else{
                            JOptionPane.showMessageDialog(null, "esta vacia la pila,no hay nada que mostrar");
                        }
                        break; case 5:
                        JOptionPane.showMessageDialog(null, "la pila tiene" +pilas.ConocerTamanio() + "nodos");
                        break;
                         case 6:
                        if(!pilas.estaVacia()){
                            pilas.vaciar();
                            JOptionPane.showMessageDialog(null, " se ha vaciado la pila correctamente");
                        }else{
                            JOptionPane.showMessageDialog(null, " la pila esta vacia ,por lo tanto no se puede vaciar");
                        }
                        break;
                         case 7:
                        pilas.Transversal();
                             
                        break;
                        
                         case 8:
                        opcion = 8;
                        break;
                       
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                }
                
                
                
                
            } catch (NumberFormatException e) {
            }
        } while (opcion!= 8);
        
        
        
    }
    
}
