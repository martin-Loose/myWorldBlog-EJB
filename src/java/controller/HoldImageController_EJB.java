/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

/**
 *
 * @author marlo0212
 */

public class HoldImageController_EJB implements Serializable{
    private Part image;

    public Part getImage() {
     
        return image;
    }

    public void setImage(Part image) {
        
        this.image = image;
    }
    
    
    
    
}
