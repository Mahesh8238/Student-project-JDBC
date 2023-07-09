package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAlldata {

	public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdet","root","root");
				Statement statement = connection.createStatement();
				ResultSet resultSet =statement.executeQuery("select * from Student where name like '%m%' and age>21");
				while(resultSet.next())
				{
					System.out.println("the Student id is "+resultSet.getInt(1));
					System.out.println("the Student name is "+resultSet.getString(2));
					System.out.println("the Student age is "+resultSet.getInt(3));
					System.out.println("**********************************");
					
				}
				connection.close();
		}
			catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

	}

