public class Main {
    public static void main(String[] args) {
        // connect to db
        DbFunctions db = new DbFunctions();
        db.connect_to_db("tutdb", "postgres", "8096");
    }
}
