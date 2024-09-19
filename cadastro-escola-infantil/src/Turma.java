import java.util.ArrayList;

public class Turma {
    private String codigo;
    private String nome;
    private String sala;
    private String horario;
    private String tipo;

    private ArrayList <Aluno> alunosTurma = new ArrayList<>();
    private Professor professor;
    private ArrayList <String> materiais = new ArrayList<>();

    public Turma(String codigo, String nome, String sala, String horario, String tipo, Professor professor){
        this.codigo = codigo;
        this.nome = nome;
        this.sala = sala;
        this.horario = horario;
        this.tipo = tipo;
        this.professor = professor;
    }

    public void addAluno(Aluno aluno) {
        alunosTurma.add(aluno);
    }

    public void addMaterial(String material) {
        materiais.add(material);
    }

    public void listarAlunos(){
        System.out.println("+++ Alunos: " + nome + " +++");
        for (Aluno aluno : alunosTurma) {
            System.out.println(aluno);
        }
    }

    public void listarMateriais(){
        System.out.println("+++ Materiais: " + nome + " +++");
        for (String material : materiais) {
            System.out.println(material);
        }
    }

    public String toString() {
        return "+++ Turma: " + nome + " +++ Sala: " + sala + " +++ Horário: " + horario + " +++ Tipo: " + tipo + " +++ Professor: " + professor + " +++";
    }
}