package com.ninja_squad.geektic.dao;

import java.util.List;

import com.ninja_squad.geektic.beans.Geek;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository 
public class GeekDao {
	
	@PersistenceContext
	protected EntityManager em;
	
	public Geek findById(Long id) {
		return em.find(Geek.class, id);
	}
	
	public void persist(Geek g) {
		em.persist(g);
		em.flush();
	}
	
	public List<Geek> findAll() {
		String jpql = "select s from Geek as s";
		TypedQuery<Geek> query = em.createQuery(jpql, Geek.class);
		return query.getResultList();
	}   
	
	
	public List<Geek> findGeekByInteret(String sexe, String lang, String compagnon, String repas, String sport) {
		String jpql = "select s from Geek as s where s.sexe like :a";
		TypedQuery<Geek> query = em.createQuery(jpql, Geek.class);
		query.setParameter("a", sexe);
		return query.getResultList();
	}
	
	}
