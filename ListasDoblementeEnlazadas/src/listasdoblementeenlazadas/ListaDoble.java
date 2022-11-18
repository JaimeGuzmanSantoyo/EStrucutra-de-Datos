/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdoblementeenlazadas;

import javax.swing.JOptionPane;

/**
 *
 * @author josej
 */
public class ListaDoble {
    private Nodo inicio,fin;

    public ListaDoble() {
        inicio=fin=null;
    }
    //metodos para saber cuando la lista esta vacia
    public boolean  La_Lista_esta_vacia (){
        return inicio == null;
        
    }
    //metodo para agregar al final 
  public void AgregarFinal (int dato){
      if(!La_Lista_esta_vacia()){
          
          fin = new Nodo(dato, null, fin);
          fin.Anterior.Siguiente = fin;
      }else{
          inicio =fin =new Nodo(dato);// en caso de que la lista este vacia 
      }
      
  }public void AgregarInicio(int dato){
      
    if(!La_Lista_esta_vacia()){
          
          inicio = new Nodo(dato, inicio, null);
         inicio.Siguiente.Anterior= inicio;
      }else{
          inicio =fin =new Nodo(dato);// en caso de que la lista este vacia 
      }   
      
      
      
  }//metodo para mostrar la lista de inicio a fin
  public void MostrarLista(){
     if(!La_Lista_esta_vacia()){
         String datos = "<->";
         Nodo auxiliar = inicio;
         while(auxiliar != null){
             datos= datos + "["+auxiliar.dato+"] <->";
             auxiliar= auxiliar.Siguiente;
         }
         JOptionPane.showMessageDialog(null, datos,"Mostrando lista de inciio a fin",JOptionPane.INFORMATION_MESSAGE);
     }
  }
   public void MostrarListaDeFinAInicio( ){
     if(!La_Lista_esta_vacia()){
         String datos = "<->";
         Nodo auxiliar = fin;
         while(auxiliar != null){
             datos= datos + "["+auxiliar.dato+"] <->";
             auxiliar= auxiliar.Anterior;
         }
         JOptionPane.showMessageDialog(null, datos,"Mostrando lista de inciio a fin",JOptionPane.INFORMATION_MESSAGE);
     }
   
}
}






        