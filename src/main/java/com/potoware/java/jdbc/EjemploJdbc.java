package com.potoware.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.potoware.java.jdbc.models.Producto;
import com.potoware.java.jdbc.repositorio.ProductoRepositorio;
import com.potoware.java.jdbc.repositorio.Repositorio;
import com.potoware.java.jdbc.util.ConexionBaseDatos;

public class EjemploJdbc {
public static void main(String[] args) {
		
	try (Connection conn = ConexionBaseDatos.getInstance();){
		
		Repositorio<Producto> repo = new ProductoRepositorio();
		repo.listar().forEach(System.out::println);
		System.out.println(repo.porId(2L));
				
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
	
	}
}
}
