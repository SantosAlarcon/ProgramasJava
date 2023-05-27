/*
 * AdivinaElNumeroGUIApp.java
 */

package adivinaelnumerogui;

import javax.swing.UIManager;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class AdivinaElNumeroGUIApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new AdivinaElNumeroGUIView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of AdivinaElNumeroGUIApp
     */
    public static AdivinaElNumeroGUIApp getApplication() {
        return Application.getInstance(AdivinaElNumeroGUIApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(AdivinaElNumeroGUIApp.class, args);
    }

    public Partida par = new Partida();

    public Partida getPar() {
        return par;
    }

    public void setPar(Partida par) {
        this.par = par;
    }
}
