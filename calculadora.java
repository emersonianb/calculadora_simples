import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class calculadora {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero a operação e em seguida enter");

        String linha = sc.nextLine();
        String[] valores = linha.split("\\s");
        List<ArrayList<Integer>> ordem = new ArrayList<>();
        //List<Integer> lista = new ArrayList<>();
        for (int x = 0; x < 4; x++){
            ordem.add(new ArrayList<Integer>());
        }

        for (int i = 1; i < valores.length; i++){
            if (i % 2 != 0){
                switch (valores[i]) {
                    case "+" -> ordem.get(3).add(i);
                    case "-" -> ordem.get(2).add(i);
                    case "*" -> ordem.get(1).add(i);
                    case "/" -> ordem.get(0).add(i);
                }
            }
        }
        double result = 0;
        if (valores.length == 3){
            double num1 = Integer.parseInt(valores[0]);
            double num2 = Integer.parseInt(valores[2]);
            switch (valores[1]){
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
            }
        }

        System.out.printf("Seu resultado é: %.2f", result);
    }

}
