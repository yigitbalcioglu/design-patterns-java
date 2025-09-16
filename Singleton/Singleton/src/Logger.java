public class Logger {

    // Singleton örneği
    private static Logger instance;

    // Private constructor, dışarıdan örnek oluşturulmasını engeller
    private Logger() {}

    // Örneği döndüren public metot (Thread-safe değil, basit örnek için yeterli)
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Log mesajı kaydetme metodu
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}