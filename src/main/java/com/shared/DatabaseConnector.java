package com.shared;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnector {
    public static Connection getConnection() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName("hostname");
        dataSource.setDatabaseName("db-name");
        dataSource.setUser("user");
        dataSource.setPassword("password");
        dataSource.setPort(3306);
        return dataSource.getConnection();
    }
}
