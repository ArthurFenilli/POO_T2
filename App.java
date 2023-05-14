public class App {

    private Acervo acervo;

    public App(){
        acervo = new Acervo();
    }

    public void executa(){
        acervo.leituraDeArquivo();
        System.out.println(acervo.get(0).getPrecoBase());
    }
    
}
