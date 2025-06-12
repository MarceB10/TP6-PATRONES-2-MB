package Ejercicio1;

public class MotorComun implements Motor {
    public void MotorComun() {}

    @Override
    public void arrancar() {
        System.out.println("Arrancando el motor comun " );
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el motor comun");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el motor comun");
    }
}
