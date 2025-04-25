public class Application {
    private Database database;

    public Application(Database database) {
        this.database = database;
    }

    public void performOperation() {
        database.fetchData();
    }
}