package com.shared;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.json.JSONArray;

public class GetData {
    public static JSONArray run(String input) throws Exception {
        Connection connection = DatabaseConnector.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM table-name");
        // Process the result set
        JSONArray json = convertToJSONArray.convert(resultSet);
        connection.close();
        return json;
    }
}
