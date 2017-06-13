/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rennspiel;

import java.util.EventObject;

/**
 *
 * @author marek.maciejewski
 */
public class RundenEvent extends EventObject {

    private boolean spielersieg;
    private String gewinner;
    private float geschwindigkeitSpielerA, geschwindigkeitSpielerB, tankA, tankB, gefahreneStreckeA, gefahreneStreckeB;
    private Wetter wetter;
    
    public RundenEvent(boolean spielersieg, String gewinner, float geschwindigkeitSpielerA, float geschwindigkeitSpielerB, float tankA, float tankB, float gefahreneStreckeA, float gefahreneStreckeB, Wetter wetter, Object source) {
        super(source);
        this.spielersieg = spielersieg;
        this.gewinner = gewinner;
        this.geschwindigkeitSpielerA = geschwindigkeitSpielerA;
        this.geschwindigkeitSpielerB = geschwindigkeitSpielerB;
        this.tankA = tankA;
        this.tankB = tankB;
        this.gefahreneStreckeA = gefahreneStreckeA;
        this.gefahreneStreckeB = gefahreneStreckeB;
        this.wetter = wetter;
    }

    public boolean isSpielersieg() {
        return spielersieg;
    }

    public String getGewinner() {
        return gewinner;
    }

    public float getGeschwindigkeitSpielerA() {
        return geschwindigkeitSpielerA;
    }

    public float getGeschwindigkeitSpielerB() {
        return geschwindigkeitSpielerB;
    }

    public float getTankA() {
        return tankA;
    }

    public float getTankB() {
        return tankB;
    }

    public float getGefahreneStreckeA() {
        return gefahreneStreckeA;
    }

    public float getGefahreneStreckeB() {
        return gefahreneStreckeB;
    }

    public Wetter getWetter() {
        return wetter;
    }
    
}
