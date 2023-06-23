abstract public class CriadorDePersonagem {
    public void criarPersonagem() {
        EscolherTipoDoPersonagem();
        CriarAtributosDoPersonagem();
        EquiparPersonagem();
    }

    protected abstract void EscolherTipoDoPersonagem();
    protected abstract void CriarAtributosDoPersonagem();
    protected abstract void EquiparPersonagem();
}

class CriadorDeLadino extends CriadorDePersonagem {
    protected void EscolherTipoDoPersonagem() {
        System.out.println("Criando um Ladino...");
    }

    protected void CriarAtributosDoPersonagem() {
        System.out.println("Atributos do Ladino criados.");
    }

    protected void EquiparPersonagem() {
        System.out.println("Equipando o Ladino com uma espada.");
    }

}

class CriadorDePaladino extends CriadorDePersonagem {
    protected void EscolherTipoDoPersonagem() {
        System.out.println("Criando um Paladino...");
    }

    protected void CriarAtributosDoPersonagem() {
        System.out.println("Atributos do Paladino criados.");
    }

    protected void EquiparPersonagem() {
        System.out.println("Equipando o Paladino com um escudo.");
    }
}