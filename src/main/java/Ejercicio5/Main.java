package Ejercicio5;

import Ejercicio5.decorator.ConcursoConNotificacion;
import Ejercicio5.decorator.IConcurso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        RegistroInscripcion registro = new RegistroEnArchivo("inscripciones.txt");
        MailService mensajeria = new EnviadorMail();

        IConcurso concurso = new ConcursoConNotificacion(
                new Concurso(1, "Concurso Decorado", LocalDate.now(), LocalDate.now().plusDays(3), registro, mensajeria),
                mensajeria
        );

        Participante participante = new Participante(1, "messi@ejemplo.com", "Messi", 0);

        concurso.inscribirParticipante(participante, LocalDate.now());

        System.out.println("Inscripción realizada con notificación.");
    }
}

