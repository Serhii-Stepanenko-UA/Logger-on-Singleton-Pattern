package app;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        // Отримуємо вперше єдиний доступний екземпляр
        System.out.println("First call:");
        Logger logger = Logger.getInstance();
        logger.showMessage();

        // Викликаємо вдруге створення екземпляру і отримуємо той же єдиний доступний екземпляр
        System.out.println("Second call:");
        Logger logger1 = Logger.getInstance();
        logger1.showMessage();
        // logger1 = null; // Для тестування на вдсутність

        // Перевіряємо чи екземпляр той самий
        if (logger != null && logger1 != null) {
            if (logger == logger1){
                System.out.println("\nThere is one the same instance of the logger.");
            } else
            System.out.println("\nThese logger instances are different.");
        } else
            System.out.println("\nOne or both instances are missing for comparison.");

        // Помилка компіляціі
        // Конструктор Logger() недоступий із-за атрибуту приватного доступу
        // Logger logger2 = new Logger();

    }
}