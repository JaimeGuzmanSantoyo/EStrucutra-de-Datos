/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coladeprioridad;

import java.util.PriorityQueue;
import javax.swing.JOptionPane;

/**
 *
 * @author josej
 */
public class MetodosCola {
    
    private Nodo inicioCola,finCola;
    String Cola = "";
    PriorityQueue<Object> pr = new PriorityQueue<>();
    public MetodosCola() {
    inicioCola = null;
    finCola = null;
            
    
    }
    public boolean estaVacia(){
        return inicioCola==null;
    }
    public void agregar(int PriorityQueue ,int informacion){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.prioridad = PriorityQueue;
        nuevoNodo.informacion = informacion;
        nuevoNodo.siguiente =null;
        
        if(estaVacia()){
           inicioCola = nuevoNodo; 
           finCola = nuevoNodo;
        }else{
            finCola.siguiente= nuevoNodo;
            finCola = nuevoNodo;
        }
    }
    
    public int Sacar(int PriorityQueue ){
     if(!estaVacia()){
            int info = inicioCola.prioridad;
            if(inicioCola == finCola){
                inicioCola = null;
                finCola= null;
            
        }else{
            inicioCola = inicioCola.siguiente;
        }return  info;
        }else{
              return Integer.MAX_VALUE;  
                }
    }   
    
public void MostrarDAatos(){
        Nodo recorrido = inicioCola;
        String ColaImpresa = "";
        while(recorrido!=null){
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
            
        }
        String Cadena[]=Cola.split(" ");//separar ,invertir la cadena
    for(int i = Cadena.length -1;i>=0; i--){
        ColaImpresa += "  " + Cadena[i];
        
    }
        JOptionPane.showMessageDialog(null,ColaImpresa);
       Cola = "";
    
    }

    boolean Sacar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
