public class Main {
    public static void main(String[] args) {
        CriadorDePersonagem criador = new CriadorDeLadino();
        criador.criarPersonagem();

        System.out.println();

        criador = new CriadorDePaladino();
        criador.criarPersonagem();

    }
}