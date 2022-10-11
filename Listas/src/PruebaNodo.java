
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author josej
 */
public class PruebaNodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int opcion = 0;
       int res;
       ListasSimplementeLigadasADT lista = new ListasSimplementeLigadasADT();
    do {
    
    try{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "\n1 Agregar un elemento al final"
                + "\n2 Agregar un elemento al inico"
                + "\n3 Mostrar todos los datos de la lista"
                + "\n4 Eliminar el primer elemento"
                + " \n5 comprobar si la lista esta vacia "
                + "\n6 Eliminar el ultimo elemento "
                + "\n7  salir "));
        
        
        
        switch (opcion) {
            case 1:
                try{
                  res = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un elelento al final :) "));
                lista.AgregarAlFianl(res);
                }catch(NumberFormatException n ){
                    
                }
                break;
                  case 2:
                res = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESA UN VALOR AL INICIO DE LA LISTA HUMANO :3 : "));
                lista.AgregarAlInicio(res);
                break;
                  case 3:
               lista.mostrarlista();
                break;
                  case 4:
                lista.eleiminar_el_primero();
                break;
                  case 5:
                      
                      lista.EstaVacia();
                break;
                  case 6:
                  lista.EliminarFianl();
                break;
                case 7:
                 opcion = 7 ;
            default:
                 
        }
    }catch(Exception e){
        
    }
    
    
}while(opcion !=7);     // TODO code application logic here
    }

}
