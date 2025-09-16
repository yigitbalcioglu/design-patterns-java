// farklı singleton design pattern türleri

//// 1. Eager Initialization
//public class Singleton {
//
//    // Sınıfın tek örneği (instance)
//    private static final Singleton instance = new Singleton();
//
//    // Private constructor, dışarıdan örnek oluşturulmasını engeller
//    private Singleton() {}
//
//    // Örneği döndüren public metot
//    public static Singleton getInstance() {
//        return instance;
//    }
//
//    // Diğer metotlar
//    public void doSomething() {
//        System.out.println("Singleton instance is doing something.");
//    }
//}
//
//// 2. Lazy Initialization
//public class Singleton {
//
//    // Sınıfın tek örneği (instance)
//    private static Singleton instance;
//
//    // Private constructor, dışarıdan örnek oluşturulmasını engeller
//    private Singleton() {}
//
//    // Örneği döndüren public metot
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//
//    // Diğer metotlar
//    public void doSomething() {
//        System.out.println("Singleton instance is doing something.");
//    }
//}
//
//// 3. Thread-Safe Lazy Initialization
//
//public class Singleton {
//
//    // Sınıfın tek örneği (instance)
//    private static Singleton instance;
//
//    // Private constructor, dışarıdan örnek oluşturulmasını engeller
//    private Singleton() {}
//
//    // Örneği döndüren public metot (thread-safe)
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//
//    // Diğer metotlar
//    public void doSomething() {
//        System.out.println("Singleton instance is doing something.");
//    }
//}
//
//// 4. Double-Checked Locking
//public class Singleton {
//
//    // Sınıfın tek örneği (instance)
//    private static volatile Singleton instance;
//
//    // Private constructor, dışarıdan örnek oluşturulmasını engeller
//    private Singleton() {}
//
//    // Örneği döndüren public metot (thread-safe ve performanslı)
//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }
//
//    // Diğer metotlar
//    public void doSomething() {
//        System.out.println("Singleton instance is doing something.");
//    }
//}
//
//// 5. Bill Pugh Singleton Implementation
//
//public class Singleton {
//
//    // Private constructor, dışarıdan örnek oluşturulmasını engeller
//    private Singleton() {}
//
//    // Static inner class - SingletonHelper
//    private static class SingletonHelper {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//
//    // Örneği döndüren public metot
//    public static Singleton getInstance() {
//        return SingletonHelper.INSTANCE;
//    }
//
//    // Diğer metotlar
//    public void doSomething() {
//        System.out.println("Singleton instance is doing something.");
//    }
//}
//
