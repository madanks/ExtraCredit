package com.movie.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManageConnection {
	private static EntityManagerFactory emf;

	public ManageConnection() {
		try {
			emf = Persistence.createEntityManagerFactory("com.movie.domain");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static EntityManager getConnection() {
		return emf.createEntityManager();
	}

	public static void closeConnection() {
		emf.close();
	}

}
