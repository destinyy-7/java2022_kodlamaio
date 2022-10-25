package oopWithNLayeredApp.core.logging;

public class MailLogger implements Logger{
    @Override
    public void Log(String Data) {
        System.out.println("Mail Loglandı: "+Data);
    }
}
