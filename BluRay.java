public class BluRay extends AudioVisual{
    private int duracao;

    public BluRay(String titulo, double preco, int duracao){
        super(titulo,preco);
        this.duracao = duracao;
    }

    public double calculaPrecoVenda(){
        return (preco * duracao)/100;
    }

    public double calculaImposto(){
        return calculaPrecoVenda() * 0.4;
    }
    
}
