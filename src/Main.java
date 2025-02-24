import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    //Função para converter 
        public static int romano2decimal(String romano)
        {
            int total = 0;
            int n = romano.length(); // retorna o tamanho do numero romano

          //Mapeando numeros romando para inteiros 
            Map<Character, Integer> mapa = new HashMap<>();
                mapa.put('I', 1);
                mapa.put('V', 5);
                mapa.put('X', 10);
                mapa.put('L', 50);
                mapa.put('C', 100);
                mapa.put('D', 500);
                mapa.put('M', 1000);

            //percorre a String de romano    
            for(int i = 0; i < n; i++){
                int valorAtual = mapa.get(romano.charAt(i));

                if(i < n - 1 && valorAtual <mapa.get(romano.charAt( i + 1)))
                    total -= valorAtual; // Subtrai
                else
                   total += valorAtual; //Soma  
            }
            return total;
        } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero romano: ");
        String romano = scanner.nextLine().trim().toUpperCase();

        int resultado = romano2decimal(romano);
        System.out.println("Decimal: " + resultado);

        scanner.close();
    }
}