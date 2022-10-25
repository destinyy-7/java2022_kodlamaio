package oopWithNLayeredApp.core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void Log(String Data) {
        System.out.println("Veritabanına Loglandı: "+Data);
    }
}
