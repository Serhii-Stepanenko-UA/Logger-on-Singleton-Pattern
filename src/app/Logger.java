package app;

    // 1а. Клас Logger реалізує шаблон Singleton для створення єдиного екземпляру з глобальним доступом
    public class Logger {
        private static Logger instance;

        // 1b. Приватний конструктор, щоб уникнути створення об'єктів ззовні класу
        private Logger() {}

        // 1c. Метод, що створює екземпляр класу за відсутності або повертає той самий екземпляр класу
        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

        // Метод класу для виводу повідомлення
        public void showMessage() {
            System.out.println("Hello, I am a Logger instance!");
        }
    }