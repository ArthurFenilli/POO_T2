public class Main {

    public static void main(String args[]){
        App app = new App();
        try {
            app.executa();
        } catch (Exception e) {
            System.out.println("Erro de execução do programa: " + e);
        }
        
    }
    
}
