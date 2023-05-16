public class App {

    private Acervo acervo;

    public App(){
        acervo = new Acervo();
    }

    public void executa(){
        try{
        acervo.leituraDeArquivo();
        }
        catch(Exception e){
            System.out.println("Erro na leitura do arquivo.");
        }
        try{
        acervo.escritaDeArquivo();
        }
        catch(Exception e ){
            System.out.println("Erro na escrita do arquivo."); 
        }
    }
    
}
