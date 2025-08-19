package Pattern1.v2;

import java.util.ArrayList;
import java.util.List;

public class InsertQueryBuilder {

    private String table;
    private final List<String> columns = new ArrayList<>();
    private final List<String> values = new ArrayList<>();

    public InsertQueryBuilder into(String table) {
        this.table = table;
        return this;
    }

    public InsertQueryBuilder value(String column, Object value) {
        columns.add(column);
        if (value instanceof String) {
            values.add("'" + value + "'");
        } else {
            values.add(value.toString());
        }
        return this;
    }


    public String build() {
        if (table == null || columns.isEmpty()) {
            throw new IllegalStateException("Table and values must be set.");
        }
        return "INSERT INTO " + table + " (" + String.join(", ", columns) + ") VALUES (" + String.join(", ", values) + ");";
    }
}
