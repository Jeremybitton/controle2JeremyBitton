package sio.devoir2magazine.entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "specialite")
public class Specialite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSpe", nullable = false)
    private Integer id;

    @Column(name = "nomSpe", nullable = false, length = 100)
    private String nomSpe;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomSpe() {
        return nomSpe;
    }

    public void setNomSpe(String nomSpe) {
        this.nomSpe = nomSpe;
    }

}