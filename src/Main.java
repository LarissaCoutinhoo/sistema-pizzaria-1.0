import java.time.LocalDateTime;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        String[] nomesClientes = new String[10];
        LocalDateTime[] horarios = new LocalDateTime[10];
        String[] itensPedidos = new String[10];
        double[] valoresPedidos = new double[10];
        int quantidadePedidos = 0;
        double faturamentoDia = 0;
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        while (menu != 4){
            System.out.println("Seja bem-vindo ao sistema Pizzaria Dona Margherita!\nSelecione a opção desejada." + "\n 1-NOVO PEDIDO \n 2-LISTAR PEDIDOS \n 3-FATURAMENTO DO DIA \n 4-ENCERRAR");
            menu = scanner.nextInt();
            scanner.nextLine();
            switch(menu){
                case 1:
                    System.out.println("Nome do cliente:");
                    nomesClientes[quantidadePedidos] = scanner.nextLine();
                    horarios[quantidadePedidos] = LocalDateTime.now();
                    double totalpedido = 50.5;
                    faturamentoDia += totalpedido;
                    quantidadePedidos ++;
                    break;
                case 2:
                    System.out.println("Não funciona ainda");
                    break;
                case 3:
                    System.out.println("Seu faturamento total do dia foi R$" +faturamentoDia);
                    break;
                case 4:
                    System.out.println("Obrigado por usar esse sistema. Até breve!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

    }
}