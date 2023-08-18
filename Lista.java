import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;
import java.lang.Math;

public class Lista {
    public static void main(String[] args) {
        System.out.println("\nExercícios de Java");
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.print("\n- Exercício 1 ");
            System.out.print("\n- Exercício 2 \n\nDigite: ");
            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                opcao = -1;
                sc.next();
            }

            switch (opcao) {
                case 0:
                    System.out.println("Obrigado!");
                    break;
                case 1:
                    do {
                        int escolha;
                        System.out.print("\n\n1- Média\n");
                        System.out.print("2- Área\n");
                        System.out.print("3- Volume\n");
                        System.out.print("4- Multiplicação\n");
                        System.out.print("5- Bhaskara\n");
                        System.out.print("6- Velocidado média\n");
                        System.out.print("7- Imposto\n");
                        System.out.print("8- Par ou Impar\n");
                        System.out.print("9- Comparação de strings\n");
                        System.out.print("10- Exemplo de string com .\n");
                        System.out.print("12- Sair\n\n- Digite: ");
                        try {
                            escolha = sc.nextInt();
                        } catch (InputMismatchException e) {
                            escolha = -1;
                            sc.next();
                        }
                        switch (escolha) {
                            case 0:
                                System.out.print("Obrigado");
                            case 1:
                                System.out.print("\nDigite a nota um: ");
                                int notaUm = sc.nextInt();
                                System.out.print("Digite a nota dois: ");
                                int notaDois = sc.nextInt();
                                System.out.print("Digite a nota três: ");
                                int notaTres = sc.nextInt();
                                int media = (notaUm + notaDois + notaTres) / 3;
                                System.out.print("\nA média é: " + media);
                                break;
                            case 2:
                                System.out.print("\nDigite o valor do lado 1: ");
                                int areaUm = sc.nextInt();
                                System.out.print("Digite o valor do lado 2: ");
                                int areaDois = sc.nextInt();
                                int area = (areaUm * areaDois);
                                System.out.print("\nA área é: " + area);
                                break;
                            case 3:
                                System.out.print("\nDigite o valor da altura: ");
                                int altura = sc.nextInt();
                                System.out.print("Digite o valor da largura: ");
                                int largura = sc.nextInt();
                                System.out.print("Digite o valor da profundidade: ");
                                int profun = sc.nextInt();
                                int volume = (altura * largura * profun);
                                System.out.print("\nO valor do volume é: " + volume);
                                break;
                            case 4:
                                System.out.print("\nDigite um valor que vem na sua cabeça: ");
                                int valorUm = sc.nextInt();
                                System.out.print("Digite um valor que será multiplicado por 2: ");
                                int valorDois = sc.nextInt();
                                if ((valorDois * 2) < valorUm) {
                                    System.out.print("\nO valor que veio na sua cabeça é MAIOR que o valor multiplicado");
                                } else {
                                    System.out.print("\nO valor que veio na sua cabeça é MENOR que o valor multiplicado");
                                }
                                break;
                            case 5:
                                System.out.print("\nDigite o valor de a: ");
                                int a = sc.nextInt();
                                System.out.print("Digite o valor de b: ");
                                int b = sc.nextInt();
                                System.out.print("Digite o valor de c: ");
                                int c = sc.nextInt();
                                int delta = (b * b) + (-4 * (a * c));
                                System.out.print("\nO valor de Delta é: " + delta);
                                if (delta >= 0) {
 
                                    double x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
                                    double x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
                         
                                    System.out.println("\nx1: " + x1);
                                    System.out.println("x2: " + x2);
                         
                                } else {
                                    System.out.println("\n\nDelta não possui raiz!");
                                    System.exit(0);
                                }
                                break;
                            case 6:
                                System.out.print("\nDigite a distância em KM: ");
                                double velocidade = sc.nextInt();
                                System.out.print("Digite o tempo de viagem em horas: ");
                                double tempo = sc.nextInt();
                                double veloMedia = (velocidade / tempo);
                                System.out.print("\nA velocidade média será de " + veloMedia);
                                break;
                            case 7:
                                System.out.print("\nDigite o faturamento do mês: ");
                                double faturamento = sc.nextInt();
                                System.out.print("Digite a quantidade de imposto cobrado em cima dele: ");
                                double imposto = sc.nextInt();
                                double qtdImposto = (faturamento / imposto);
                                System.out.print("\nO percentual de imposto pago foi de R$" + qtdImposto + " reais");
                                break;
                            case 8:
                                System.out.print("\nDigite um número: ");
                                int numero = sc.nextInt();
                                if (numero % 2 == 0) {
                                    System.out.print("\nEle é par");
                                } else {
                                    System.out.print("\nEle é ímpar");
                                }                         
                                break;
                            case 9:
                                System.out.print("\nDigite uma letra: ");
                                char stringUm = sc.next().charAt(0);
                                System.out.print("\nDigite outra letra: ");
                                char stringDois = sc.next().charAt(0);
                                if (stringUm == stringDois) {
                                    System.out.print("\nEles são iguais");
                                } else {
                                    System.out.print("\nEles não são iguais");
                                }                         
                                break;
                            case 10:
                                String frase = "Exemplo.";
                                int number = Integer.parseInt(frase);
                                System.out.print(number);                                
                                break;
                            case 11:
                                System.out.print("\nDigite qual é o seu faturamento: R$");
                                int salario = sc.nextInt();
                                if (salario <= 1903) {
                                    System.out.print("\n	Você está isento de impostos");
                                } else if ((salario >= 1903) && (salario <= 2826)){
                                    System.out.print("\n	Os impostos cobrado será de: 7,5%");
                                } else if ((salario >= 2826) && (salario <=  3751)){
                                    System.out.print("\n	Os impostos cobrado será de: 15%");
                                } else if ((salario >= 3751) && (salario <= 4664)){
                                    System.out.print("\n	Os impostos cobrado será de: 22,5%");
                                } else if (salario >= 4664){
                                    System.out.print("\n	Os impostos cobrado será de: 27,5%");
                                }                  
                                break;
                            case 12:
                                sc.close();
                            default:
                            System.out.print("Opção inválida");
                            break;               
                        }
                    } while (opcao != 0);
                    sc.close();
                    case 2:
                        do {
                        int escolha;
                        System.out.print("\n\n1- Média\n");
                        System.out.print("2- mês\n");
                        System.out.print("3- \n");
                        System.out.print("4- Tabuada\n");
                        System.out.print("5- \n");
                        System.out.print("6- Números primos\n");
                        System.out.print("7- \n");
                        System.out.print("8- Fatorial\n");
                        System.out.print("9- Obesidade\n");
                        System.out.print("10- Operações\n");
                        System.out.print("12- Sair\n\n- Digite: ");
                        try {
                            escolha = sc.nextInt();
                        } catch (InputMismatchException e) {
                            escolha = -1;
                            sc.next();
                        }
                        switch (escolha) {
                            case 0:
                                System.out.print("Obrigado");
                            case 1:
                                System.out.print("\nDigite a nota um: ");
                                float notaUm = sc.nextFloat();
                                System.out.print("Digite a nota dois: ");
                                float notaDois = sc.nextFloat();
                                System.out.print("Digite a nota três: ");
                                float notaTres = sc.nextFloat();
                                float media = ((notaUm + notaDois + notaTres) / 3);
                                if (media >= 7) {
                                    System.out.print("\nSua média foi: " + media);
                                    System.out.print("\nParabéns! você passou!!");
                                } else {
                                    System.out.print("\nSua média foi: " + media);
                                    System.out.print("\nVocê reprovou!! estude mais");
                                }                        
                                break;
                            case 2:
                                System.out.print("\nDigite um número e eu vou acertar qual mês ele represente: ");
                                int mes = sc.nextInt();
                                if ((mes >= 1) && (mes <= 12)) {
                                    if ((mes >= 1) && (mes <= 12)) {
                                        if (mes == 1) {
                                            System.out.print("\nO mês é Janeiro\n");
                                        } else if (mes == 2) {
                                            System.out.print("\nO mês é Fevereiro\n");
                                        } else if (mes == 3) {
                                            System.out.print("\nO mês é Março\n");
                                        } else if (mes == 4) {
                                            System.out.print("\nO mês é Abril\n");
                                        } else if (mes == 5) {
                                            System.out.print("\nO mês é Maio\n");
                                        } else if (mes == 6) {
                                            System.out.print("\nO mês é Junho\n");
                                        } else if (mes == 7) {
                                            System.out.print("\nO mês é Julho\n");
                                        } else if (mes == 8) {
                                            System.out.print("\nO mês é Agosto\n");
                                        } else if (mes == 9) {
                                            System.out.print("\nO mês é Setebro\n");
                                        } else if (mes == 10) {
                                            System.out.print("\nO mês é Outubro\n");
                                        } else if (mes == 11) {
                                            System.out.print("\nO mês é Novembro\n");
                                        } else if (mes == 12) {
                                            System.out.print("\nO mês é Dezembro\n");
                                        }
                                    }
                                } else {
                                    System.out.print("\nA opção digitada não é valida, verifique o que foi digitada!");
                                    break;
                                }
                            case 3:
                                break;
                            case 4:
                                System.out.println("\n\tTABUADA\n");
                                for(int i = 1; i <= 10; i++) {
                                    for(int mult = 0; mult <=10; mult++) {
                                        int resultado = i * mult;
                                        System.out.print(i + " x " + mult + " = " + resultado);
                                        System.out.println(" ");
                                    }
                                    System.out.println(" ");
                                }
                                break;
                            case 5:
                                break;
                            case 6:
                            int soma = 0;

                            for (int i = 1; i <= 500; i++) {
                                if (i % 2 != 0 && i % 7 == 0) {
                                    soma += i;
                                }
                            }
                            System.out.println("\nA soma é: " + soma);
                            case 7:
                                break;
                            case 8:
                                System.out.println("Digite um número");
                                int numero = sc.nextInt();
                                int fatorial = 1;
                                for (int i = 1; i <= numero; i++){
                                    fatorial *= i;
                                }
                                System.out.println("O fatorial de " + numero + " é: " + fatorial);
                                break;
                            case 9:
                                System.out.println("Qual a sua altura: ");
                                double altura = sc.nextDouble();
                                System.out.println("Qual o seu peso: ");
                                double peso = sc.nextDouble();
                                double alturaDois = altura * altura;
                                double IMC = peso / alturaDois;    
                                if(IMC < 18.5){
                                    System.out.println("Você está abaixo do peso");
                                } else if(IMC >= 18.5 && IMC <= 24.9){
                                    System.out.println("Peso perfeito!");
                                } else if(IMC >= 25 && IMC <= 29.9){
                                    System.out.println("Você está acima do Peso");
                                } else if(IMC >= 30 && IMC <= 34.9){
                                    System.out.println("Obesidade grau 1");
                                } else if(IMC >= 35 && IMC <= 39.9){
                                    System.out.println("Obesidade grau 2");
                                } else if(IMC >= 40){
                                    System.out.println("Obesidade grau 3 (mórbida)");
                                }
                                break;
                            case 10:
                                System.out.println("Digite um número inteiro: ");
                                int numUm = sc.nextInt();
                                System.out.println("Digite outro número inteiro: ");
                                int numDois = sc.nextInt();
                                System.out.println("Agora escolha uma ação");
                                String acao = sc.next();
                                switch (acao){
                                    case "+":
                                        System.out.println(numUm + numDois);
                                        break;
                                    case "-":
                                        System.out.println(numUm - numDois);
                                        break;
                                    case "*":
                                        System.out.println(numUm * numDois);
                                        break;
                                    case "/":
                                        System.out.println(numUm / numDois);
                                        break;
                                    default:
                                        System.out.println("Erro!");
                                break;
                            }
                            case 11:
                                break;
                            case 12:
                                sc.close();
                            default:
                            System.out.print("Opção inválida");
                            break;               
                        }
                    } while (opcao != 0);
                    sc.close();
                default:
                System.out.println("Opção inválida!");
                break;
            }
        } while (opcao != 0);
        sc.close();
    }
}