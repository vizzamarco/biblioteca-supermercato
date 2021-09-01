package Biblioteca;

import java.util.Objects;
import java.util.UUID;

public class Libri implements Comparable<Libri>{
    private UUID ID;
    private String titolo;
    private String sinossi;
    private Autore autore;


    public Libri(String titolo, String sinossi, Autore autore) {
        setID(UUID.randomUUID());
        setTitolo(titolo);
        setSinossi(sinossi);
        setAutore(autore);




    }


    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getSinossi() {
        return sinossi;
    }
    public void setSinossi(String sinossi) {
        this.sinossi = sinossi;
    }
    public Autore getAutore() {
        return autore;
    }
    public void setAutore(Autore autore) {
        this.autore = autore;
    }


    public UUID getID() {
        return ID;
    }


    public void setID(UUID iD) {
        ID = iD;
    }



    public int compareTo(UUID ID) {
        // TODO Auto-generated method stub
        if(this.ID==ID)
            return 0;
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libri libri = (Libri) o;
        return Objects.equals(ID, libri.ID) && Objects.equals(titolo, libri.titolo) && Objects.equals(sinossi, libri.sinossi) && Objects.equals(autore, libri.autore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, titolo, sinossi, autore);
    }

    @Override
    public int compareTo(Libri o) {
        return titolo.compareTo(o.getTitolo());
    }
}
