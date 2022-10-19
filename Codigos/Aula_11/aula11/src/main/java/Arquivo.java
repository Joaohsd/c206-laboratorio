import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Arquivo {
    public String nomeArquivo;

    private OutputStream os;
    private OutputStreamWriter osw;
    private BufferedWriter bf;

    private InputStream is;
    private InputStreamReader isr;
    private BufferedReader br;

    private String linha;

    public Arquivo(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
        // Inicializando com null
        os = null;
        osw = null;
        bf = null;

        is = null;
        isr = null;
        br = null;
    }

    public void escrever(Funcionario funcionario){
        try{
           os = new FileOutputStream(this.nomeArquivo, true);
           osw = new OutputStreamWriter(os);
           bf = new BufferedWriter(osw);

           bf.write("Funcionario" + "\n");
           bf.write(funcionario.nome + "\n");
           bf.write(funcionario.idade + "\n");
           bf.write(funcionario.cpf + "\n");
        }catch(Exception e){
            System.out.println(e);
        }finally {
            try{
                bf.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public ArrayList<Funcionario> ler(){
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try{
            is = new FileInputStream(this.nomeArquivo);
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linha = br.readLine();
            while(linha != null) {
                if (linha.contains("Funcionario")) {
                    Funcionario f = new Funcionario();
                    f.nome = br.readLine();
                    f.idade = Integer.parseInt(br.readLine());
                    f.cpf = br.readLine();
                    funcionarios.add(f);
                }
                linha = br.readLine();
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            try{
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        return funcionarios;
    }
}
