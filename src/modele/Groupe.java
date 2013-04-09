package modele;
// Generated 3 avr. 2013 10:08:09 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Groupe generated by hbm2java
 */
@Entity
@Table(name="groupe"
    ,catalog="festival"
)
public class Groupe  implements java.io.Serializable {


     private String id;
     private String nom;
     private String identiteResponsable;
     private String adressePostale;
     private int nombrePersonnes;
     private String nomPays;
     private char hebergement;
     private Set attributions = new HashSet(0);

    public Groupe() {
    }

	
    public Groupe(String id, String nom, int nombrePersonnes, String nomPays, char hebergement) {
        this.id = id;
        this.nom = nom;
        this.nombrePersonnes = nombrePersonnes;
        this.nomPays = nomPays;
        this.hebergement = hebergement;
    }
    public Groupe(String id, String nom, String identiteResponsable, String adressePostale, int nombrePersonnes, String nomPays, char hebergement, Set attributions) {
       this.id = id;
       this.nom = nom;
       this.identiteResponsable = identiteResponsable;
       this.adressePostale = adressePostale;
       this.nombrePersonnes = nombrePersonnes;
       this.nomPays = nomPays;
       this.hebergement = hebergement;
       this.attributions = attributions;
    }
   
     @Id 
    
    @Column(name="id", unique=true, nullable=false, length=4)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="nom", nullable=false, length=40)
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    @Column(name="identiteResponsable", length=40)
    public String getIdentiteResponsable() {
        return this.identiteResponsable;
    }
    
    public void setIdentiteResponsable(String identiteResponsable) {
        this.identiteResponsable = identiteResponsable;
    }
    
    @Column(name="adressePostale", length=120)
    public String getAdressePostale() {
        return this.adressePostale;
    }
    
    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }
    
    @Column(name="nombrePersonnes", nullable=false)
    public int getNombrePersonnes() {
        return this.nombrePersonnes;
    }
    
    public void setNombrePersonnes(int nombrePersonnes) {
        this.nombrePersonnes = nombrePersonnes;
    }
    
    @Column(name="nomPays", nullable=false, length=40)
    public String getNomPays() {
        return this.nomPays;
    }
    
    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }
    
    @Column(name="hebergement", nullable=false, length=1)
    public char getHebergement() {
        return this.hebergement;
    }
    
    public void setHebergement(char hebergement) {
        this.hebergement = hebergement;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="groupe")
    public Set getAttributions() {
        return this.attributions;
    }
    
    public void setAttributions(Set attributions) {
        this.attributions = attributions;
    }




}


