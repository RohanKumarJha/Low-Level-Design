public class Application {
    // private SQLDatabase database;
    private NoSQLDatabase noSqlDatabase;

    public Application() {
        // database = new SQLDatabase();
        noSqlDatabase = new NoSQLDatabase();
    }

    public void performOperation() {
        // database.fetchData();
        noSqlDatabase.fetchData();
    }
}