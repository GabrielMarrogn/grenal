import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // O I e G apos a vitoria e derota representam respectivamente internacional e gremio;
        int empate = 0;
        int vitoriaI = 0;
        int vitoriaG = 0;
        int gremio = 0;
        int inter = 0;
        int jogos = 0;
        for (;;) {

            inter = sc.nextInt();
            gremio = sc.nextInt();

            if (gremio == inter) {
                empate += 1;
                jogos += 1;
            } else if (gremio > inter) {
                vitoriaG += 1;
                jogos += 1;
            } else if (inter > gremio) {
                vitoriaI += 1;
                jogos += 1;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            int novo = sc.nextInt();

            if (novo == 2) {
                System.out.println(jogos + " grenais");
                System.out.println("Inter:" + vitoriaI);
                System.out.println("Gremio:" + vitoriaG);
                System.out.println("Empates:" + empate);
                if (vitoriaI > vitoriaG) {
                    System.out.println("Inter venceu mais");
                } else if (vitoriaG > vitoriaI) {
                    System.out.println("Gremio venceu mais");
                }else{
                    System.out.println("Nao houve vencedor");
                }
                break;
            }else{
                continue;
            }

        }

        sc.close();
    }
}
