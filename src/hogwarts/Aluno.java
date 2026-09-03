package hogwarts;

import java.time.LocalDate;

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
    private LocalDate dataNascimento;
    private String cod_matricula;

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
        return nome.toLowerCase();
    }

    public void setNome(String nome) {
        this.nome = nome.toLowerCase();
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
        return casa.toLowerCase();
    }

    public void setCasa(String casa) {
        this.casa = casa.toLowerCase();
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setCodMatricula(String cod_matricula) {
        this.cod_matricula = cod_matricula;
    }

    public String getCodMatricula() {
        return cod_matricula;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nCoragem: " + getCoragem()
                + "\nInteligência: " + getInteligencia()
                + "\nAmbição: " + getAmbicao()
                + "\nLealdade: " + getLealdade()
                + "\nEstratégia: " + getEstrategia()
                + "\nCriatividade: " + getCriatividade()
                + "\nCasa: " + getCasa());
    }

    public void calcularCasa() {
        int calculoGrifinoria = (2 * getCoragem()) + getLealdade();
        int calculoSonserina = (2 * getAmbicao()) + getEstrategia();
        int calculoCorvinal = (2 * getInteligencia()) + getCriatividade();
        int calculoLufaLufa = ((2 * getLealdade()) + getCoragem()) / 3;

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

    public void calcularIdade() {
        if (getDataNascimento() != null) {
            LocalDate hoje = LocalDate.now();
            int idadeCalculada = hoje.getYear() - getDataNascimento().getYear();
            if (hoje.getDayOfYear() < getDataNascimento().getDayOfYear()) {
                idadeCalculada--;
            }
            setIdade(idadeCalculada);
        } else {
            System.out.println("Data de nascimento não definida.");
        }
    }
}
