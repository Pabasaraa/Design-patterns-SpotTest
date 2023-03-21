package design.patterns.spottest.q3;

public class QueryBuilder {
    private Query query;

    public QueryBuilder() {
        query = new Query(null, null, null, null);
    }

    public QueryBuilder select(String select) {
        query = new Query(select, query.getFrom(), query.getWhere(), query.getOrderBy());
        return this;
    }

    public QueryBuilder from(String from) {
        query = new Query(query.getSelect(), from, query.getWhere(), query.getOrderBy());
        return this;
    }

    public QueryBuilder where(String where) {
        query = new Query(query.getSelect(), query.getFrom(), where, query.getOrderBy());
        return this;
    }

    public QueryBuilder orderBy(String orderBy) {
        query = new Query(query.getSelect(), query.getFrom(), query.getWhere(), orderBy);
        return this;
    }

    public Query build() {
        if (query.getSelect() == null || query.getFrom() == null) {
            throw new IllegalStateException("Query must have a SELECT and FROM clause");
        }
        return query;
    }
}
