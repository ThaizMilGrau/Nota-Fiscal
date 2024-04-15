import java.util.Scanner;

public class NotaFiscal {

    private String empresa;

    private int cnpj;

    private String naturezaDaTransacao;

    private String formaDePagamento;

    private float valor;

    private String produtoServico;

    private String hora;

    private String data;

    public static void main(String[] args) {
        //Criando uma instância de Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //criando uma instancia
        NotaFiscal nota = new NotaFiscal();

        //Capiturando valores da nota fiscal do usuário
        System.out.print("Digite o nome da empresa: ");
        nota.empresa = scanner.nextLine();

        System.out.print("Digite o CNPJ da empresa: ");
        nota.cnpj = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a natureza da transação: ");
        nota.naturezaDaTransacao = scanner.nextLine();

        System.out.print("Digite a forma de pagamento: ");
        nota.formaDePagamento = scanner.nextLine();

        System.out.print("Digite o valor da nota: ");
        nota.valor = Float.parseFloat(scanner.next());
        scanner.nextLine();

        System.out.print("Tipo de produto/Serviço: ");
        nota.produtoServico = scanner.nextLine();

        System.out.print("Digite o horário:" );
        nota.hora = scanner.nextLine();

        System.out.print("Digite a data: ");
        nota.data = scanner.nextLine();

        //Exibindo a nota fiscal

        System.out.println("--- Nota Fiscal ---");
        System.out.println ("Empresa: " + nota.empresa);
        System.out.println ("CNPJ: " + nota.cnpj);
        System.out.println ("Natuteza da transação: " + nota.naturezaDaTransacao);
        System.out.println ("Forma de pagamento: " + nota.formaDePagamento);
        System.out.println ("Valor da Nota: " + nota.valor);
        System.out.println ("Produto: " + nota.produtoServico);
        System.out.println ("Hora: " + nota.hora);
        System.out.println ("Data: " + nota.data);

        //Fechando o scanner
        scanner.close();
    }
}