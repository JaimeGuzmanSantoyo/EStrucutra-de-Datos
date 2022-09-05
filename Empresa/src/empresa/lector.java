/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author josej
 */
public class lector {
        private BufferedReader Lector; //se encarga de leer 
    private String Linea;//recibe la linea de cada fila exxistente 
    private  String partes[] = null; //se encarga de almacenar cada linea leida 
     public void LeerArchivo(String NombreArchivo){
         try {
             Lector = new BufferedReader(new FileReader(NombreArchivo));
             while((Linea = Lector.readLine())!= null){
             partes = Linea.split(",,");//Se encarga de separar cuando encuentre las comas
         
             imprimirlinea();
                 System.out.println();
             
             }
             Lector.close();
             Linea = null;
             partes=null;
                    
                     
         } catch (Exception e) {
             JOptionPane.showMessageDialog(  null, e) ;
         }
     }    

    private void imprimirlinea() {
        for(int i =0;i<partes.length;i++){
            System.out.println(partes[i]+" / ");
        }
    }
}
    

