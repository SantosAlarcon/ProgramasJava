package milog;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
  public static void main(String[] args) {
    Logger logger = Logger.getLogger("MyLog");
    FileHandler fh;
    
    try {
      // This block configure the logger with handler and formatter
      fh = new FileHandler("MiLog.log", true);
      logger.addHandler(fh);
      logger.setLevel(Level.ALL);
      SimpleFormatter formatter = new SimpleFormatter();
      fh.setFormatter(formatter);
      // the following statement is used to log any messages
      logger.log(Level.SEVERE,"Me pica la punta del santo prepucio.");
      logger.log(Level.INFO,"Me estoy follando a Lala. Por favor, no molestar,"
              + " o me lío a palos");
    } catch (SecurityException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}