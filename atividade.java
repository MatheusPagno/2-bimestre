public class atividade {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            exibirPrompt();
        }
    }


    public static void exibirPrompt() {
        System.out.println("Estou aprendendo Java e quero aprender a dividir e organizar meu código. Vamos contar os números pares e ímpares de 1 a 10.");
        mensagemDeAprendizado();
        contarParesImpares(1, 10);
    }


    public static void mensagemDeAprendizado() {
        System.out.println("Lembre-se de que usar assistentes é útil, mas é importante aprender a resolver problemas de forma independente.");
    }


    public static void contarParesImpares(int inicio, int fim) {
        int pares = 0;
        int impares = 0;

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
        System.out.println("-----");
    }
}
