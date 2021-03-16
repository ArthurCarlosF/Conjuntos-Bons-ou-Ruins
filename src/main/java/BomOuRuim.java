import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class BomOuRuim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String novaLinha;
        ArrayList<String> listaPalavras= new ArrayList<>();

        int quant=0;

        while (!"0".equals((novaLinha = br.readLine()))) {//1- Ler até encontrar um 0
         StringTokenizer st= new StringTokenizer(novaLinha);
         if(st.hasMoreTokens()){
             quant=Integer.parseInt(st.nextToken());

             while(quant>0){
                 listaPalavras.add(br.readLine());
                 quant--;
             }
             if(ConjuntoBom(listaPalavras)){
                 System.out.println("Conjunto Bom");
             }else{
                 System.out.println("Conjunto Ruim");
             }
             listaPalavras= new ArrayList<>();
         }
        }

    }
    public static boolean ConjuntoBom(ArrayList<String> lista){//Recebe uma lista e verifica se é bom ou ruim
        boolean bom=true;
        int i=0;
        int j=0;
        for(String palavraAtual:lista){
            j=0;
            for(String palavraComparada: lista){
                if((palavraComparada.indexOf(palavraAtual)==0)&&(i!=j)){
                   // System.out.println(palavraComparada+" contem "+palavraAtual+" como prefixo");
                bom=false;
                }
                j++;
            }
            i++;
        }

        return bom;
    }
}
