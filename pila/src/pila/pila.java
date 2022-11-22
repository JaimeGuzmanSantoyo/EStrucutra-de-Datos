/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import javax.swing.JOptionPane;

/**
 *
 * @author josej
 */
public class pila{
    private Nodo Ultimo;
    int tamanio = 0;
    String Lista = "";

    public pila() {
        Ultimo = null;
        tamanio = 0;
    }
    
    public boolean estaVacia() {
     return Ultimo== null;
        
        
        
}
    public void Insertar(int nodo){
        Nodo nuevo_Nodo1 = new Nodo(nodo);
        nuevo_Nodo1.siguiente = Ultimo;
        Ultimo = nuevo_Nodo1;
        tamanio ++;
        
        
        
    }
    public int eliminar(){
        int auxiliar = Ultimo.informacion;
        Ultimo = Ultimo.siguiente;
        tamanio--;
        return  auxiliar;
    }
    public int MostrarTope(){
    return Ultimo.informacion;
    }
    public int ConocerTamanio(){
        
        return tamanio;
    }
    public void vaciar(){
        while(!estaVacia()){
            eliminar();
        }
    }
    public void Transversal(){
        Nodo recorrido = Ultimo;
        while(recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
