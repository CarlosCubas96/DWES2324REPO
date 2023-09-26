package com.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbm.ConexionDB;
import com.model.Alumno;

public class ControllerInstituto {
	private List<Alumno> listadoNombresAlumnos = new ArrayList<Alumno>();

	public List<Alumno> getListNombresAlumnos() {

		ConexionDB.openConnection();

		ResultSet rs = ConexionDB.query("SELECT * FROM alumno");

		try {
			while (rs.next()) {

				Alumno alumno = new Alumno();
				alumno.setID(rs.getInt("ID"));
				alumno.setNombre(rs.getString("nombre"));
				alumno.setApellido(rs.getString("apellido"));
				alumno.setEdad(rs.getInt("edad"));
				alumno.setDNI(rs.getString("DNI"));
				alumno.setCurso(rs.getString("curso"));

				listadoNombresAlumnos.add(alumno);
			}

		} catch (SQLException e) {
			System.out.println("ERROR " + e.getMessage());
		} finally {
			ConexionDB.closeConnection();
		}

		return listadoNombresAlumnos;
	}
}
