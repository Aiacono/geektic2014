package com.ninja_squad.geektic.service;


import static org.springframework.web.bind.annotation.RequestMethod.GET; 

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional; 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController; 





import com.ninja_squad.geektic.beans.*;
import com.ninja_squad.geektic.dao.GeekDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

import static org.springframework.web.bind.annotation.RequestMethod.*;


@RestController
@Transactional
@RequestMapping("/api/recherche")
public class rechercheGeek {
	
	
	@Autowired 
	protected GeekDao geek;
	
    @RequestMapping(method = GET)
    public List<Geek> sayHello(@RequestParam("sexe") String sexe) {
    	
    	List<Geek> listGeek = new ArrayList<Geek>(); 
    	listGeek = geek.findGeekByInteret(sexe,"d","d","d","d");
		return listGeek;
		
    }
    
 
}




		
	



