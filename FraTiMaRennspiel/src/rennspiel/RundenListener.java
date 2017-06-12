/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rennspiel;

import java.util.EventListener;

/**
 *
 * @author marek.maciejewski
 */
public interface RundenListener extends EventListener {
    void advertisement (RundenEvent e);
}
