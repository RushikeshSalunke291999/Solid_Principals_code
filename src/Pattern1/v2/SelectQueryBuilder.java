package Pattern1.v2;

public class SelectQueryBuilder {
    private StringBuilder query;
    private boolean hasSelect = false;
    private boolean hasFrom = false;

    public SelectQueryBuilder() {
        query = new StringBuilder();
    }

    // SELECT clause
    public SelectQueryBuilder select(String... columns) {
        query.append("SELECT ");
        if (columns.length == 0) {
            query.append("* ");
        } else {
            query.append(String.join(", ", columns)).append(" ");
        }
        hasSelect = true;
        return this;
    }

    // FROM clause
    public SelectQueryBuilder from(String table) {
        if (!hasSelect) throw new IllegalStateException("SELECT must be called before FROM.");
        query.append("FROM ").append(table).append(" ");
        hasFrom = true;
        return this;
    }

    // WHERE clause
    public SelectQueryBuilder where(String condition) {
        if (!hasFrom) throw new IllegalStateException("FROM must be called before WHERE.");
        query.append("WHERE ").append(condition).append(" ");
        return this;
    }

    // ORDER BY clause
    public SelectQueryBuilder orderBy(String column, String order) {
        query.append("ORDER BY ").append(column).append(" ").append(order).append(" ");
        return this;
    }

    // LIMIT clause
    public SelectQueryBuilder limit(int count) {
        query.append("LIMIT ").append(count).append(" ");
        return this;
    }

    // Final Build
    public String build() {
        return query.toString().trim() + ";";
    }
}
