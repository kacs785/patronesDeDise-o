package Decorador;

public class AutoElectrico extends Decorador {

    public AutoElectrico(Automovil auto){
        super(auto);
    }

    @Override
    public void accel() {
        System.out.println("acelerado electrico");
getAuto().accel();
    }

    @Override
    public void stop() {
getAuto().stop();
    }

    @Override
    public void start() {
getAuto().start();
    }
}
