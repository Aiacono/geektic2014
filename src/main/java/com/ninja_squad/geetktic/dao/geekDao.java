package com.ninja_squad.geetktic.dao;

import java.util.List;

import com.ninja_squad.geetik.beans.Geek;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


public class geekDao {
	
	private EntityManager entityManager;
	
	public geekDao(EntityManager em) {
		entityManager = em;
	}
	
	public Geek findById(Long id) {
		return entityManager.find(Geek.class, id);
	}
	
	public void persist(Geek g) {
		entityManager.persist(g);
		entityManager.flush();
	}
	
	public List<Geek> findAll() {
		String jpql = "select g from geektic as g";
		TypedQuery<Geek> query = entityManager.createQuery(jpql, Geek.class);
		return query.getResultList();
	}   
	
	public List<Geek> findById(String chaine) {
		String jpql = "select g from Spectacle as g where g.idGeek like :a";
		TypedQuery<Geek> query = entityManager.createQuery(jpql, Geek.class);
		query.setParameter("a", chaine);
		return query.getResultList();
	}
}
