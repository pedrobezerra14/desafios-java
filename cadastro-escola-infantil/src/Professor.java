public class Professor {
    private String nome;
    private int matricula;
    private String grauInstrucao;
    private double salarioBase;

    public Professor(String nome, int matricula, String grauInstrucao, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.grauInstrucao = grauInstrucao;
        this.salarioBase = salarioBase;
    }

    public String toString() {
        return "+++ Nome: " + nome + " +++ Matrícula: " + matricula + " +++ Grau de instrução: " + grauInstrucao + " +++ Salário base: " + salarioBase + " +++";
    }
}
