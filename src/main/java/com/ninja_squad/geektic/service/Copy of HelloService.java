package com.ninja_squad.geektic.service;


import static org.springframework.web.bind.annotation.RequestMethod.GET; 

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional; 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RequestMapping; 
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
@RequestMapping("/api/hello")
public class HelloService {
	
	
	@Autowired 
	protected GeekDao geek;
	
    @RequestMapping(method = GET)
    public List<Geek> sayHello() {
    	
    	List<Geek> listGeek = new ArrayList<Geek>(); 
    	listGeek = geek.findAll();
		return listGeek;
		
    }
    
 
}




		
	



