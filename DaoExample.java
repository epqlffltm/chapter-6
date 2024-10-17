class DataAccessObject {
    String bd;

    DataAccessObject(String bd) {
        this.bd = bd;
    }

    void select() {
        System.out.println(bd + " 검색.");
    }

    void insert() {
        System.out.println(bd + " 삽입.");
    }

    void update() {
        System.out.println(bd + " 수정.");
    }

    void delete() {
        System.out.println(bd + " 삭제.");
    }
}

class OracleDataAccessObject extends DataAccessObject {
    OracleDataAccessObject() {
        super("Oracle");
    }
}

class MySQLDataAccessObject extends DataAccessObject {
    MySQLDataAccessObject() {
        super("MySQL");
    }
}

public class DaoExample {
    public static void dbwork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        DataAccessObject mysqlDao = new MySQLDataAccessObject();
        DataAccessObject oracleDao = new OracleDataAccessObject();

        dbwork(mysqlDao);
        dbwork(oracleDao);
    }
}
