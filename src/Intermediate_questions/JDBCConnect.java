package Intermediate_questions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnect {

    public static void main(String[] args) throws SQLException {

        String Username = "Roshan";
        String Pass = "Roshan@12345";
        String tb_name = "qadbt";
        String url = "jdbc:mysql://localhost:3306/" + tb_name;

        Connection connect = DriverManager.getConnection(url, Username, Pass);
        Statement st = connect.createStatement();

        ResultSet rs = st.executeQuery("Select * from person");

        System.out.println("Result set of Query :-" + rs);

        while (rs.next()) {
            System.out.println(rs);
        }

    }

}
