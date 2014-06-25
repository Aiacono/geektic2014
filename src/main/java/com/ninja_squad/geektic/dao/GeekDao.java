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
	
	
	public List<Geek> findGeekByInteret(String sexe, int lang, int compagnon, int repas, int sport) {
		String jpql = "select s from Geek as s where s.sexe like :a or s.language like :b or s.compagnon like :c or s.repas like :d or s.sport like :e";
		TypedQuery<Geek> query = em.createQuery(jpql, Geek.class);
		query.setParameter("a", sexe);
		query.setParameter("b", lang);
		query.setParameter("c", compagnon);
		query.setParameter("d", repas);
		query.setParameter("e", sport);
		return query.getResultList();
	}
	
	}
