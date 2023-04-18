package ejercicio_tickets;

import java.sql.*;

public class SQLDatabaseConnection {
    // Connect to your database.

    public void dataBase() {
        String connectionUrl =
                "jdbc:mysql://localhost:3306/database_store";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl, "root", "root");
             Statement statement = connection.createStatement()) {

                // Create and execute a SELECT SQL statement.
                String selectSql = "SELECT * from items";
                resultSet = statement.executeQuery(selectSql);
                int columnNumber = resultSet.getMetaData().getColumnCount();


                // Print results from select statement
                while (resultSet.next()) {
                    StringBuilder item = new StringBuilder();
                    String value = "";

                    for(int i = 2; i <= columnNumber; i++){

                        if((resultSet.getMetaData().getColumnName(i)).equalsIgnoreCase("imported")){
                            if((resultSet.getString(i)).equalsIgnoreCase("0")){
                                value = "Imported";
                            }else{
                                value = "Not Imported";
                            }
                        }else{
                            value = resultSet.getString(i);
                        }

                        item.append(value).append(" ");

                    }
                    System.out.println(item);
                }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}