public class Application {

    public static void main(String[] args) {
        // Logger örneğini al
        Logger logger = Logger.getInstance();

        // Uygulama başladı
        logger.log("Uygulama başlatıldı.");

        // Bir işlem yap
        performTask();

        // Uygulama sonlandı
        logger.log("Uygulama sonlandırıldı.");
    }

    public static void performTask() {
        // Logger örneğini al
        Logger logger = Logger.getInstance();

        // Görev başladı
        logger.log("Görev başlatıldı.");

        // Görev devam ediyor
        logger.log("Görev devam ediyor...");

        // Görev tamamlandı
        logger.log("Görev tamamlandı.");
    }
}