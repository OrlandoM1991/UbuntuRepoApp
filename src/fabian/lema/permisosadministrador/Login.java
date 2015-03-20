/**
 * 
 */
package fabian.lema.permisosadministrador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author fabian.lema
 *
 */
public class Login {

	/**
	 * @param args
	 */
	static String s = null;
public static void ejecutarSudo(){
	        
	        try {
	            // Determinar en qué SO estamos
	            String sistemaOperativo = System.getProperty("os.name");

	        String comando = null;

	        // Comando para Linux
	        if (sistemaOperativo.equals("Linux")) {
	            comando = "xterm su root";
	        }
	        /*// Pedimos la contraseña de administrador
	        
	        //Creamos una instancia de Scanner
	        Scanner in = new Scanner(System.in);
	        //Declaramos las variables a usar
	        String contraseñaRoot;
	        //Preguntamos al usuario
	        System.out.println("Por favor introduce la contraseña de root");
	        contraseñaRoot = in.next();
	        //Cerramos instancia
	        in.close();*/
	        //Hacemos que el usuario se loguee como administrador
	        System.out.println("Por favor logueate como usuario root");
	        // Ejecutamos el comando
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
