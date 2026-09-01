package hogwarts;

public class Aluno {
    private String nome;
    private int idade;
    private int coragem;
    private int inteligencia;
    private int ambicao;
    private int lealdade;
    private int estrategia;
    private int criatividade;
    private String casa;

    public Aluno(String nome, int idade, int coragem, int inteligencia, int ambicao, int lealdade, int estrategia,
            int criatividade, String casa) {
        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
        this.casa = casa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCoragem() {
        return coragem;
    }

    public void setCoragem(int coragem) {
        this.coragem = coragem;
    }

    public int getAmbicao() {
        return ambicao;
    }

    public void setAmbicao(int ambicao) {
        this.ambicao = ambicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getLealdade() {
        return lealdade;
    }

    public void setLealdade(int lealdade) {
        this.lealdade = lealdade;
    }

    public int getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(int estrategia) {
        this.estrategia = estrategia;
    }

    public int getCriatividade() {
        return criatividade;
    }

    public void setCriatividade(int criatividade) {
        this.criatividade = criatividade;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome
                + "\nIdade: " + this.idade
                + "\nCoragem: " + this.coragem
                + "\nInteligência: " + this.inteligencia
                + "\nAmbição: " + this.ambicao
                + "\nLealdade: " + this.lealdade
                + "\nEstratégia: " + this.estrategia
                + "\nCriatividade: " + this.criatividade
                + "\nCasa: " + this.casa);
    }

    public void calcularCasa() {
        int calculoGrifinoria = (2 * this.coragem) + this.lealdade;
        int calculoSonserina = (2 * this.ambicao) + this.estrategia;
        int calculoCorvinal = (2 * this.inteligencia) + this.criatividade;
        int calculoLufaLufa = ((2 * this.lealdade) + this.coragem) / 3;

        if (calculoGrifinoria > calculoSonserina && calculoGrifinoria > calculoCorvinal
                && calculoGrifinoria > calculoLufaLufa) {
            setCasa("Grifinória");
        } else if (calculoSonserina > calculoGrifinoria && calculoSonserina > calculoCorvinal
                && calculoSonserina > calculoLufaLufa) {
            setCasa("Sonserina");
        } else if (calculoCorvinal > calculoGrifinoria && calculoCorvinal > calculoSonserina
                && calculoCorvinal > calculoLufaLufa) {
            setCasa("Corvinal");
        } else if (calculoLufaLufa > calculoGrifinoria && calculoLufaLufa > calculoSonserina
                && calculoLufaLufa > calculoCorvinal) {
            setCasa("Lufa-Lufa");
        } else {
            setCasa("Sem casa definida");
        }
    }
}
