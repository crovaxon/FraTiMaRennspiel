package rennspiel;

import java.util.Random;
import javax.swing.event.EventListenerList;

public class Spiel {

    private Autorennspiel autorennspiel;
    private Spieler spielerA;
    private Spieler spielerB;
    private float streckenlaenge;
    private float gefahreneStreckeSpielerA = 0;
    private float gefahreneStreckeSpielerB = 0;
    private static Wetter aktuellesWetter = Wetter.SONNIG;
    private int wetterWechselChance = 0;
    private Random rnd;
    private EventListenerList listeners = new EventListenerList();

    public Spiel(String spielernameA, String spielernameB, float streckenlaenge) {
        rnd = new Random();
        this.spielerA = new Spieler(spielernameA, new Auto());
        this.spielerB = new Spieler(spielernameB, new Auto());
        this.streckenlaenge = streckenlaenge;
    }

    public void Fahren(Aktion aktionSpielerA, Aktion aktionSpielerB) {
        if (spielerA.getAuto().getTank() <= 0) {
            aktionSpielerA = Aktion.BREMSEN;
        }
        switch (aktionSpielerA) {
            case BESCHLEUNIGEN:
                spielerA.getAuto().beschleunigen(aktuellesWetter);
                break;
            case WEITER:
                spielerA.getAuto().weiter(aktuellesWetter);
                break;
            case BREMSEN:
                spielerA.getAuto().bremsen(aktuellesWetter);
                break;
            default:
                throw new AssertionError();
        }
        if (spielerB.getAuto().getTank() <= 0) {
            aktionSpielerB = Aktion.BREMSEN;
        }
        switch (aktionSpielerB) {
            case BESCHLEUNIGEN:
                spielerB.getAuto().beschleunigen(aktuellesWetter);
                break;
            case WEITER:
                spielerB.getAuto().weiter(aktuellesWetter);
                break;
            case BREMSEN:
                spielerB.getAuto().bremsen(aktuellesWetter);
                break;
            default:
                throw new AssertionError();
        }

        gefahreneStreckeSpielerA += spielerA.getAuto().getGeschwindigkeit();
        gefahreneStreckeSpielerB += spielerB.getAuto().getGeschwindigkeit();
        boolean spielersieg = false;
        String gewinner = "";
        if (streckenlaenge - gefahreneStreckeSpielerA <= 0
                || streckenlaenge - gefahreneStreckeSpielerB <= 0) {
            spielersieg = true;
            if (gefahreneStreckeSpielerA > gefahreneStreckeSpielerB) {
                //A gewinnt                
                gewinner = spielerA.GetName();
            } else if (gefahreneStreckeSpielerB > gefahreneStreckeSpielerA) {
                //B gewinnt                
                gewinner = spielerB.GetName();
            } else {
                //gleichstand
                gewinner = spielerA.GetName() + " und " + spielerB.GetName();
            }
        }
        bestimmeWetter();
        notifyRunde(new RundenEvent(spielersieg, gewinner,spielerA.getAuto().getGeschwindigkeit(), spielerB.getAuto().getGeschwindigkeit(), spielerA.getAuto().getTank(), spielerB.getAuto().getTank(), gefahreneStreckeSpielerA, gefahreneStreckeSpielerB, this));
    }

    public void setAutorennspiel(Autorennspiel autorennspiel) {
        this.autorennspiel = autorennspiel;
    }

    public void bestimmeWetter() {
        if (rnd.nextInt(100) < wetterWechselChance) {
            switch (aktuellesWetter) {
                case SONNIG:
                    aktuellesWetter = Wetter.BEWOELKT;
                    wetterWechselChance = 0;
                    break;
                case BEWOELKT:
                    if (rnd.nextInt(50) < 50) {
                        aktuellesWetter = Wetter.REGEN;
                        wetterWechselChance = 0;
                    } else {
                        aktuellesWetter = Wetter.SONNIG;
                        wetterWechselChance = 0;
                    }
                    break;
                case REGEN:
                    if (rnd.nextInt(50) < 50) {
                        aktuellesWetter = Wetter.GLAETTE;
                        wetterWechselChance = 0;
                    } else {
                        aktuellesWetter = Wetter.BEWOELKT;
                        wetterWechselChance = 0;
                    }
                    break;
                default: //GLAETTE
                    aktuellesWetter = Wetter.REGEN;
                    wetterWechselChance = 0;
                    break;
            }
        }
        wetterWechselChance += 10;
    }

    public void addRundenListener(RundenListener listener) {
        listeners.add(RundenListener.class, listener);
    }

    public void removeRundenListener(RundenListener listener) {
        listeners.remove(RundenListener.class, listener);
    }

    protected synchronized void notifyRunde(RundenEvent event) {
        for (RundenListener l : listeners.getListeners(RundenListener.class)) {
            l.advertisement(event);
        }
    }

    public boolean gewonnen() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
