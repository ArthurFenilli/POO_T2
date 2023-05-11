package POO_T2;

abstract class AudioVisual implements Cobravel {
    private String titulo;
    private double precoBase;

    public AudioVisual(String titulo, double preco){
        this.titulo = titulo;
        precoBase = preco;
    }

    public abstract double calculaPrecoVenda();


    public abstract double calculaImposto();
    
}
