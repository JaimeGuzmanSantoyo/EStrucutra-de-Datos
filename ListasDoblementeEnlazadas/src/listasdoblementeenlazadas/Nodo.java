/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdoblementeenlazadas;

/**
 *
 * @author josej
 */
public class Nodo {
    
    
    public int dato;
    Nodo Anterior,Siguiente;
    
    //constructor cuando ya hay nodos
     public Nodo(int dato,Nodo S,Nodo A){
         dato = dato;
         Siguiente = S;
         Anterior = A;
         
         
     }//constructor cuando no hay nodos
    public Nodo (int dato){
        this(dato,null,null);
    }
    
    
}
