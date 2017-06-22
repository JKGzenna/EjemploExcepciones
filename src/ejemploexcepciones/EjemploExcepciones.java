package ejemploexcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JUAN
 */
public class EjemploExcepciones {

    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // surround statement = rodear sentencia
        try {
            String s = br.readLine();
            int a = 5/0;
        } catch (IOException ex) {
            Logger.getLogger(EjemploExcepciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArithmeticException ex2){
            System.out.println("No se puede hacer una división entre 0!!!!");
        }
    }
    
}
