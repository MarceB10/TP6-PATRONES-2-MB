package Ejercicio1;

public class main {
    public static void main(String[] args) {
        Motor motorComun = new MotorComun();
        motorComun.arrancar();
        motorComun.acelerar();
        motorComun.apagar();

        Motor motorEconomico = new MotorEconomico();
        motorEconomico.arrancar();
        motorEconomico.acelerar();
        motorEconomico.apagar();

        var motorElectricoAdapter = new MotorElectricoAdapter(new MotorElectrico());
        motorElectricoAdapter.arrancar();
        motorElectricoAdapter.acelerar();
        motorElectricoAdapter.apagar();
        System.out.println("Fin del programa");
    }
}
