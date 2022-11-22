/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola;

import javax.swing.JOptionPane;

/**
 *
 * @author josej
 */
public class Cola {
    private Nodo inicioCola,finCola;
    String Cola = "";

    public Cola() {
        inicioCola = null;
        finCola = null;
    }
    public boolean EstaVacia(){
        return inicioCola == null;
    } 
    public void Agregarfin(int informacion){
        Nodo nuevoNodo = new  Nodo();
        nuevoNodo.informacion = informacion;
        nuevoNodo.siguiente = null;
        
        
        if(EstaVacia()){
           inicioCola = nuevoNodo; 
           finCola = nuevoNodo;
        }else{
            finCola.siguiente= nuevoNodo;
            finCola = nuevoNodo;
        }
    }
    public int ExtrarElemento(){
        if(!EstaVacia()){
            int info = inicioCola.informacion;
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
}
