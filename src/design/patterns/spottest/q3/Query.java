package design.patterns.spottest.q3;

public class Query {
    private String select;
    private String from;
    private String where;
    private String orderBy;

    public Query(String select, String from, String where, String orderBy) {
        this.select = select;
        this.from = from;
        this.where = where;
        this.orderBy = orderBy;
    }

    public String getSelect() {
        return select;
    }

    public String getFrom() {
        return from;
    }

    public String getWhere() {
        return where;
    }

    public String getOrderBy() {
        return orderBy;
    }

    @Override
    public String toString() {
        String query = "SELECT " + select + " FROM " + from;
        if (where != null) {
            query += " WHERE " + where;
        }
        if (orderBy != null) {
            query += " ORDER BY " + orderBy;
        }
        return query;
    }
}
