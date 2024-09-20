public class Aluguel {
    public static void main(String[] args) {

        Pessoa proprietario1 = new Pessoa();
        proprietario1.nome = "Carlos Alberto";
        proprietario1.idade = 30;
        proprietario1.cpf = "987.212.823-34";
        proprietario1.salarioMensal = 10.000;

        UnidadeResidencial unidade1 = new UnidadeResidencial();
        unidade1.metragem = 45;
        unidade1.posicaoFrente = "Sul";
        unidade1.esquina = false;
        unidade1.proprietario = proprietario1;

        System.out.println("+++ Nome do proprietário: " + unidade1.proprietario.nome + " +++");
        System.out.println("+++ Metragem do terreno: " + unidade1.metragem + " +++");
        System.out.println("+++ Posição da frente: " + unidade1.posicaoFrente + " +++");
        System.out.println("+++ É de esquina? " + unidade1.esquina + " +++");
    }
}
