public class App {
    public static void main(String[] args) {
        // SQLDatabase sqlDatabase = new SQLDatabase();
        NoSQLDatabase noSQLDatabase = new NoSQLDatabase();
        Application app = new Application(noSQLDatabase);
        app.performOperation();

    }
}
