/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tree;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author josej
 */
public class Tree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer,String> treemap= new TreeMap<Integer,String>();//indicamos que va estar compuesto por un Integer y un String
         
        treemap.put(500, "Lucas");
        treemap.put(250, "Dan");
        treemap.put(800, "Rodolfo"); //con put insertamos 
        System.out.println(treemap);
        
        
        treemap.remove(500);
        System.out.println("-------se elimino un elemento-----");// con remove eliminamos un valor
        System.out.println(treemap);
        
        System.out.println("----");
       System.out.println("el elemento obtenido es:"); // con esto recuperamos un valor
        System.out.println(treemap.get(800));
        System.out.println("-------------------------------");
        if(treemap.containsKey(250)){
            System.out.println("El elemento a obtener es:"+treemap.get(250)); // se hace un if para obtenr un elemento 
        } else{
            System.out.println("no existe");
        }
        System.out.println("----------------");
         if(treemap.containsKey(150)){
            System.out.println("El elemento a obtener es:"+treemap.get(150)); // se hace un if para obtenr un elemento 
        } else{
            System.out.println("no existe un elemento con esa Clave");
            
        }
         System.out.println("para replazar ");
         treemap.replace(800, "el pepe");     //con replace lo que se hace es remplazar un valor ya asignado 
         System.out.println(treemap);
         System.out.println("-----------");
         System.out.println("para vaciar ");
         treemap.clear();
         System.out.println(treemap);
         System.out.println("----agregar de nuevo----");
         treemap.put(1,"Uno");
         System.out.println(treemap);
    }
    
}
