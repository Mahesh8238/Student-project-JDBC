package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdet","root","root");
				Statement statement = connection.createStatement();
				statement.execute("insert into Student values(110,'Supu',24)");
				statement.execute("insert into Student values(111,'mahesh',24)");
				statement.execute("insert into Student values(112,'satish',29)");
				statement.execute("insert into Student values(113,'sangu',21)");
				statement.execute("insert into Student values(114,'suraj',22)");
				
				
				
				connection.close();
				System.out.println("data saved");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
