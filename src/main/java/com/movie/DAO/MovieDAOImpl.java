package com.movie.DAO;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import com.movie.connection.ManageConnection;
import com.movie.domain.Artist;
import com.movie.domain.Director;
import com.movie.domain.Genre;
import com.movie.domain.Movie;
import com.movie.domain.Rating;

public class MovieDAOImpl {


	public void save(Movie m) {
		EntityManager em = ManageConnection.getConnection();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(m);

			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive()))
				tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen()))
				em.close();
		}

	}

	public Movie find(int id) {
		EntityManager em = ManageConnection.getConnection();
		EntityTransaction tx = em.getTransaction();
		Movie m = null;
		try {
			tx.begin();
			m = em.find(Movie.class, id);

			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive()))
				tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen()))
				em.close();

		}
		return m;
	}

	public void update(Movie retriveMovie) {
		EntityManager em = ManageConnection.getConnection();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			 em.merge(retriveMovie);

			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive()))
				tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen()))
				em.close();

		}
		
	}

	public void delete(int id) {
		EntityManager em = ManageConnection.getConnection();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			Movie m = em.find(Movie.class, id);
			 em.remove(m);

			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive()))
				tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen()))
				em.close();

		}
		
	}

	public Movie findByName(String name) {
		EntityManager em = ManageConnection.getConnection();
		EntityTransaction tx = em.getTransaction();
		Movie m = null;
		try {
			tx.begin();
			Query q1 = em.createQuery("from Movie where name=:name");
			q1.setParameter("name", name);
			m=(Movie) q1.getSingleResult();
			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive()))
				tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen()))
				em.close();

		}
		return m;
	}

	public Movie findByGenre(Genre action) {
		EntityManager em = ManageConnection.getConnection();
		EntityTransaction tx = em.getTransaction();
		Movie m = null;
		try {
			tx.begin();
			Query q1 = em.createQuery("from Movie where genre=:g");
			q1.setParameter("g", action);
			m=(Movie) q1.getSingleResult();
			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive()))
				tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen()))
				em.close();

		}
		return m;
	}

	public Movie findByRating(Rating four) {
		EntityManager em = ManageConnection.getConnection();
		EntityTransaction tx = em.getTransaction();
		Movie m = null;
		try {
			tx.begin();
			Query q1 = em.createQuery("from Movie where rating=:r");
			q1.setParameter("r", four);
			m=(Movie) q1.getSingleResult();
			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive()))
				tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen()))
				em.close();

		}
		return m;
	}

	public Movie findByYear(Date date) {
		EntityManager em = ManageConnection.getConnection();
		EntityTransaction tx = em.getTransaction();
		Movie m = null;
		try {
			tx.begin();
			Query q1 = em.createQuery("from Movie where year=:date");
			q1.setParameter("date", date,TemporalType.DATE);
			m=(Movie) q1.getSingleResult();
			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive()))
				tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen()))
				em.close();

		}
		return m;
	}

	public List<Movie> findByArtist(String a) {
		EntityManager em = ManageConnection.getConnection();
		EntityTransaction tx = em.getTransaction();
		List<Movie> m = null;
		try {
			tx.begin();
			Query q1 = em.createQuery("select m from Movie m join m.artist a where a.name=:artist");
			q1.setParameter("artist", a);
			m=(List<Movie>) q1.getResultList();
			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive()))
				tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen()))
				em.close();

		}
		return m;
	}

	public List<Movie> findByCharacter(String string) {
		EntityManager em = ManageConnection.getConnection();
		EntityTransaction tx = em.getTransaction();
		List<Movie> m = null;
		try {
			tx.begin();
			Query q1 = em.createQuery("select m from Movie m join m.artist a join a.artistcharacters c where c.characterName=:name");
			q1.setParameter("name", string);
			m=(List<Movie>) q1.getResultList();
			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive()))
				tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen()))
				em.close();

		}
		return m;
	}

	public List<Movie> findByDirector(String string) {
		EntityManager em = ManageConnection.getConnection();
		EntityTransaction tx = em.getTransaction();
		List<Movie> m = null;
		try {
			tx.begin();
			Query q1 = em.createQuery("select m from Movie m join m.director d where d.name=:name");
			q1.setParameter("name", string);
			m=(List<Movie>) q1.getResultList();
			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive()))
				tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen()))
				em.close();

		}
		return m;
	}

}
