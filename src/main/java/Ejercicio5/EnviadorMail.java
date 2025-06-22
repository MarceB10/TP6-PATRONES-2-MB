package Ejercicio5;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;


import java.util.Properties;


public class EnviadorMail implements MailService {
    private static final String HOST  = "sandbox.smtp.mailtrap.io";
    private static final String PORT = "2525";
    private static final String USER = "16b2d278863398";
    private static final String PASSWORD = "8b65368450f2d6";


    //private String usuarioMailTrap;
    //private String contraseñaMailTrap;

    public EnviadorMail(){

    }

   // public EnviadorMail(String usuarioMailTrap, String contraseñaMailTrap){
    //    this.usuarioMailTrap = usuarioMailTrap;
    //    this.contraseñaMailTrap = contraseñaMailTrap;
    //}

    public void enviarEmail(String destinatario, String asunto, String mensajes){
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", HOST);
        props.put("mail.smtp.port", PORT);

        Session sesion = Session.getInstance(props, new jakarta.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USER, PASSWORD);
            }
        });

        try {
            Message mensaje = new MimeMessage(sesion);
            mensaje.setFrom(new InternetAddress(USER));
            mensaje.setRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));

            mensaje.setSubject(asunto);
            mensaje.setText(mensajes);

            Transport.send(mensaje);
        }catch (MessagingException e) {
            throw new RuntimeException(e.getMessage());
        }

        System.out.println("Mensaje enviado Exitosamente");
    }
}
