package sio.devoir2magazine.dto;

public class MagazineSpecialite
{
    private int numMag;
    private String nomMag;
    private String specialite;

    public MagazineSpecialite(int numMag, String nomMag, String specialite) {
        this.numMag = numMag;
        this.nomMag = nomMag;
        this.specialite = specialite;
    }

    public int getNumMag() {
        return numMag;
    }

    public void setNumMag(int numMag) {
        this.numMag = numMag;
    }

    public String getNomMag() {
        return nomMag;
    }

    public void setNomMag(String nomMag) {
        this.nomMag = nomMag;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
