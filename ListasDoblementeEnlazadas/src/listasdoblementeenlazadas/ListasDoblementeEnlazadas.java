/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasdoblementeenlazadas;

import javax.swing.JOptionPane;

/**
 *a
 * @author josej
 */
public class ListasDoblementeEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        
        int opcion = 0,elemento;
        
        
        
        do {            
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,""
                        + "\n1. agregar un nodo al inicio"
                        + "\n2. agregar al final "
                        + "\n3. Mostrar lista de inico a fin"
                        + "\n4. mostrar lista de fin a inicio"
                        + "\n5. salir"
                + "que deseas hacer?",
                        JOptionPane.INFORMATION_MESSAGE));
                
               switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Humano ingresa un numero",JOptionPane.INFORMATION_MESSAGE));
                        lista.AgregarInicio(elemento);
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Humano ingresa un numero",JOptionPane.INFORMATION_MESSAGE));
                        lista.AgregarFinal(elemento);
                        break;
                         case 3:
                        if(!lista.La_Lista_esta_vacia()){
                            lista.MostrarLista();
                        }else{
                             JOptionPane.showMessageDialog(null, "No hay nada humano");
                        }
                        break;
                         case 4:
                        if(!lista.La_Lista_esta_vacia()){
                            lista.MostrarListaDeFinAInicio();
                        }else{
                             JOptionPane.showMessageDialog(null, "No existe nada Humano");
                        }
                        break;
                         case 5 :
                        opcion = 5;
                        break;
                        
                    default: 
                 JOptionPane.showMessageDialog(null, "La opcion no esta en el menu","error",JOptionPane.INFORMATION_MESSAGE);
                }
             } catch (Exception e ) {
                
             
            }
        } while (opcion!=5);
        
    }
    
}
