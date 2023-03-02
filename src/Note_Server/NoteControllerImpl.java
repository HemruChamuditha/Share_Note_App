/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Note_Server;

import common.NoteController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Hemru
 */
public class NoteControllerImpl extends UnicastRemoteObject implements NoteController{

    private String note = "empty";
    public NoteControllerImpl() throws RemoteException{
        
    }
    
    @Override
    public void setNote(String note) throws RemoteException {
        this.note = note;
    }

    @Override
    public String getNote() throws RemoteException {
        return note;
    }
    
}
