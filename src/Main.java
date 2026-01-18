import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        List<Compras> listaCompras = new ArrayList<>();
        boolean loop = false;

        System.out.println("Digite o limite do cartao: ");
        int limiteCartao = leitura.nextInt();
        leitura.nextLine();
        Cartao cartao = new Cartao(limiteCartao);
        int faturaCartao = 0;

        while (!loop){
            System.out.println("Digite a descricao da compra: ");
            String descricaoCompra = leitura.nextLine();

            System.out.println("Digite o valor da compra: ");
            int valorCompra = leitura.nextInt();

            if(faturaCartao + valorCompra > cartao.getLimiteCartao()){
                System.out.println("Saldo insuficiente!");
                System.out.println();
                System.out.println("Compras realizadas:");

                Collections.sort(listaCompras);
                for (Compras compras : listaCompras){
                    System.out.println(compras);
                }
                System.out.println();
                System.out.println("Fatura do cartao: " + faturaCartao);
                break;

            }else{
                faturaCartao += valorCompra;
                Compras compras = new Compras(descricaoCompra, valorCompra);
                listaCompras.add(compras);
            }

            System.out.println("Digite 0 para sair ou 1 para continuar: ");
            int parar = leitura.nextInt();
            leitura.nextLine();
            if(parar == 0){
                Collections.sort(listaCompras);
                for(Compras compras : listaCompras){
                    System.out.println(compras);
                }
                System.out.println();
                System.out.println("Fatura do cartao: " + faturaCartao);
                loop = true;
            }else{
                continue;
            }
        }

    }
}