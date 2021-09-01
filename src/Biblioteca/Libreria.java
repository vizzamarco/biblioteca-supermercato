package Biblioteca;

import java.util.*;

public class Libreria {

    TreeMap<Autore, Set<Libri>> libreria = new TreeMap<>();


    public void inserimentolibro(Libri libro) {
        if(libreria.containsKey(libro.getAutore())) {
            libreria.get(libro.getAutore()).add(libro);
        }
        else {
            Set<Libri> listalibri= new HashSet<>();
            listalibri.add(libro);
            libreria.put(libro.getAutore(), listalibri);
        }
    }

    public void cancellaLibro(String id) {
        for (Autore i : libreria.keySet()) {
            for (Libri l : libreria.get(i)) {
                if(l.getID().toString().equals(id)) {
                    libreria.get(i).remove(l);
                    return;
                }

            }
        }
    }
        public Libri ricercaLibro (String titolo){

            for(Autore i : libreria.keySet()){
                for ( Libri l: libreria.get(i)){
                    if(l.getTitolo().equals(titolo
                    )){
                        System.out.println(l.getTitolo()+ " " +l.getSinossi());
                        return l;

                    }
                }
            }
            return null;
        }




            public void stampaLibriOrdinati(){
        for(Autore autore: libreria.keySet()){
            for(Libri l : libreria.get(autore)){
                System.out.println("L'autore è : " + autore.getNome() + autore.getCognome()+ l.getSinossi());
            }
        }

            }



        public static void main (String[]args){
            // TODO Auto-generated method stub

            Libreria nuovaEuropa = new Libreria();
            Autore Marco = new Autore("marco", "vizzarro");
            Libri Pascoli = new Libri("Notte stellata", "la notte piena di stelle con accanto ", Marco);
           nuovaEuropa.inserimentolibro(Pascoli);
            nuovaEuropa.ricercaLibro("Notte stellata");
            nuovaEuropa.stampaLibriOrdinati();

        }


    }