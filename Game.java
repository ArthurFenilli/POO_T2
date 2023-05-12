public class Game extends AudioVisual {
    private Categoria categoria;

    public Game(String titulo, double preco, Categoria categoria){
        super(titulo, preco);
        this.categoria = categoria;
    }

    public double calculaPrecoVenda(){
        return (super.getPrecoBase() * categoria.getPorcentagem()) + super.getPrecoBase();
    }

    public double calculaImposto(){
        return calculaPrecoVenda() * 0.5;
    }


    
}
