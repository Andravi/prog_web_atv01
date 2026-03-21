import java.util.Scanner; // 1. Importar a classe Scanner
import java.text.DecimalFormat;

public class Atividade01 {

    // úteis
    public static String numericoFormatado(Float numero) {
        // return String.format("%.2f", numero);
        DecimalFormat df = new DecimalFormat("0.00");
        String resultado = df.format(numero);
        return resultado;
    }

    // Sequencial
    public static void atv01() {
        System.out.println("Olá, Mundo!");
    }

    public static void atv02(Scanner sc) {
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        System.out.println("O número informado foi " + numero);
    }

    public static void atv03(Scanner sc) {
        int numero1, numero2, numero3;
        System.out.print("Digite o número 1: ");
        numero1 = sc.nextInt();
        System.out.print("Digite o número 2: ");
        numero2 = sc.nextInt();
        System.out.print("Digite o número 3: ");
        numero3 = sc.nextInt();

        float media = (numero1 + numero2 + numero3) / 3;
        System.out.println();
        System.out.println("O valor da médias dos números informados é: " + media);
    }

    public static void atv04(Scanner sc) {
        // Todo: E se colocar um . em vez de ,
        System.out.print("Digite o valor em metros: ");
        float metros = sc.nextFloat();
        float centimetros = metros * 100;
        System.out.println("Esse valor dá " + (String.valueOf(centimetros)).replace('.', ',') + " Centímetros!");
        System.out.println("Esse valor dá " + numericoFormatado(centimetros) + " Centímetros!");
    }

    public static void atv05(Scanner sc) {
        System.out.println("Digite o Raio do círculo: ");
        float raio = sc.nextFloat();
        System.out.println("A área desse circulo é " + (Math.PI * raio * raio));
    }

    // decição
    public static void atv06(Scanner sc) {
        // Pedir 3 valores dos produtos
        // No processo pegar o que tiver o menor valor
        // falar que a decisão de comprar é o menor.
        // TODO: E se mais de um tiver o menor preço?
        System.out.println("$ Lojinha de memórias $");
        System.out.print("Diga o preço da memoria RAM: ");
        float ram = sc.nextFloat();
        float precoMaisBarato = ram; // Sei que parece estranho, mas econimiza uma linha
        System.out.print("Diga o preço da memoria ROM: ");
        float rom = sc.nextFloat();
        if (rom < precoMaisBarato)
            precoMaisBarato = rom;
        System.out.print("Diga o preço da memoria Cache: ");
        float cache = sc.nextFloat();
        if (cache < precoMaisBarato)
            precoMaisBarato = cache;

        System.out.println(" ");
        if (precoMaisBarato == ram) {
            System.out.println("O produto mas barato é a memória RAM com o preço de R$" + numericoFormatado(precoMaisBarato));
        } else if (precoMaisBarato == rom) {
            System.out.println("O produto mas barato é a memória ROM com o preço de R$" + numericoFormatado(precoMaisBarato));
        } else {
            System.out.println("O produto mas barato é a memória cache com o preço de R$" + numericoFormatado(precoMaisBarato));
        }
    }

    public static void atv07() {
    }

    public static void atv08() {
    }

    public static void atv09() {
    }

    public static void atv10() {
    }

    // Repetição
    public static void atv11() {
    }

    public static void atv12() {
    }

    public static void atv13() {
    }

    public static void atv14() {
    }

    public static void atv15() {
    }

    public static void atv16() {
    }

    // Vetores
    public static void atv17() {
    }

    public static void atv18() {
    }

    public static void atv19() {
    }

    public static void atv20() {
    }

    public static void atv21() {
    }

    public static void atv22() {
    }

    public static void atv23() {
    }

    public static void main(String[] args) {

        boolean running = true;
        Scanner sc = new Scanner(System.in);

        while (running) {
            System.out.println("=============================== ");
            // System.out.println("(0 -> sair)");
            System.out.println(" ");
            System.out.print("Escolha a atividade, digite 1 até 23: ");
            int questao = sc.nextInt(); // Colocar try caght
            System.out.println(" ");
            System.out.println("=============================== ");

            switch (questao) {
                case 0:
                    running = false;
                    break;

                case 1:
                    atv01();
                    break;

                case 2:
                    atv02(sc);
                    break;

                case 3:
                    atv03(sc);
                    break;

                case 4:
                    atv04(sc);
                    break;

                case 5:
                    atv05(sc);
                    break;

                case 6:
                    atv06(sc);
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        sc.close();
    }

}
