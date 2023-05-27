package cuentabancaria;

import java.util.logging.*;

public class Log {

    static Logger log = Logger.getLogger("MiLog");

    public static void prepararLog() {
        log = Logger.getLogger("MiLog");
    }

    //log.log(Level.OFF, null);
}
