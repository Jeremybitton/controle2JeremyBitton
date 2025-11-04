package sio.devoir2magazine.dto;

public class ArticlePigiste
{
    private int idArticle;
    private String titreArticle;
    private int nbFeuillets;
    private String nomPigiste;


    public ArticlePigiste(int idArticle, String titreArticle, int nbFeuillets, String nomPigiste) {
        this.idArticle = idArticle;
        this.titreArticle = titreArticle;
        this.nbFeuillets = nbFeuillets;
        this.nomPigiste = nomPigiste;
    }

    public int getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public String getTitreArticle() {
        return titreArticle;
    }

    public void setTitreArticle(String titreArticle) {
        this.titreArticle = titreArticle;
    }

    public int getNbFeuillets() {
        return nbFeuillets;
    }

    public void setNbFeuillets(int nbFeuillets) {
        this.nbFeuillets = nbFeuillets;
    }

    public String getNomPigiste() {
        return nomPigiste;
    }

    public void setNomPigiste(String nomPigiste) {
        this.nomPigiste = nomPigiste;
    }
}
