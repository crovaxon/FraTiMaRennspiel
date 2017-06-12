package rennspiel;

public class Spieler {

    private String name;
    private Auto auto;

    public Spieler(String name, Auto auto) {
        this.name = name;
        this.auto = auto;
    }
    
    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
}
