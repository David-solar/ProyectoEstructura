/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevaGUI;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SONY
 */
public class Control 
{
    static int contfranq=0;
    static int contsuc=0;
    static int contauto=0;
    static String cvef;
    static boolean band=true;
    
    public static void contarcadena(String cadena, int lim)
    {
        if(cadena.length()>=lim)
        {
            JOptionPane.showMessageDialog(null, "HA SOBREPASADO EL LÍMITE DE CARACTERES PERMITIDOS", "ERROR", JOptionPane.ERROR_MESSAGE);
            band=false;
        }
        else
        {
            band=true;
        }
    }
    
}
