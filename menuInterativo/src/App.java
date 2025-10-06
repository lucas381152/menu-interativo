import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int opc = 0, numero, opc2, aux, base, exp, total, fat, res;

        while (opc != 5) {
            System.out.println("***************************    ");
            System.out.println("|----------MENU-----------|    ");
            System.out.println("|                         |    ");
            System.out.println("|*************************|    ");
            System.out.println("| 1- TABUADA              |    ");
            System.out.println("| 2- RAIZ QUADRADA        |    ");
            System.out.println("| 3- POTENCIA             |    ");
            System.out.println("| 4- FATORIAL             |    ");
            System.out.println("| 5- SAIR                 |    ");
            System.out.println("***************************    ");
            System.out.print("| Digite sua opçao: ");
            opc = entrada.nextInt();

            switch (opc) {
                // tabuada
                case 1:
                    opc2 = 0;
                    numero = 0;
                    aux = 1;
                    System.out.println("|---Calculo da Tabuada----| \n");
                    System.out.println("|Digite um numero de 1 a 10 \n");
                    numero = entrada.nextInt();

                    System.out.println("---------------------------");
                    System.out.println("|----Escolha uma opçao----|");
                    System.out.println("---------------------------");
                    System.out.println("1- Soma");
                    System.out.println("2- subtraçao");
                    System.out.println("3- Multiplicaçao");
                    System.out.println("4- Divisao");
                    System.out.println("---------------------------|");
                    System.out.print("Digite uma opçao: ");
                    opc2 = entrada.nextInt();
                    switch (opc2) {
                        case 1:
                            // soma
                            while (aux <= 10) {

                                System.out.println(numero + " + " + aux + " = " + (numero + aux));
                                aux++;
                            }
                            break;

                        case 2:
                            // subtraçao
                            while (aux <= 10) {

                                System.out.println((aux + numero) + " - " + numero + " = " + aux);
                                aux++;
                            }
                            break;
                        case 3:
                            // multiplicaçao
                            while (aux <= 10) {

                                System.out.println(numero + " x " + aux + " = " + (numero * aux));
                                aux++;
                            }
                            break;
                        case 4:
                            // divisao
                            while (aux <= 10) {

                                System.out.println((numero * aux) + " / " + numero + " = " + aux);
                                aux++;
                            }
                            break;

                        default:
                            System.out.println("opçao incorreta!!!!!");
                            break;
                    }

                    break;
                // raiz quadrada
                case 2:
                    numero = 0;
                    System.out.println("|Calculo da raiz Quadrada| \n");

                    System.out.print("|Digite um numero:  ");
                    numero = entrada.nextInt();
                    System.out.println("|A raiz quadrada de:" + numero + " e: " + Math.sqrt(numero));
                    break;
                // potencia
                case 3:
                    base = exp = total = 0;
                    System.out.println("calculo da Potencia");
                    System.out.print("Digite o valor da base: ");
                    base = entrada.nextInt();
                    System.out.print("Digite o valor do expoente: ");
                    exp = entrada.nextInt();
                    total = base;
                    while (exp > 1) {
                        total = total * base;
                        exp--;

                    }
                    System.out.println("Resultado: " + total);
                    break;
                // Ftaorial
                case 4:
                    res = fat = 0;
                    System.out.println("Calculo do fatorial");
                    System.out.print("Digite seu Fatorial: ");
                    fat = entrada.nextInt();
                    res = 1;
                    if (fat>=30) {
                        System.out.println("Numero Invalido!!!!!!");

                        return;
                        
                    }else if (fat<=-1) {
                        System.out.println("numero negativo proibido!!!");
                        return;
                    }
                    while (fat > 1) {
                        res = res * fat;
                        fat--;

                    }
                    System.out.println("fatorial  e: " + res);

                    break;

                // sair
                case 5:
                    System.out.println("|Ate logo!!!!|");
                    break;

                default:
                    System.out.println("|Opçao invalida!!!!!|");
            }
        }
    }
}
