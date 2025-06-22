package Ejercicio5.decorator;

import Ejercicio5.MailService;
import Ejercicio5.Participante;

import java.time.LocalDate;

public class ConcursoConNotificacion implements IConcurso{
    private IConcurso concursoDecorado;
    private MailService mailService;

    public  ConcursoConNotificacion(IConcurso concursoDecorado, MailService mailService){
        this.concursoDecorado = concursoDecorado;
        this.mailService = mailService;
    }


    @Override
    public void inscribirParticipante(Participante participante, LocalDate fechaInscripcion) {
        concursoDecorado.inscribirParticipante(participante,fechaInscripcion);

        mailService.enviarEmail(participante.miEmail(), "Inscripcion exitosa" , "Se incribio correctamente al concurso.");
    }
}
