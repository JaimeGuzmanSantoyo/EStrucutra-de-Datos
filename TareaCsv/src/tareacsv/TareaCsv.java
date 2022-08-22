/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacsv;

import javax.swing.JOptionPane;

/**
 *
 * @author josej
 */
public class TareaCsv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
 
        datos Dato = new datos();
        NewClass archivo = new NewClass();
        archivo.LeerArchivo( "C:\\Users\\josej\\OneDrive\\Escritorio\\presenciaredes.csv");
        
        
        
        do {     
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,    //JOptionPane.showInputDialog creara la ventana de opciopnes 
                        "---------------MENU DE OPCIONES---------------\n "
                                + "1) mostrar datos de los seguidores de Facebook\n"
                                + "2) mostrar datos del creciento de Facebook en el año 2020\n"
                                + "3) mostrar el porcentaje de Facebook en el año 2020\n"
                                + "4) mostar el crecimineto de las publicaciones     de facebook con respecto a los meses del año 2020\n"
                                + "5) numero de me gusta en publicaciones en Facebook \n"
                                + "6) numero de punblicaiones compartidas  en Facebook a lo largo del 2020\n"
                                + "7) numero comentarios hechos facebook\n"
                                + "8) numero de seguidodes en Twitter por cada mes del año 2020  \n"
                                + "9) crecimineto en cuanto a follower en Twitter \n"
                                + "10) porcentaje de crecimineto en Twitter \n"
                                + "11) Numero de publicaiones en Twitter\n"
                                + "12) numero de Retuits\n"
                                + "13) numero de me gustas en Twitter \n"
                                + "14) numero de impactos en Twitter\n" 
                                + "15) numero de videos en Youtube \n"
                                + "16) numero de visualizaciones en youtube \n "
                                + "17) numero de comentarios en YOUTUBE\n "
                                + "18) Numero de me gusta  \n"
                                + "19) Observar la diferencia que existe entre los follower de Twitter con respecto a los meses de Enero y Junio\n"
                              
                                + "20) Mostrar el cremineto de twitter y Facebook\n"
                               
                                + "21)salir)\n\n"));
                                
                        
                        switch (opcion) {
                    case 1:
                         JOptionPane.showMessageDialog(null,"---------Estos son los seguidores de facebook-------");
                        Dato.MostrarDatosFaceSeguidores();
                        break;
                          case 2:
                               JOptionPane.showMessageDialog(null,"---------Estos son los datos del crecimineto de Facebook-------");
                              Dato.MostrarDatosFaceCrecimineto();
                                break;
                         case 3:
                              JOptionPane.showMessageDialog(null,"---------Este es el porcentaje de Facebook-------");
                             Dato.mostrardatosFacePorcentaje();
                                break;
                         case 4:
                              JOptionPane.showMessageDialog(null,"---------Esta es la cantidad de publicaciones de Facebook por año-------");
                             Dato.FACEBOOKPUBLICACIONES();
                                break;
                          case 5:
                               JOptionPane.showMessageDialog(null,"--------Cantidad de me gusta en facebook de facebook-------");
                              Dato.FaceMeGusta();
                                break;
                         case 6:
                             JOptionPane.showMessageDialog(null,"--------Cantidad de publicaciones compatidas a travess de Facebook -------");
                             Dato.FacePublicacionesCompartidas();
                                break;
                         case 7:
                             JOptionPane.showMessageDialog(null,"--------Cantidad de comentarios compatidas a travess de Facebook -------");
                             Dato.FaceComentariosCompartidos();
                                break;
                        case 8:
                            JOptionPane.showMessageDialog(null,"--------Cantidad de seguidores  en Twitter-------");
                            Dato.Twitter_sEGUIDORES();
                                break;
                        case 9:
                            JOptionPane.showMessageDialog(null,"--------Crecimineto de Twitter -------");
                            Dato.twitter_crecimineto();
                                break;
                         case 10:
                             JOptionPane.showMessageDialog(null,"--------Porcentaje de crecimineto de Twitter-------");
                             Dato.twitter_porcentaje();
                                break;
                         case 11:
                             JOptionPane.showMessageDialog(null,"--------Publicaciones de Twitter-------");
                             Dato.twitter_publicaciones();
                                break;
                         case 12:
                             JOptionPane.showMessageDialog(null,"--------Cantidad de retuits -------");
                             Dato.twitter_retuits();
                                break;
                         case 13:
                             JOptionPane.showMessageDialog(null,"--------Cantidad de me gusta en Twitter -------");
                             Dato.twitter_me_gusta();
                                break;
                         case 14:
                                JOptionPane.showMessageDialog(null,"--------impactos generados en twitter-------");
                             Dato.twitter_impactos();
                                break;
                         case 15:
                             JOptionPane.showMessageDialog(null,"--------Cantidad de videos de Youtube -------");
                             Dato.youtube_video();
                                break;
                          case 16:
                              JOptionPane.showMessageDialog(null,"--------Cantidad de  visualizaciones-------");
                              Dato.youtube_visualizaciones();
                                break;
                        case 17:
                            JOptionPane.showMessageDialog(null,"--------Cantidad de comentarios realizados en Youtube -------");
                            Dato.youtube_comnetarios();
                                break;
                        case 18:
                            JOptionPane.showMessageDialog(null,"--------Cantidad de  me gusta en Youtube -------");
                            Dato.youtube_megusta();
                                break;
                        case 19:
                             JOptionPane.showMessageDialog(null, "el resultado del mes de enero y junio es :");
                             Dato.MostrarDiferenciaDeSeguidores();
                                     break;
                      
                       case 20:
                           JOptionPane.showMessageDialog(null,"--------promedio de crecimineto de Twitter y Facebook------");
                           Dato.PromedioDeCrecimineto();
                                break;
 
                      case 21:
                          opcion = 21;
                                break;
                    default:
                      
                }
                        
            } catch (NumberFormatException e) {
            }
            
        } while (opcion!= 21);
        
        
        
        
        
        
    }
    
}
