/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import entities.Myblog;
import java.util.List;
import javax.ejb.Local;


/**
 *
 * @author marlo0212
 */
@Local
public interface MyblogFacadeLocal {

    void create(Myblog myblog);

    void edit(Myblog myblog);

    void remove(Myblog myblog);

    Myblog find(Object id);

    List<Myblog> findAll();
List<Myblog>findAllPublic();
    List<Myblog> findRange(int[] range);
List<Myblog>findAllMine(int id);
    int count();
    List<Myblog> findPublicFrom(int id);
    List<Myblog> findPrivateFrom(int id);
}
