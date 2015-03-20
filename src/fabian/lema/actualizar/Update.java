/**
 * 
 */
package fabian.lema.actualizar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author fabian.lema
 *
 */
public class Update {
	    static String s = null;

	    public static void ejecutarUpdate(){
	        
	        try {
	            // Determinar en qué SO estamos
	            String sistemaOperativo = System.getProperty("os.name");

	        String comando = null;

	        // Comando para Linux
	        if (sistemaOperativo.equals("Linux")) {
	            comando = "apt-get update";
	        }
	        // Ejcutamos el comando
	        Process p = Runtime.getRuntime().exec(comando);

	        BufferedReader stdInput = new BufferedReader(new InputStreamReader(
	                p.getInputStream()));

	        BufferedReader stdError = new BufferedReader(new InputStreamReader(
	                p.getErrorStream()));

	        // Leemos la salida del comando
	        System.out.println("Salida del comando:\n");
	        while ((s = stdInput.readLine()) != null) {
	            System.out.println(s);
	        }

	        // Leemos los errores si los hubiera
	        System.out
	                .println("Salida del error del comando (si la hay):\n");
	        while ((s = stdError.readLine()) != null) {
	            System.out.println(s);
	        }

	        System.exit(0);
	    }
	    catch (IOException e

	    
	        ) {
	            System.out.println("Excepción: ");
	        System.exit(-1);

	    }
	}
	}


