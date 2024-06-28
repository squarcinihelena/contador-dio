import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm;
        int parametroDois;

        System.out.println("Digite o primeiro parâmetro");
        parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } finally {
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo");
        }
        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i <= contagem; i++) {
            System.out.println(parametroUm + i);
        }
    }
}
