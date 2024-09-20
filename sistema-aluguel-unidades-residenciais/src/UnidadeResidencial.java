public class UnidadeResidencial {
    public double metragem;
    public String posicaoFrente;
    public boolean esquina;
    public Pessoa proprietario;

    public UnidadeResidencial(double metragem, String posicaoFrente, boolean esquina, Pessoa proprietario) {
        this.metragem = metragem;
        this.posicaoFrente = posicaoFrente;
        this.esquina = esquina;
        this.proprietario = proprietario;
    }

    public String toString() {
        return "+++ Metragem: " + metragem + "; Posição Frente: " + posicaoFrente + "; É de esquina? " + esquina + "; Proprietário: " + proprietario + ". +++";
    }
}
