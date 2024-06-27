// public class CREATE_DB {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.Scanner;

public class CREATE_DB {
    private static void insert(Connection conn) throws IOException {
        try {
            String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            InputStreamReader input=new InputStreamReader(System.in);
            BufferedReader bf=new BufferedReader(input);
            
            System.out.print("Enter the username ::");
            String username=bf.readLine();
          
            System.out.print("Enter the password ::");
            String password=bf.readLine();
          
            System.out.print("Enter the fullname ::");
            String name=bf.readLine();

            System.out.print("Enter the email ::");
            String email= bf.readLine();

        

            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, name);
            statement.setString(4, email);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    private static void read(Connection conn) {

        try {
            String sql = "SELECT * FROM Users";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int count = 0;

            while (result.next()) {
                String name = result.getString(2);
                String pass = result.getString(3);
                String fullname = result.getString("fullname");
                String email = result.getString("email");

                String output = "User #%d: %s - %s - %s - %s";
                System.out.println(String.format(output, ++count, name, pass, fullname, email));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //Furthmore sql queries associated methods to be implemented...

    static final String DB_URL = "jdbc:mysql://localhost:3306/sampledb";

    static final String USER = "root";

    static final String PASS = "Starttheserver@123";

    public static void main(String[] args) throws IOException {
        try {

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            if (conn != null) {
                System.out.println("Database Connected!!!");
                try (Scanner sc = new Scanner(System.in)) {
                    System.out.println("Please enter 1 for insertion\n 2 For selection");
                    int operation = sc.nextInt();
                    switch (operation) {
                        case 1:
                            insert(conn);
                            break;
                        case 2:
                            read(conn);
                            break;
                        default:
                            break;
                    }
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
