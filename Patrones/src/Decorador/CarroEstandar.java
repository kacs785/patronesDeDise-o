package Decorador;

public class CarroEstandar implements Automovil{
    private String nombre;

    public CarroEstandar(String s){
        this.nombre = s;
    }
    @Override
    public void accel() {
        System.out.println("acelerar");
    }

    @Override
    public void stop() {
        System.out.println("frenar");
    }

    @Override
    public void start() {
        System.out.println("prendiendo el carro");
    }
}
