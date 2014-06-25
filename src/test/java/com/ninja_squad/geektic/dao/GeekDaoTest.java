package com.ninja_squad.geektic.dao;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import com.ninja_squad.geektic.beans.Geek;
import com.ninja_squad.geektic.dao.*;

@SuppressWarnings("unused")
public class GeekDaoTest extends BaseDaoTest {
    public static final Operation STANDARD_OPERATION =
            Operations.sequenceOf(
                    Operations.deleteAllFrom("GEEKTIC"),
                    Operations.insertInto("GEEKTIC")
                              .columns("idGeek", "nom", "prenom", "age", "mail", "sexe", "languagepref", "compagnonvoyage", "repas", "sport","phrasefetiche")
                              .values(1, "IACONO", "Anthony","20","anthony.iacono@hotmail.com","2",5,5,5,4,"Fan de <body> building")
                              .values(2, "JOUVE", "Julien","19","julien.jouve@hotmail.com","2",3,3,4,4,"Je ne crie pas, j URL")
                              .values(3, "DEYDIER", "Julien","20","julien.deydier@hotmail.com","2",3,4,3,4,"Quand la vie apporte des questions, Google donne les réponses.")
                             .values(4, "PRUDENT", "Sylvain","20","sylvain.prudent@hotmail.com","2",3,3,2,4,"Les filles sont comme les noms de domaines, celles que j aime sont déjà prises.")
                              .values(5, "JEAN", "juliette","22","juliette.jean@hotmail.com","1",4,4,2,4,"Windows a détecté que vous n aviez pas de clavier. Appuyez sur F9 pour continuer.")
                              .build());
    
    @Autowired
    private GeekDao dao;
    @Before
    public void populateDatabase() {
        Operation operation = Operations.sequenceOf(STANDARD_OPERATION);
        DbSetup dbSetup = new DbSetup(destination, operation);
        dbSetup.launch();
    }
    
    @Test
    public void testFindAll() {
        List<Geek> geeks = dao.findAll();
        assertEquals("IACONO",geeks.get(0).getNom());
        assertEquals("JOUVE",geeks.get(1).getNom());
        assertEquals("DEYDIER",geeks.get(2).getNom());
        assertEquals("PRUDENT",geeks.get(3).getNom());
        assertEquals("JEAN",geeks.get(4).getNom());
    }
    
    @Test
    public void testFindByInterests(){
    	List<Geek> geeks = dao.findGeekByInteret("1",1,1,1,1);
        assertEquals("JEAN",geeks.get(0).getNom());
    }
    
}