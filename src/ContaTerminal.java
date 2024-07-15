import java.util.Scanner;

/**
 * Classe para simular a criação de uma conta bancária, solicitando dados do usuário via terminal e exibindo uma mensagem de boas-vindas com os dados inseridos.
 */
public class ContaTerminal {

    /**
     * Método principal do programa.
     * 
     * @param args Argumentos de linha de comando (não utilizados nesse caso).
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler dados do terminal.

        System.out.print("Por favor, digite o número da Agência: "); // Solicita a agência ao usuário.
        String agencia = scanner.nextLine(); // Lê a agência como texto (String).

        System.out.print("Por favor, digite o número da Conta: "); // Solicita a conta ao usuário.
        int numero = scanner.nextInt(); // Lê a conta como inteiro.
        scanner.nextLine(); // Consome o ENTER da linha anterior para evitar problemas na próxima leitura.

        System.out.print("Por favor, digite o nome do Cliente: "); // Solicita o nome do cliente ao usuário.
        String nomeCliente = scanner.nextLine(); // Lê o nome do cliente como texto (String).

        System.out.print("Por favor, digite o saldo inicial: "); // Solicita o saldo inicial ao usuário.
        double saldo = 0; // Inicializa a variável saldo com 0

        // Loop para solicitar o saldo até que uma entrada válida seja fornecida
        while (true) {
            try {
                saldo = scanner.nextDouble(); // Tenta ler o saldo como número decimal
                break; // Sai do loop se a leitura for bem-sucedida
            } catch (Exception e) { // Captura qualquer exceção durante a leitura
                System.out.println("Entrada inválida! Digite o saldo usando ',' (vírgula) como separador decimal."); // Informa o erro ao usuário
                scanner.nextLine(); // Limpa o buffer do Scanner
            }
        }

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque."); // Exibe a mensagem final com os dados inseridos.

        scanner.close(); // Fecha o Scanner para liberar os recursos.
    }
}