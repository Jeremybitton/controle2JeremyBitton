package sio.devoir2magazine.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idArticle", nullable = false)
    private Integer id;

    @Column(name = "titreArticle", nullable = false, length = 100)
    private String titreArticle;

    @Column(name = "nbFeuillets", nullable = false)
    private Integer nbFeuillets;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numPig", nullable = false)
    private sio.devoir2magazine.entities.Pigiste numPig;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numMag", nullable = false)
    private sio.devoir2magazine.entities.Magazine numMag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitreArticle() {
        return titreArticle;
    }

    public void setTitreArticle(String titreArticle) {
        this.titreArticle = titreArticle;
    }

    public Integer getNbFeuillets() {
        return nbFeuillets;
    }

    public void setNbFeuillets(Integer nbFeuillets) {
        this.nbFeuillets = nbFeuillets;
    }

    public sio.devoir2magazine.entities.Pigiste getNumPig() {
        return numPig;
    }

    public void setNumPig(sio.devoir2magazine.entities.Pigiste numPig) {
        this.numPig = numPig;
    }

    public sio.devoir2magazine.entities.Magazine getNumMag() {
        return numMag;
    }

    public void setNumMag(sio.devoir2magazine.entities.Magazine numMag) {
        this.numMag = numMag;
    }

}