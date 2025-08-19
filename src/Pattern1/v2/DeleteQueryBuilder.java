package Pattern1.v2;

public class DeleteQueryBuilder implements SQLQuery {
    private String table;
    private String condition;

    public DeleteQueryBuilder from(String table) {
        this.table = table;
        return this;
    }

    public DeleteQueryBuilder where(String condition) {
        this.condition = condition;
        return this;
    }

    @Override
    public String build() {
        if (table == null) throw new IllegalStateException("Table must be set.");
        StringBuilder query = new StringBuilder("DELETE FROM ").append(table);
        if (condition != null) query.append(" WHERE ").append(condition);
        query.append(";");
        return query.toString();
    }
}
