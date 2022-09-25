package pilha;

public class ListaLigada {
    
    public static void imprimir (Ponto Ponto) {
        //se ponto não for nulo, imprimir a placa do carro, modelo e cor
        if (Ponto != null) {
            System.out.println("Placa: " + Ponto.getCarro().getPlaca());
            System.out.println("Modelo: " + Ponto.getCarro().getModelo());
            System.out.println("Cor: " + Ponto.getCarro().getCor());
            System.out.println("----------------------------");
            //chamar o método imprimir passando o próximo ponto
            imprimir(Ponto.getProximo());
        }
    }
    
    

public static void main(String[]args){
    Ponto p1 = new Ponto(new Carro("AAA-1111", "Fusca", "Azul"), null);
    Ponto p2 = new Ponto(new Carro("BBB-2222", "Fusca", "Azul"), p1);
    Ponto p3 = new Ponto(new Carro("CCC-3333", "Fusca", "Azul"), p2);
    Ponto p4 = new Ponto(new Carro("DDD-4444", "Fusca", "Azul"), p3);
    Ponto p5 = new Ponto(new Carro("EEE-5555", "Fusca", "Azul"), p4);
    Ponto p6 = new Ponto(new Carro("FFF-6666", "Fusca", "Azul"), p5);
    Ponto p7 = new Ponto(new Carro("GGG-7777", "Fusca", "Azul"), p6);
    Ponto p8 = new Ponto(new Carro("HHH-8888", "Fusca", "Azul"), p7);
    Ponto p9 = new Ponto(new Carro("III-9999", "Fusca", "Azul"), p8);
    Ponto p10 = new Ponto(new Carro("JJJ-0000", "Fusca", "Azul"), p9);
    
    imprimir(p10);
    

}
}

