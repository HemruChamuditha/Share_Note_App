/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Hemru
 */
public interface NoteController extends Remote {
    public void setNote(String note) throws RemoteException;
    public String getNote() throws RemoteException;
}
