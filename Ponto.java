package pilha;

public class Ponto {

    public Carro carro;
    public Ponto proximo;

    //constructor
    public Ponto(Carro carro, Ponto proximo) {
        this.carro = carro;
        this.proximo = proximo;
    }

    //getters and setters
    public Carro getCarro() {
        return carro;
    }
    
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Ponto getProximo() {
        return proximo;
    }

    public void setProximo(Ponto proximo) {
        this.proximo = proximo;
    }

}