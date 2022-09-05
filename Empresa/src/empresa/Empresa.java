
package empresa;

import javax.swing.Box;

/**
 *
 * @author josej
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Trabajo trabajo = new Trabajo();
        
      lector archivo = new lector();
         archivo.LeerArchivo( "C:\\Users\\josej\\OneDrive\\Escritorio\\junio.dat ");
           
        
    }
    
}
