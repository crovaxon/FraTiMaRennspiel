package rennspiel;

public class Auto {

    private float _geschwindigkeit = 0;
    private float _tank = 100;

    public void beschleunigen(Wetter pAktuellesWetter) {
        switch (pAktuellesWetter) {
            case SONNIG:
            case BEWOELKT:
                _geschwindigkeit += 10;
                _tank -= _geschwindigkeit / 10;
                break;
            case REGEN:
                _geschwindigkeit += 7.5;
                _tank -= (_geschwindigkeit + 2.5) / 10;
                break;
            case GLAETTE:
                _geschwindigkeit += 5;
                _tank -= (_geschwindigkeit + 5) / 10;
                break;
            default:
                throw new AssertionError();
        }
        checkTank();
    }

    public void bremsen(Wetter pAktuellesWetter) {
        switch (pAktuellesWetter) {
            case SONNIG:
            case BEWOELKT:
                _geschwindigkeit -= 10;
                _tank -= _geschwindigkeit / 50;
                break;
            case REGEN:
                _geschwindigkeit -= 7.5;
                _tank -= (_geschwindigkeit + 2.5) / 50;
                break;
            case GLAETTE:
                _geschwindigkeit -= 5;
                _tank -= (_geschwindigkeit + 5) / 50;
                break;
            default:
                throw new AssertionError();
        }
        checkTank();
    }

    public void weiter(Wetter pAktuellesWetter) {
        switch (pAktuellesWetter) {
            case SONNIG:
            case BEWOELKT:
                _tank -= _geschwindigkeit / 25;
                break;
            case REGEN:
                _tank -= _geschwindigkeit / 20;
                break;
            case GLAETTE:
                _tank -= _geschwindigkeit / 15;
                break;
            default:
                throw new AssertionError();
        }
        checkTank();
    }

    public float getGeschwindigkeit() {
        return this._geschwindigkeit;
    }

    public float getTank() {
        return this._tank;
    }
    
    private void checkTank(){
        if(_tank <= 0)
            _tank = 0;
    }
}
