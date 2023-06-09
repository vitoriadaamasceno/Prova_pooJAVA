package prova_poo;

/**
 *
 * @author Aluno
 */
public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico"),
    OPERACOES("Operações");

    protected String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
