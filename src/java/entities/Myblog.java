/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marlo0212
 */
@Entity
@Table(catalog = "myworld_blog", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Myblog.findAll", query = "SELECT m FROM Myblog m")
    , @NamedQuery(name = "Myblog.findById", query = "SELECT m FROM Myblog m WHERE m.id = :id")
    , @NamedQuery(name = "Myblog.findByCreatorID", query = "SELECT m FROM Myblog m WHERE m.creatorID = :creatorID")
    , @NamedQuery(name = "Myblog.findByTitel", query = "SELECT m FROM Myblog m WHERE m.titel = :titel")
    , @NamedQuery(name = "Myblog.findByMytext", query = "SELECT m FROM Myblog m WHERE m.mytext = :mytext")
    , @NamedQuery(name = "Myblog.findByMypicture", query = "SELECT m FROM Myblog m WHERE m.mypicture = :mypicture")
    , @NamedQuery(name = "Myblog.findByMylink", query = "SELECT m FROM Myblog m WHERE m.mylink = :mylink")
    , @NamedQuery(name = "Myblog.findByCreatedAt", query = "SELECT m FROM Myblog m WHERE m.createdAt = :createdAt")
    , @NamedQuery(name = "Myblog.findByIspublic", query = "SELECT m FROM Myblog m WHERE m.ispublic = :ispublic")
    , @NamedQuery(name = "Myblog.findByIspublicFROM", query = "SELECT m FROM Myblog m WHERE m.ispublic = :ispublic AND m.creatorID = :creatorID")
        , @NamedQuery(name = "Myblog.findByIsprivateFROM", query = "SELECT m FROM Myblog m WHERE m.isprivate = :isprivate AND m.creatorID = :creatorID")
        , @NamedQuery(name = "Myblog.findByIsprivate", query = "SELECT m FROM Myblog m WHERE m.isprivate = :isprivate")})
//, @NamedQuery(name = "Users.findByStartString", query = "SELECT u FROM Users u WHERE  u.username LIKE CONCAT('%', :searchString,'%')")// LIKE CONCAT('%',:searchKeyword,'%')"
public class Myblog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int creatorID;
    @Size(max = 40)
    @Column(length = 40)
    private String titel;
    @Size(max = 400)
    @Column(length = 400)
    private String mytext;
    @Size(max = 255)
    @Column(length = 255)
    private String mypicture;
    @Size(max = 255)
    @Column(length = 255)
    private String mylink;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    private Boolean ispublic;
    private Boolean isprivate;

    public Myblog() {
    }

    public Myblog(Integer id) {
        this.id = id;
    }

    public Myblog(Integer id, int creatorID, Date createdAt) {
        this.id = id;
        this.creatorID = creatorID;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(int creatorID) {
        this.creatorID = creatorID;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getMytext() {
        return mytext;
    }

    public void setMytext(String mytext) {
        this.mytext = mytext;
    }

    public String getMypicture() {
        return mypicture;
    }

    public void setMypicture(String mypicture) {
        this.mypicture = mypicture;
    }

    public String getMylink() {
        return mylink;
    }

    public void setMylink(String mylink) {
        this.mylink = mylink;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getIspublic() {
        return ispublic;
    }

    public void setIspublic(Boolean ispublic) {
        this.ispublic = ispublic;
    }

    public Boolean getIsprivate() {
        return isprivate;
    }

    public void setIsprivate(Boolean isprivate) {
        this.isprivate = isprivate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Myblog)) {
            return false;
        }
        Myblog other = (Myblog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Myblog[ id=" + id + " ]";
    }
    
}
