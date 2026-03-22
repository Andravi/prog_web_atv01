import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade01 {

    // úteis
    public static String numericoFormatado(Float numero) {
        // return String.format("%.2f", numero);
        DecimalFormat df = new DecimalFormat("0.00");
        String resultado = df.format(numero);
        return resultado;
    }

    public static float pedirNotasRetornarMedia(Scanner sc, int vezes) {
        float media = 0;

        for (int i = 0; i < vezes; i++) {
            System.out.print("Digite a " + (i + 1) + "° nota: ");
            media += sc.nextInt();
        }

        media = media / vezes;
        return media;
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return false; 
        }
        return true;
    }

    public static int multiplicarVetor(int[] arr) {
        int res = 1;

        for (int i : arr) {
            res *= i;
        }

        return res;
    }

    public static boolean isPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void mostrarArray(int[] array) {
        System.out.print("| - ");
        for (int i : array) {
            System.out.print(i + " - ");
        }
        System.out.print("|");
        System.out.println("");
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
            System.out.println(
                    "O produto mas barato é a memória RAM com o preço de R$" + numericoFormatado(precoMaisBarato));
        } else if (precoMaisBarato == rom) {
            System.out.println(
                    "O produto mas barato é a memória ROM com o preço de R$" + numericoFormatado(precoMaisBarato));
        } else {
            System.out.println(
                    "O produto mas barato é a memória cache com o preço de R$" + numericoFormatado(precoMaisBarato));
        }
    }

    public static void atv07(Scanner sc, int vezes) {
        float media = pedirNotasRetornarMedia(sc, vezes);
        System.out.println("A média aritmética foi: " + numericoFormatado(media));
        if (media >= 7) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
        }
    }

    public static void atv08(Scanner sc) {
        System.out.println("! Calculadora de média final! ");
        float media = pedirNotasRetornarMedia(sc, 2);

        System.out.println("Média: " + numericoFormatado(media));

        if (media >= 7) {
            System.out.println("Aluno aprovado!");

        } else if (media >= 4) {
            System.out.println("Aluno de AF!");
            System.out.print("Informe a nota da AF:");
            float AF = sc.nextFloat();

            System.out.println("Média: " + numericoFormatado((media + AF) / 2));
            if ((media + AF) / 2 >= 5) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno Reprovado!!!");
            }

        } else {
            System.out.println("Aluno Reprovado!!!");
        }
    }

    public static void atv09(Scanner sc) {
        System.out.println("Digite o primeiro número: ");
        int maior = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundo = sc.nextInt();
        if (segundo > maior)
            maior = segundo;

        System.out.println("Digite o segundo número: ");
        int terceiro = sc.nextInt();
        if (terceiro > maior)
            maior = terceiro;

        System.out.println("O maior número foi o " + maior);
    }

    public static void atv10(Scanner sc) {
        System.out.println("Digite um número");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " é Par");
            return;
        }
        System.out.println(numero + " não é Par");
    }

    // Repetição
    public static void atv11(Scanner sc) {
        System.out.println("---------Tabuada---------");
        System.out.print("Escolha um número entre 0 e 10: ");
        int num = sc.nextInt();

        if (num < 0 || num > 10) {
            System.out.println("Opção inválida");
            return;
        }

        System.out.println("=============================== ");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " X " + i + " -> " + (num * i));
        }
        System.out.println("=============================== ");

    }

    public static void atv12(Scanner sc) {

        boolean running = true;

        while (running) {

            System.out.print("Digite uma nota entre 0 e 10: ");
            int num = sc.nextInt();

            if (num < 0 || num > 10) {
                System.out.println("Nota inválida");
                continue;
            }
            System.out.println("Nota válida");
            running = false;
        }

    }

    public static void atv13(Scanner sc) {
        int numCandidatos = 3;
        int eleitoresNumero = 3;

        int Cand1Votos = 0;
        int Cand2Votos = 0;
        int Cand3Votos = 0;

        System.out.println("=======Candidatos=======");
        for (int i = 0; i < numCandidatos; i++) {
            int temp = i + 1;
            System.out.println("Candidato " + temp + " -> " + temp);
        }
        System.out.println("========================");

        while (true) {
            for (int i = 0; i < eleitoresNumero; i++) {
                System.out.print("Eleitor " + (i + 1) + ". Digite o número do candidato escolhido: ");
                int voto = sc.nextInt();

                if (voto == 1) {
                    Cand1Votos++;
                } else if (voto == 2) {
                    Cand2Votos++;
                } else if (voto == 3) {
                    Cand3Votos++;
                } else {
                    i--;
                    System.out.println("Cadidato inválido, escolha uma opção válida!");
                }

            }
            break;
        }
        System.out.println("=========Votos==========");

        System.out.println("Candidato 1 -> " + Cand1Votos + " Votos");
        System.out.println("Candidato 2 -> " + Cand2Votos + " Votos");
        System.out.println("Candidato 3 -> " + Cand3Votos + " Votos");

        System.out.println("========================");
    }

    public static void atv14(Scanner sc) {
        System.out.println("====é ou não é primo====");
        short repeticoes = 10;
        for (int i = 0; i < repeticoes; i++) {
            System.out.print("Numero " + (i + 1) + "° número: ");
            int num = sc.nextInt();
            if (num < 1) {
                i--;
                System.out.println("número inválido");
                continue;
            }
            if (isPrimo(num)) {
                System.out.println(num + " É primo!");
            } else {
                System.out.println(num + " Não é primo!");
            }
        }
    }

    public static void atv15() {
        System.out.println("10 primeiros números do fibonacci");
        int num = 1;
        int antNum = 0;
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.print(antNum);
                continue;
            }

            System.out.print('-');

            temp = num;
            num = num + antNum;
            antNum = temp;
            System.out.print(antNum);
        }
        System.out.println("");

    }

    public static void atv16(Scanner sc) {

        System.out.print("digite um número inteiro positivo: ");
        int num = sc.nextInt();
        int montante = 1;

        for (int i = num; i > 0; i--) {
            montante *= i;
        }

        System.out.println("O resultado do fatorial do número é: " + montante);

    }

    // Vetores
    public static void atv17(Scanner sc) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite um número: ");
            array[i] = sc.nextInt();
            System.out.println("");
        }

        System.out.println("os números do Vetor são: ");
        for (int i : array) {
            System.out.print(i + " - ");
        }
        System.out.println("");
    }

    public static void atv18(Scanner sc) {
        float[] array = new float[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + "°. Digite um número real: ");
            array[i] = sc.nextFloat();
            System.out.println("");
        }

        System.out.println("os números do Vetor são: ");
        for (int i = array.length; i > 0; i--) {
            System.out.print(array[i - 1] + " - ");
        }
        System.out.println("");
    }

    public static void atv19(Scanner sc) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite um número: ");
            array[i] = sc.nextInt();
            System.out.println("");
        }

        System.out.println("A multiplicação entre os 5 números é: " + multiplicarVetor(array));

        System.out.println("os números do Vetor são: ");
        System.out.print("| - ");
        for (int i : array) {
            System.out.print(i + " - ");
        }
        System.out.print("|");
        System.out.println("");
    }

    public static void atv20(Scanner sc) {
        int[] array = new int[20];

        int numPar = 0;
        int numImpar = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite um número: ");
            array[i] = sc.nextInt();
            if (isPar(array[i])) {
                numPar++;
            } else {
                numImpar++;
            }

            System.out.println("");
        }

        int[] par = new int[numPar];
        int[] impar = new int[numImpar];

        int parCount = 0;
        int imparCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (isPar(array[i])) {
                par[parCount] = array[i];
                parCount++;
            } else {
                impar[imparCount] = array[i];
                imparCount++;
            }
        }
        System.out.println("Vetor completo:");
        mostrarArray(array);
        System.out.println("Vetor de Pares completo:");
        mostrarArray(par);
        System.out.println("Vetor de Impares completo:");
        mostrarArray(impar);

    }

    public static void atv21(Scanner sc) {

        String[] strs = new String[2];

        System.out.println("Digite a primeira String: ");
        strs[0] = sc.next();

        System.out.println("Digite a segunda String: ");
        strs[1] = sc.next();

        System.out.println("A primeira string foi |" + strs[0] + "| com o comprimento de " + strs[0].length());
        System.out.println("A segunda string foi |" + strs[1] + "| com o comprimento de " + strs[1].length());

        System.out.println("============================");
        System.out.print("As String tem os comprimentos ");
        if (strs[0].length() == strs[1].length()) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
        System.out.println("============================");
        System.out.print("As String tem o conteúdo ");
        if (strs[0].equals(strs[1])) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }
    }

    public static void atv22(Scanner sc) {

        System.out.print("Digite um número inteiro a ser invertido:");
        String num = sc.next();
        String numInvertido = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            numInvertido += num.toCharArray()[i];
        }

        System.out.println("Inversão:");
        System.out.println(num + " <-> " + numInvertido);

    }

    public static void atv23(Scanner sc) {
        System.out.println("+====Super Calculadora===+");
        System.out.print("Digite o primeiro número: ");
        float numero1 = sc.nextFloat();
        System.out.print("Digite o segundo número: ");
        float numero2 = sc.nextFloat();

        boolean running = true;
        String res = "";
        while (running) {

            System.out.println("=====OPÇÕES DE OPERAÇÕES=====");
            System.out.println("1 -> Somar");
            System.out.println("2 -> Subtrair");
            System.out.println("3 -> Multiplicar");
            System.out.println("4 -> Dividir");

            System.out.println("Escolha a operação:");
            String op = sc.next();


            switch (op) {
                case "1":
                    res = "A Soma de " + numero1 + " + " + numero2 + " = " + (numero1 + numero2);
                    running = false;
                    break;

                case "2":
                    res = "A Subtração de " + numero1 + " - " + numero2 + " = " + (numero1 - numero2);
                    running = false;
                    break;

                case "3":
                    res = "A Multiplicação de " + numero1 + " * " + numero2 + " = " + (numero1 * numero2);
                    running = false;
                    break;

                case "4":
                    res = "A Divisão de " + numero1 + " / " + numero2 + " = " + (numero1 / numero2);
                    running = false;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        
        }
        System.out.println(res.replace('.', ','));
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

                case 7:
                    int n = 4;
                    atv07(sc, n);
                    break;

                case 8:
                    atv08(sc);
                    break;

                case 9:
                    atv09(sc);
                    break;

                case 10:
                    atv10(sc);
                    break;

                case 11:
                    atv11(sc);
                    break;

                case 12:
                    atv12(sc);
                    break;

                case 13:
                    atv13(sc);
                    break;

                case 14:
                    atv14(sc);
                    break;

                case 15:
                    atv15();
                    break;

                case 16:
                    atv16(sc);
                    break;

                case 17:
                    atv17(sc);
                    break;

                case 18:
                    atv18(sc);
                    break;

                case 19:
                    atv19(sc);
                    break;

                case 20:
                    atv20(sc);
                    break;

                case 21:
                    atv21(sc);
                    break;

                case 22:
                    atv22(sc);
                    break;

                case 23:
                    atv23(sc);
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        sc.close();
    }

}
