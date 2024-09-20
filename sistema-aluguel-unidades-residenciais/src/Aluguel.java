public class Aluguel {
    public static void main(String[] args) {

        Pessoa proprietario1 = new Pessoa("Carlos Alberto de Nóbrega", 88, "634.387.875-25", 5000);
        Pessoa proprietario2 = new Pessoa("Joana D'arc", 45, "754.867.943-54", 5000);

        UnidadeResidencial unidade1 = new UnidadeResidencial(120.0, "Norte", true, proprietario1);
        UnidadeResidencial unidade2 = new UnidadeResidencial(80.0, "Sul", false, proprietario1);
        UnidadeResidencial unidade3 = new UnidadeResidencial(100.0, "Leste", true, proprietario2);
        UnidadeResidencial unidade4 = new UnidadeResidencial(75.0, "Oeste", false, proprietario1);
        UnidadeResidencial unidade5 = new UnidadeResidencial(90.0, "Norte", false, proprietario1);

        proprietario1.adicionarUnidade(unidade1);
        proprietario1.adicionarUnidade(unidade2);
        proprietario1.adicionarUnidade(unidade4);
        proprietario1.adicionarUnidade(unidade5);

        proprietario1.adicionarUnidade(unidade3); // deve gerar um erro

        proprietario2.adicionarUnidade(unidade3);

        proprietario1.listarUnidades();
        proprietario2.listarUnidades();
    }
}
