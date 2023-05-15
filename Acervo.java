import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
public class Acervo {
    private ArrayList<AudioVisual> lista;

    public Acervo(){
        lista = new ArrayList<AudioVisual>();
    }

    public void leituraDeArquivo(){
        Path path = Paths.get("C:/Users/T-Gamer/Downloads/dados.csv");
        try (BufferedReader br = Files.newBufferedReader(path,Charset.defaultCharset())) {
        String linha = null;
        while ((linha = br.readLine()) != null) {
        Scanner sc = new Scanner(linha).useDelimiter(";");
        if(linha.contains(";1;")){
            String titulo = sc.next();
            double preco = Double.parseDouble(sc.next());
            sc.next();
            int duracao = Integer.parseInt(sc.next());
            BluRay b = new BluRay(titulo,preco,duracao);
            lista.add(b);
        }
        else if(linha.contains(";2;")){
            String titulo2 = sc.next();
            double preco2 = Double.parseDouble(sc.next());
            sc.next();
            String categoria = sc.next();
            Categoria categoria_r = Categoria.fromNome(categoria);
            Game game = new Game(titulo2, preco2,categoria_r );
            lista.add(game);

        }
        else{
            
        }
        }
        }
        catch (IOException e) {
            System.err.format("Erro na leitura de arquivos:" + e);
        }
    }

    public AudioVisual get(int i){
        return lista.get(i);
    }

    public void escritaDeArquivo(){
        Path path = Paths.get("C:/Users/T-Gamer/Downloads/resultado.csv");

    
        try(PrintWriter p = new PrintWriter(Files.newBufferedWriter(path, Charset.defaultCharset()))){
            int count = 0;
            //1
            p.format("%d;%d%n",1,lista.size());
            //2

            for(int i = 0; i<lista.size();i++){

                p.format("%d;%s;%f;%f%n",2,lista.get(i).getTitulo(),lista.get(i).calculaPrecoVenda(),lista.get(i).calculaImposto());
            
            }

            //3

            for(int i = 0; i<lista.size();i++){

                if(lista.get(i) instanceof Game){
                    Game a = (Game)lista.get(i);
                    Categoria b = a.getCategoria();
                    if(b == Categoria.RPG){
                        count ++;
                    }
                }
            
            }
            p.format("%d;%d%n",3,count);

        }
        catch (IOException e){
            System.out.println("Erro na escrita de arquivos " + e);
        }

    }
}
