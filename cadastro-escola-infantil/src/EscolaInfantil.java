public class EscolaInfantil {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Mario Enzo", "AM003-24", "07/12/2010", "Maria do Socorro");
        Aluno aluno2 = new Aluno("Roberta Miranda", "AM004-24", "03/06/2011", "Josefa Vianna");
        Aluno aluno3 = new Aluno("Lucas Pereira", "AM001-23", "15/08/2011", "Ana Carolina");
        Aluno aluno4 = new Aluno("Camila Oliveira", "AM002-23", "22/09/2010", "Patrícia Mendes");

// Coloquei a matricula com letras para seguir um padrão: AM001-24(AM = Aluno Matrícula, o número de sua matrícula no sistema e "-24" pois foi cadastrado no ano de 2024).
//Utilizando o mesmo padrão de Aluno Matrícula, será feito o PM(Professor Matrícula) e  em  turma será CT(Código Turma).

        Professor professor1 = new Professor("João Roberto de Nobrega", "PM001-24", "Mestrado Incompleto", 4500);
        Professor professor2 = new Professor("Madalena de Souza Rios", "PM002-24", "Doutorado Completo🗹", 4500);

        Turma turma1 = new Turma("CT001-24", "Turma de Artes", "Sala 2", "Manhã", "A", professor2);
        Turma turma2 = new Turma("CT002-24", "Turma de Inglês", "Sala 2", "Tarde", "C", professor1);

        turma1.addAluno(aluno1);
        turma1.addAluno(aluno4);

        turma1.addMaterial("Lápis de pintar");
        turma1.addMaterial("Tinta guache");

        turma1.listarAlunos();
        turma1.listarMateriais();

        System.out.println("___________________________________________________________________________________________________________________");

        turma2.addAluno(aluno2);
        turma2.addAluno(aluno3);

        turma2.addMaterial("Dicionário");
        turma2.addMaterial("Tradutor virtual");

        turma2.listarAlunos();
        turma2.listarMateriais();
    }
}
