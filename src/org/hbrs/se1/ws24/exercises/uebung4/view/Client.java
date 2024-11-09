package org.hbrs.se1.ws24.exercises.uebung4.view;

import org.hbrs.se1.ws24.exercises.uebung2.control.ContainerException;
import org.hbrs.se1.ws24.exercises.uebung3.persistence.PersistenceException;
import org.hbrs.se1.ws24.exercises.uebung4.control.InputCli;

public class Client {
    public void start() {
        InputCli cli = new InputCli();
        try {
            cli.eingabe();
        } catch (ContainerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (PersistenceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
