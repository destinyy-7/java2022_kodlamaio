package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger{
    @Override
    public void Log(String Data) {
        System.out.println("Dosyaya Loglandı: "+Data);
    }
}
