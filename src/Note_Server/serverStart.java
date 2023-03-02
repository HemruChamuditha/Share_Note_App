/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Note_Server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hemru
 */
public class serverStart {
    public static void main(String[] args) {
        try {
            Registry noteRegisty = LocateRegistry.createRegistry(5050);
            System.out.println("Server starting...");
            noteRegisty.rebind("NoteServer", new NoteControllerImpl());
        } catch (RemoteException ex) {
            Logger.getLogger(serverStart.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }
    
}
