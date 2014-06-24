package com.ninja_squad.geektic.service;


import static org.springframework.web.bind.annotation.RequestMethod.GET; 
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 


import com.ninja_squad.geetik.beans.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ninja_squad.geetktic.dao.geekDao;
import javax.transaction.Transactional;
import static org.springframework.web.bind.annotation.RequestMethod.*;


@RestController
@Transactional
@RequestMapping("/api/hello")
public class HelloService {
	
	
	@Autowired 
	protected geekDao geek;
	
	

    @RequestMapping(method = GET)
    public HelloMessage sayHello() {
    	
    	List<CentreInteret> centreInterets = new ArrayList<CentreInteret>(); 
		centreInterets = cid.findAll();
		System.out.println("test"); 
		for (CentreInteret centreInteret : centreInterets) { 
			System.out.println(centreInteret.getNom()); 
			} 
		return new HelloMessage(); 
		
    }
}




		
	



