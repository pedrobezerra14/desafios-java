public class Aluno {
    private String nome;
    private String matricula;
    private String dataNascimento;
    private String nomeMae;

    public Aluno(String nome, String matricula, String dataNascimento, String nomeMae) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.nomeMae = nomeMae;
    }
    public String toString(){
        return "+++ Nome: " + nome + " +++ Matrícula: " + matricula + " +++ Data de nascimento: " + dataNascimento + " +++ Nome da mãe: " + nomeMae + " +++";
    }
}
