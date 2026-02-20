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
            switch(menu) {
                case 1:
                    if(quantidadePedidos >= 10){
                        System.out.println("Não é possível registrar mais pedidos hoje.");
                        break;
                    }
                    System.out.println("Nome do cliente:");
                    nomesClientes[quantidadePedidos] = scanner.nextLine();
                    horarios[quantidadePedidos] = LocalDateTime.now();
                    int opcaoItem;

                    double totalPedido = 0;
                    String pedidoItens = "";

                    do {
                        System.out.println("CARDÁPIO\n 1. Mussarela - R$45,00\n 2. Margherita - R$55,00\n 3. Portuguesa R$45,00\n 4.Coca Cola 2l R$10,00\n 0. Finalizar Pedido");
                        opcaoItem = scanner.nextInt();
                        if (opcaoItem < 0 || opcaoItem > 4){
                            System.out.println("Opção inválida! Tente novamente.");
                            continue;
                        }
                        if(opcaoItem == 1) {
                            totalPedido += 45;
                            pedidoItens += "Mussarela, ";
                        };
                        if(opcaoItem == 2) {
                            totalPedido += 55;
                            pedidoItens += "Margherita, ";
                        }
                        if(opcaoItem == 3){
                            totalPedido += 45;
                            pedidoItens += "Portuguesa, ";
                        }
                        if(opcaoItem == 4){
                            totalPedido += 10;
                            pedidoItens += "Coca Cola, ";
                        }
                    } while (opcaoItem != 0);

                    System.out.println("Pedido registrado com sucesso.");

                    if(pedidoItens.length() > 2){
                        pedidoItens = pedidoItens.substring(0, pedidoItens.length() - 2);
                    }

                    valoresPedidos[quantidadePedidos] = totalPedido;
                    itensPedidos[quantidadePedidos] = pedidoItens;
                    faturamentoDia += totalPedido;
                    quantidadePedidos++;
                    break;
                case 2:
                    for(int i = 0; i < quantidadePedidos; i++){
                        System.out.println("Pedido " + (i+1));
                        System.out.println("Cliente: " + nomesClientes[i]);
                        System.out.println("Data e Horário: " + horarios[i]);
                        System.out.println("Itens Pedidos: " + itensPedidos[i]);
                        System.out.println("Total do Pedido R$:" + valoresPedidos[i]);
                        System.out.println("---------------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("Seu faturamento total do dia foi R$" + faturamentoDia);
                    break;
                case 4:
                    System.out.println("Obrigado por usar esse sistema. Até breve!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}