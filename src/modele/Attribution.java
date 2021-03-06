package modele;
// Generated 3 avr. 2013 10:08:09 by Hibernate Tools 3.2.1.GA


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Attribution generated by hbm2java
 */
@Entity
@Table(name="attribution"
    ,catalog="festival"
)
public class Attribution  implements java.io.Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);


     private AttributionId id;
     private Groupe groupe;
     private Offre offre;
     private int nombreChambres;

    public Attribution() {
    }

    public Attribution(AttributionId id, Groupe groupe, Offre offre, int nombreChambres) {
       this.id = id;
       this.groupe = groupe;
       this.offre = offre;
       this.nombreChambres = nombreChambres;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idEtab", column=@Column(name="idEtab", nullable=false, length=8) ), 
        @AttributeOverride(name="idTypeChambre", column=@Column(name="idTypeChambre", nullable=false, length=2) ), 
        @AttributeOverride(name="idGroupe", column=@Column(name="idGroupe", nullable=false, length=4) ) } )
    public AttributionId getId() {
        return this.id;
    }
    
    public void setId(AttributionId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idGroupe", nullable=false, insertable=false, updatable=false)
    public Groupe getGroupe() {
        return this.groupe;
    }
    
    public void setGroupe(Groupe groupe) {
        Groupe oldGroupe = this.groupe;
        this.groupe = groupe;
        changeSupport.firePropertyChange("groupe", oldGroupe, groupe);
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="idEtab", referencedColumnName="idEtab", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="idTypeChambre", referencedColumnName="idTypeChambre", nullable=false, insertable=false, updatable=false) } )
    public Offre getOffre() {
        return this.offre;
    }
    
    public void setOffre(Offre offre) {
        Offre oldOffre = this.offre;
        this.offre = offre;
        changeSupport.firePropertyChange("offre", oldOffre, offre);
    }
    
    @Column(name="nombreChambres", nullable=false)
    public int getNombreChambres() {
        return this.nombreChambres;
    }
    
    public void setNombreChambres(int nombreChambres) {
        int oldNombreChambres = this.nombreChambres;
        this.nombreChambres = nombreChambres;
        changeSupport.firePropertyChange("nombreChambres", oldNombreChambres, nombreChambres);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }




}


