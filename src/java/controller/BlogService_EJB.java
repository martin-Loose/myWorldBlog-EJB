/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Myblog;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Inject;
import jpa.MyblogFacadeLocal;

/**
 *
 * @author marlo0212
 */
public class BlogService_EJB {
    private List<Myblog> alleBlog;
    private List<Myblog> myBlog;
    private List<Myblog> myPrivateBlog;
    private List<Myblog> myPublicBlog;
    private List<Myblog> allPublicBlogFrom;
    private List<Myblog> allPrivateBlogFrom;
    private Myblog selectedBlog;
    private String username;
    private boolean showMyPrivate;
    private boolean showMyPublic;
    private boolean showAllMyBlog;
    private int searchID;
    private String path2pic="http://127.0.0.1:8080/myWorld/"+username+"/Blog/";
@Inject
private MyblogFacadeLocal myBlogFacade;
    //

    public List<Myblog> getAlleBlog() {
        alleBlog=new ArrayList<>();
        try{
        return myBlogFacade.findAllPublic();
        }catch(Exception e){
        
        }
        return alleBlog;
    }

    public List<Myblog> getMyBlog() {
       myBlog=new ArrayList<>();
        try{
        return myBlogFacade.findAllMine(searchID);
        }catch(Exception e){
        
        }
        return myBlog;
    }

   

    public List<Myblog> getMyPrivateBlog() {
       myPrivateBlog=new ArrayList<>();
        try{
        return myBlogFacade.findPrivateFrom(searchID);
        }catch(Exception e){
        
        }
        return myPrivateBlog;
    }

  

    public List<Myblog> getMyPublicBlog( ) {
         myPublicBlog=new ArrayList<>();
        try{
        return myBlogFacade.findPublicFrom(searchID);
        }catch(Exception e){
        
        }
        return myPublicBlog;
    }

    public List<Myblog> getAllPublicBlogFrom() {
        allPublicBlogFrom=new ArrayList<>();
        try{
        return myBlogFacade.findPublicFrom(searchID);
        }catch(Exception e){
        
        }
        return allPublicBlogFrom;
    }

    public List<Myblog> getAllPrivateBlogFrom() {
         allPrivateBlogFrom=new ArrayList<>();
        try{
        return myBlogFacade.findPrivateFrom(searchID);
        }catch(Exception e){
        
        }
        return allPrivateBlogFrom;
    }

   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPath2pic() {
        return path2pic;
    }

    public void setPath2pic(String path2pic) {
        this.path2pic = path2pic;
    }

    public Myblog getSelectedBlog() {
        return selectedBlog;
    }

    public void setSelectedBlog(Myblog selectedBlog) {
        this.selectedBlog = selectedBlog;
    }

    public int getSearchID() {
        return searchID;
    }

    public void setSearchID(int searchID) {
        this.searchID = searchID;
        System.err.println("searchID set");
    }
    
}
