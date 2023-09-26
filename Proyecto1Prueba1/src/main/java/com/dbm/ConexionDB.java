package com.dbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {

	private static Connection conexion = null;
	private static String NAME_DB = "jdbc:mysql://localhost:3306/instituto";
	private static String user = "sqladmin";
	private static String password = "Elena12121234";

	public static void openConnection() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(NAME_DB, user, password);
		} catch (SQLException e) {
			System.out.println("ERROR " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR " + e.getMessage());
		}
	}

	public static void closeConnection() {
		if (conexion != null) {
			try {
				conexion.close();
			} catch (SQLException e) {
				System.out.println("ERROR " + e.getMessage());
			}
		}
	}

	public static ResultSet query(String sql) {
		ResultSet rs = null;
		try {
			Statement sentencia = conexion.createStatement();
			rs = sentencia.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("ERROR " + e.getMessage());
		}
		return rs;
	}

	public static PreparedStatement prepareState(String sql) {
		PreparedStatement ps = null;
		try {
			ps = conexion.prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println("ERROR " + e.getMessage());
		}
		return ps;
	}

	public static void commit() {
		try {
			conexion.setAutoCommit(false);
			conexion.commit();
		} catch (SQLException e) {
			System.err.println("ERROR: COMMIT. " + e.getMessage());
		}
	}

	public static void rollback() {
		try {
			conexion.rollback();
		} catch (SQLException e) {
			System.err.println("ERROR: ROLLBACK. " + e.getMessage());
		}
	}

}
