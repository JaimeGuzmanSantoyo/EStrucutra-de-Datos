/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pf;

import java.util.HashMap;

/**
 *
 * @author josej
 */
public class PF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap <Integer,String>map= new HashMap<>(); //le metemos dos parametros ya que al ser un hash este se compone por una clave y un valor 
        map.put(1500, "Jimmy"); //con esto ya estamos agregando al 1er elemento a nuestro Hashmap
        map.put(2600,"Diego");
        map.put(5600, "Evelyn");
        
        System.out.println(map);
        System.out.println("---------------");
        System.out.println("el elemento encontrado es:");
        System.out.println(map.get(5600)); //con esto obtenemos un solo elemento ,aquel que tenga el mismo valor o clave
        
        System.out.println("---------------------------------------");
        map.remove(2600); //eliminamos del hash
        System.out.println(map);
        System.out.println("-------------------------------");
        
        if(map.containsKey(1500)){
            System.out.println("el nombre del elemento a obtener es:"+map.get(1500)); //con esto lo que hacemos es buscar un elemento por su clave 
        }
        System.out.println("-------------------------------");
        
        if (map.containsKey(100)) {
            System.out.println("es:"+map.get(100));
           
                                                           //se mapea una clave,al no existir se imprime en pantalla un mensaje que indique que no existe elemento con tal clave
        } else{
            System.out.println("no hay ningun elemento con esa clave ");
        }
        System.out.println("------------------------------------------");
              for (Integer indice: map.keySet()) {
                  System.out.println(map.get(indice)); // un segundo metodo para imprimir en pantalla los elementos del hash
        }
        
    }
    
}
