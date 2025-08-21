package Z_Pattern1.Builder_Pattern.v2;

import java.util.*;

public class UpdateQueryBuilder implements SQLQuery {
    private String table;
    private final Map<String, String> updates = new LinkedHashMap<>();
    private String condition;

    public UpdateQueryBuilder table(String table) {
        this.table = table;
        return this;
    }

    public UpdateQueryBuilder set(String column, Object value) {
        if (value instanceof String) {
            updates.put(column, "'" + value + "'");
        } else {
            updates.put(column, value.toString());
        }
        return this;
    }

    public UpdateQueryBuilder where(String condition) {
        this.condition = condition;
        return this;
    }

    @Override
    public String build() {
        if (table == null || updates.isEmpty()) {
            throw new IllegalStateException("Table and updates must be set.");
        }
        StringBuilder query = new StringBuilder("UPDATE ").append(table).append(" SET ");
        updates.forEach((col, val) -> query.append(col).append("=").append(val).append(", "));
        query.setLength(query.length() - 2); // remove last comma
        if (condition != null) query.append(" WHERE ").append(condition);
        query.append(";");
        return query.toString();
    }
}
