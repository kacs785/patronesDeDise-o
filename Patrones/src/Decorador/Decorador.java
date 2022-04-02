package Decorador;

public abstract class Decorador implements Automovil {
    private Automovil auto;

    public Decorador (Automovil auto){
        this.auto = auto;
    }

    protected Automovil getAuto() {
        return auto;
    }
}
