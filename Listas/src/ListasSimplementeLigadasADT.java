/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josej
 */
public class ListasSimplementeLigadasADT <T> {
    private Nodo<T> head;
    Nodo<T>nuevo = new Nodo ( );
            Nodo<T> aux = this.head;
    int tamanio;
    protected Nodo inicio,fin;
    public ListasSimplementeLigadasADT  (){
            
    }
    public boolean EstaVacia(){
     return  this.head == null;
    }
    public int getTamanio(){
        return this.tamanio ;
    }
    public void AgregarAlFianl(T valor){
        if(this.head != null){
            head = new Nodo <>(valor);
            
        }else{
            Nodo<T> nuevo = new Nodo (valor);
            Nodo<T> aux = this.head;
            while(aux.getSiguiente()!= null){
                aux= aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            
        }
    }
    public void AgregarAlInicio(T valor){
        if(head == null){
            head = new Nodo(valor);
            
        }else{
            Nodo<T> nuevo = new Nodo  (valor);
            
            nuevo.setSiguiente(nuevo);
            head = nuevo;
        }
    }
    public void AgregarDespuesDe(T referencia, T valor ){
        
        
        
        
        
    }
    public void Elinar(T posicion ){
        
    }
    public void eleiminar_el_primero(){
      if( this.head != null){
         Nodo<T> Nuevo = head;
         Nuevo = head.getSiguiente();
      
          System.out.println((Nuevo));
        }else{
          System.out.println(" esta Vacio");
      }
        
        
    }
    public void EliminarFianl(){
        while(head == null){
            Nodo<T> nuevo2 = fin;
           fin = fin.getSiguiente();
        }
        fin.setSiguiente(null);
    } 
   
public void mostrarlista(){
        Nodo recorrer =inicio;
        System.out.println();
        while(recorrer!=null){
            System.out.print("["+recorrer.getDato()+"]--->");
            recorrer=recorrer.getSiguiente();
        }
    }
     
     
 }
 
       
    
    
    

