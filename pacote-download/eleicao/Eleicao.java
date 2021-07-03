/*Faça um algoritmo que receba o voto de 10 eleitores. Nesta eleição são apenas
três adversários: [10]-José/[20]-Maria/[30]-Chico.
No final imprima o total de votos de cada adversário e a quantidade de votos
[0]nulos/[1]brancos.
 */
package eleicao;

import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-02-07
 * @author irion-silva
 */
public class Eleicao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int voto, votoJose = 0, votoMaria = 0, votoChico = 0, votoNulo = 0,
                votoBranco = 0;
        for (int contador = 1; contador <= 10; contador++) {

            System.out.println("-----ELEIÇÕES PARA PREFEITO-----");
            System.out.println("Digite [10] para votar em José;");
            System.out.println("Digite [20] para votar em Maria;");
            System.out.println("Digite [30] para votar em Chico;");
            System.out.println("Digite [0] para votar Nulo;");
            System.out.println("Digite [1] para votar Branco;");
            System.out.print("Informe seu voto:");
            voto = teclado.nextInt();

            switch (voto) {
                case 10:
                    votoJose = votoJose + 1;
                    break;
                case 20:
                    votoMaria = votoMaria + 1;
                    break;
                case 30:
                    votoChico = votoChico + 1;
                    break;
                case 0:
                    votoNulo = votoNulo + 1;
                    break;
                case 1:
                    votoBranco = votoBranco + 1;
                    break;
                default:
                    System.out.println("Informe um número válido.");
            }
        }
        
        System.out.println("-----RESULTADO DOS VOTOS-----");
        System.out.printf("José teve %d voto(s) %n", votoJose);
        System.out.printf("Maria teve %d voto(s) %n", votoMaria);
        System.out.printf("Chico teve %d voto(s) %n", votoChico);
        System.out.printf("Nulo teve %d voto(s) %n", votoNulo);
        System.out.printf("Branco teve %d voto(s) %n", votoBranco);
        
        System.out.println("-----RESULTADO DO NOVO PREFEITO-----");
        if ((votoJose > votoMaria)&&(votoJose > votoChico)) {
            System.out.println("José ganhou a eleição para prefeito!!!");
        } else if ((votoMaria > votoJose)&&(votoMaria > votoChico)) {
            System.out.println("Maria ganhou a eleição para prefeito!!!");
        } else if ((votoChico > votoJose)&&(votoChico > votoMaria)){
            System.out.println("Chico ganhou a eleição para prefeito!!!");
        }
  
    }

}
