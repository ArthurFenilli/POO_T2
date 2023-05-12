import java.io.BufferedReader;
import java.io.IOException;
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
        Path path = Paths.get("a");
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
        else{
            String titulo2 = sc.next();
            double preco2 = Double.parseDouble(sc.next());
            sc.next();
            String categoria = sc.next();

        }
        }
        }
        catch (IOException e) {
            System.err.format("Erro na leitura de arquivos");
        }
    }
}