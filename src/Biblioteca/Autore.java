package Biblioteca;

import java.util.UUID;

public class Autore implements Comparable<Autore>{
    private UUID ID;
    private String nome;
    private String cognome;


    public Autore(String nome, String cognome) {
        setNome(nome);
        setCognome(cognome);
        setID(UUID.randomUUID());
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public UUID getID() {
        return ID;
    }



    public void setID(UUID iD) {
        ID = iD;
    }

    @Override
    public int compareTo(Autore o) {
        return nome.compareTo(o.nome);
    }
}
