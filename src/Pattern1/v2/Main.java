package Pattern1.v2;

public class Main {
    public static void main(String[] args) {
        String select = new SelectQueryBuilder()
                .select("id", "name", "salary")
                .from("employees")
                .where("salary > 50000")
                .orderBy("salary", "DESC")
                .limit(5)
                .build();

        // INSERT Example
        String insert = new InsertQueryBuilder()
                .into("users")
                .value("name", "John")
                .value("age", 25)
                .build();

        // UPDATE Example
        String update = new UpdateQueryBuilder()
                .table("products")
                .set("price", 99.99)
                .set("stock", 20)
                .where("id = 101")
                .build();

        // DELETE Example
        String delete = new DeleteQueryBuilder()
                .from("orders")
                .where("status = 'CANCELLED'")
                .build();

        System.out.println("SELECT -> " + select);
        System.out.println("INSERT -> " + insert);
        System.out.println("UPDATE -> " + update);
        System.out.println("DELETE -> " + delete);

    }
}
