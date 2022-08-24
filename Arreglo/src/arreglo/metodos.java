/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo;

/**
 *
 * @author josej
 */
public class metodos {
    public int tamano = 0;
    
    
    public String elemento;

    public metodos() {
    }

    public metodos(String elemento) {
        this.elemento = elemento;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(int posicion) {
        System.out.println(posicion);
    }

      public  void getElemento(int posicion) {
           System.out.println(posicion);
    }
      public void Limpiar(){
          
      }
    
   
    
    @Override
    public String toString() {
        return "metodos{" + "tamano=" + tamano + ", elemento=" + elemento + '}';
    }



  
    
    
}
