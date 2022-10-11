/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.listas;

/**
 *
 * @author Cabrera
 */
public class PruebasNodo {
    public static void main(String[] args) {
        Nodo<Integer> head = new Nodo(10); // se anota el primer valor de nodo ,con un valor de 10,dicho nodo ,esta compuestp por Nodo y Siguiente 
        head.setSiguiente(new Nodo(20,null));// head asi se llama la parte inicial de la lista ,head.setsiguiente(New nodo(20,null)) decimos que se cre un nuevo nodo con Nodo valor 20 y siguiente null ,es decir siguiente esta vacio
        head.getSiguiente().setSiguiente(new Nodo(30));//el siguiente nodo es head.getsiguiente().setsiguiente(new nodo(30)) nuevo nodo con valor 30
        System.out.println( head.getSiguiente().getSiguiente().getDato() );// para que imprima 
        head.getSiguiente().getSiguiente().setSiguiente(new Nodo(5,new Nodo(6))); //se hizo de esta manera para generar dos Nodos en una sola linea 
        Nodo<Integer> aux = head; //se dice que aux va ser igual que head,ya que si se mueve head se pierde el orden de las lista 
        while (aux.getSiguiente() != null) { //mientras que aux.getsiguiente()!= null ,aux va ser = aux.getsiguiente(); mostrar el estado actual de siguiente 
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(new Nodo(19));// si eso se cumple aux.setsiguiente toma el valor de 7 
        
        aux = head; // como dije aux toma el valor de head para que no desaparezca la lista 
        System.out.println("Unam super god...");
        while (aux != null) {
            System.out.print(aux);//imprime el valor el valor de aux
            aux = aux.getSiguiente();
        }
        
    }
    
   
}