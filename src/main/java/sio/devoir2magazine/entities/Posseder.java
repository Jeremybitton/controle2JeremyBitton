package sio.devoir2magazine.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "posseder")
public class Posseder {
    @EmbeddedId
    private PossederId id;

    @MapsId("numSpe")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numSpe", nullable = false)
    private sio.devoir2magazine.entities.Specialite numSpe;

    @MapsId("numPig")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numPig", nullable = false)
    private Pigiste numPig;

    public PossederId getId() {
        return id;
    }

    public void setId(PossederId id) {
        this.id = id;
    }

    public sio.devoir2magazine.entities.Specialite getNumSpe() {
        return numSpe;
    }

    public void setNumSpe(sio.devoir2magazine.entities.Specialite numSpe) {
        this.numSpe = numSpe;
    }

    public Pigiste getNumPig() {
        return numPig;
    }

    public void setNumPig(Pigiste numPig) {
        this.numPig = numPig;
    }

}