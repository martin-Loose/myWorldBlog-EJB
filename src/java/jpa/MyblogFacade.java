/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import entities.Myblog;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author marlo0212
 */
@Stateless
public class MyblogFacade extends AbstractFacade<Myblog> implements MyblogFacadeLocal {

    @PersistenceContext(unitName = "myWorldBlog-EJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MyblogFacade() {
        super(Myblog.class);
    }

    @Override
    public List<Myblog> findPublicFrom(int id) {
       List<Myblog>myLists=new ArrayList<>();
        try{
        myLists=em.createNamedQuery("Myblog.findByIspublicFROM",Myblog.class).setParameter("isPublic", true)
                .setParameter("creatorID", id)
                .getResultList();
        return myLists;
        }catch(Exception e){
            return myLists;
    }
    }

    @Override
    public List<Myblog> findPrivateFrom(int id) {
        List<Myblog>myLists=new ArrayList<>();
        try{
        myLists=em.createNamedQuery("Myblog.findByIsprivateFROM",Myblog.class).setParameter("isprivate", true)
                .setParameter("creatorID", id)
                .getResultList();
        return myLists;
        }catch(Exception e){
            return myLists;
    }
    }

    @Override
    public List<Myblog> findAllPublic() {
      List<Myblog>myLists=new ArrayList<>();
        try{
        myLists=em.createNamedQuery("Myblog.findByIspublic",Myblog.class).setParameter("ispublic", true)
                .getResultList();
        return myLists;
        }catch(Exception e){
            return myLists;
    }
    }

    @Override
    public List<Myblog> findAllMine(int id) {
     List<Myblog>myLists=new ArrayList<>();
        try{
        myLists=em.createNamedQuery("Myblog.findByCreatorID",Myblog.class).setParameter("creatorID", id)
                .getResultList();
        return myLists;
        }catch(Exception e){
            return myLists;
    }
    }
    
}
