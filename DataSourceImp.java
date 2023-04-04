package JVDB;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

public class DataSourceImp {
    private static int id;

    public static DataSource dataSource() {
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setPassword("Leaph@11042003");
        dataSource.setUser("postgres");
        dataSource.setDatabaseName("postgres");

        return dataSource;
    }

//    public static String getId() {
//        return id;
//    }

//    public static void setId(String id) {DataSourceImp.id = id;
//    }
}