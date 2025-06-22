package Ejercicio5;

public class Participante {
    private int idParticipante;
    private String email;
    private String nombreParticipante;
    private int puntos;

    public Participante(int idParticipante, String email, String nombre, int i){
        this.idParticipante = idParticipante;
        this.email = email;
        this.nombreParticipante = nombre;
        this.puntos = 0;
    }


    public void sumarPuntos(int puntos){
        this.puntos += puntos;
    }

    public int getPuntos(){
        return puntos;
    }

    public int getID() {
        return idParticipante;
    }

    public String miEmail(){
        return this.email;
    }
}