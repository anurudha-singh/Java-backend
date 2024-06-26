// public class CREATE_DB {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Statement;

public class CREATE_DB{

static final String DB_URL="jdbc:mysql://localhost:3306";

static final String USER="username";

static final String PASS="YourPass@123";

public static void main(String[]args){

try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);

Statement stmt= conn.createStatement();)

{

String sql ="CREATE DATABASE VRD";

stmt.executeUpdate(sql);

System.out.println("Database created sussessfully");

}catch(SQLException e)

{

e.printStackTrace();

}

}

}