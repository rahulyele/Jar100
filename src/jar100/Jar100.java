/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jar100;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Rauly
 */
public class Jar100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         String property = System.getProperty("user.home") + "\\SystemFileCMP.dat";
        new File(property).createNewFile();
    }
}
