import Decorador.AutoElectrico;
import Decorador.Automovil;
import Decorador.CarroEstandar;

public class Main {
	public static void main(String[] args) {
		carro = new AutoElectrico(new CarroEstandar("chevy"));
		carro.start();
		carro.stop();
		carro.accel();
	}
}
