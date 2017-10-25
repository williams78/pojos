/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evolutions.test;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author fohs11691
 */
public class Test_Logins {
    
    public Test_Logins() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
    
     /*    EntityManagerFactory fm = FactoryManager.getEntityManagerFactory();
        EntityManager em = fm.createEntityManager();
        
        em.getTransaction().begin();
        /* TypedQuery<Long> query = em.createNamedQuery("Login.authenticate",Long.class)
                                .setParameter("ususer", "USP")
                                .setParameter("uspassword", "USP")
                                .setParameter("usstatus", 1);
       long usersCount = query.getSingleResult();*/
        
     /*     CriteriaBuilder cb = em.getCriteriaBuilder();
 
  CriteriaQuery<Long> cq = cb.createQuery(Long.class);
  Root<TB_Login> q = cq.from(Login.class);
  Predicate us = cb.equal(q.get("user"), "USP");
  Predicate pa = cb.equal(q.get("password"), "PASS");
  Predicate es = cb.equal(q.get("estatus"), 1);
  Predicate union = cb.and(us, pa , es);
  cq.where(union);
  
 
        CriteriaQuery<Long> query = cq.select(cb.count(q));
       Long people = em.createQuery(query).getSingleResult();

    
   System.out.print(people);
    
    
     
        
        
        
       em.close();  
  //      System.out.println((usersCount==1)?"Bienvenido ":"Error en los datos capturados.");
        
      */ 
     
        
    }
}
