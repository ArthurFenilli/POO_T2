public enum Categoria {
    ACAO("Ação",0.2),
    ESTRATEGIA("Estratégia",0.4),
    ESPORTE("Esporte",0.3),
    SIMULACAO("Simulação",0.5),
    RPG("RPG",0.7);

    private final String nome;
    private final double porcentagem;

    private Categoria(final String nome, final double porcentagem){
        this.nome = nome;
        this.porcentagem = porcentagem;
    }

    public double getPorcentagem(){
        return porcentagem;
    }

    public Categoria fromNome(final String nomes){
        for (final Categoria categoria : Categoria.values()) {
            if (categoria.nome.equalsIgnoreCase(nomes)) {
                return categoria ;
            }
        }
        throw new IllegalArgumentException(nomes);

    }



    
}
