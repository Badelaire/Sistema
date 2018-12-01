/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Modelo.Manager;
import java.io.FileNotFoundException;

/**
 *
 * @author César
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String url = null;
        String publicidad= null;
        try{
            url = args[0];
            publicidad = args[1];
        }catch(ArrayIndexOutOfBoundsException ex){
            System.err.println("documento.txt requerido");    
        }
        Manager manager= new Manager(url, publicidad);
        manager.run();
    }
}