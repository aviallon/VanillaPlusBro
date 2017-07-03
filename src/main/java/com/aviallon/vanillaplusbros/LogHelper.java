package com.aviallon.vanillaplusbros;

import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
*/
public class LogHelper {
    private static Logger logger = LogManager.getLogger(Reference.MOD_ID);
    /* public static void init(){
        logger.setParent(LogManager);
    }*/

    public static void log(Level logLevel, String message){
        logger.log(logLevel, "[VPB] " + message);
    }
}
