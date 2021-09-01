package Supermercato;





import java.util.PriorityQueue;

 class Mercato {
    private PriorityQueue<Cliente> coda = new PriorityQueue<>();

    public Mercato() {

    }	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Mercato mercato= new Mercato();
        Cliente cliente = new Cliente(1,"Peppino", 23);
        mercato.aggiungiCliente(cliente);

    }


    public PriorityQueue<Cliente> aggiungiCliente(Cliente cliente) {

        coda.add(cliente);
        return coda;

    }

    public Cliente serviOttieniProssimoCliente(){

        return coda.poll();
    }

    public PriorityQueue<Cliente> ottieniCoda(PriorityQueue<Cliente> coda){
        return coda;
    }

}


class Cliente implements Comparable<Cliente>{
    private Integer id;
    private String nome;
    private int eta;



    public Cliente(int id,String nome, int eta){
        this.id=id;
        this.nome=nome;
        this.eta=eta;
    }


    public int getId() {

        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }


    @Override
    public int compareTo(Cliente cliente) {
        // TODO Auto-generated method stub
        if(this.getEta()> cliente.getEta()) {
            return -1;
        }
        else if (this.getEta()<cliente.getEta()) {
            return 1;
        }
        else {
            return id.compareTo(cliente.id);

        }
    }

}
