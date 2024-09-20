import java.util.ArrayList;

public class Pessoa {
    public String nome;
    public int idade;
    public String cpf;
    public double salarioMensal;
    private ArrayList<UnidadeResidencial> unidades = new ArrayList<>();

    public Pessoa(String nome, int idade, String cpf, double salarioMensal){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salarioMensal = salarioMensal;
    }

    public boolean adicionarUnidade(UnidadeResidencial unidade) {
        if(unidades.size() < 4) {
            unidades.add(unidade);
            return true;
        } else {
            System.out.println("+++" + nome + "já possui 4 unidades. +++");
            return false;
        }
    }

    public void listarUnidades() {
        System.out.println("+++ Unidades pertencentes a " + nome + ": ");
        for (UnidadeResidencial unidade : unidades) {
            System.out.println(unidade);
        }
    }
}
