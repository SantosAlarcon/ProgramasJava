/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemploclase;

/**
 *
 * @author FutuzorMekkla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PC pc_guapo = new PC("Intel Core i7", 4096, "AMD 5770", 1024, Lector.DVD_RAM);
        
        System.out.println(pc_guapo.toString());
    }

}
