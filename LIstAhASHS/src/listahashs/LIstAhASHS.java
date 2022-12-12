/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listahashs;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author josej
 */
public class LIstAhASHS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Map<Integer,String> linked = new LinkedHashMap<Integer, String>();
        
        linked.put(9, "ZEUS");
        linked.put(1, "Hades");
        linked.put(10, "Poseidon");
        linked.put(5, "Gaia");
        
        System.out.println(linked);
        System.out.println("............");
        System.out.println("se obtine a : "+linked.get(9)); // obtener un elemento 
        System.out.println(".....");
        linked.remove(5); // se elimino un elemento
        System.out.println(linked);
        System.out.println("------------------------");
        linked.replace(10, "Ares");     //se hace un remplazo 
        System.out.println(linked);
        System.out.println("-.-.-.-.-.-.--.-.-.-.-.-.-.");
        linked.remove(1,"Hades");
        System.out.println(linked); 
        System.out.println("-------------------");
        linked.clear(); //para limpiar
        if (linked.isEmpty()){
            System.out.println("no hay nada en esta estructura humano");
        }
        
    }
    
}
