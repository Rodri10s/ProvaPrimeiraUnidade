package semarraylist;

public class ColecaoPacienteArray {
    private Paciente[] paciente;
    private int tamanho;

    public ColecaoPacienteArray() {
        this.paciente = new Paciente[10];
        this.tamanho = 0;
    }

    public ColecaoPacienteArray(int capacidade) {
        this.paciente = new Paciente[capacidade];
        this.tamanho = 0;
    }

    public void aumentarCapacidade() {
        if (this.tamanho == this.paciente.length) {
            Paciente[] novoPaciente = new Paciente[this.paciente.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                novoPaciente[i] = this.paciente[i];
            }
            this.paciente = novoPaciente;
        }
    }

    public void cadastrarPaciente(Paciente paciente) {
        this.aumentarCapacidade();
        this.paciente[this.tamanho] = paciente;
        this.tamanho++;
    }

    public Paciente[] listarPaciente() {
        return this.paciente;
    }

    public void verificarPosicao(int posicao) throws Exception {
        if (!(posicao <= this.tamanho && posicao > 0)) {
            throw new Exception("Posiçao Inválida!");
        }
    }

    public void cadastrarPacientePosicao(int posicao, Paciente paciente) throws Exception {
        this.verificarPosicao(posicao);
        this.aumentarCapacidade();
        for (int i = this.tamanho; i >= posicao; i--) {
            this.paciente[i] = this.paciente[i - 1];
        }
        this.paciente[posicao] = paciente;
        this.tamanho++;
    }

    public Paciente procurarPacientePorPosicao(int posicao) throws Exception {
        this.verificarPosicao(posicao);
        return this.paciente[posicao];
    }

    public void excluirPacientePosicao(int posicao) throws Exception {
        this.verificarPosicao(posicao);
        for (int i = posicao; i < this.tamanho; i++) {
            this.paciente[i] = this.paciente[i + 1];
        }
        this.paciente[tamanho] = null;
        this.tamanho--;
    }
}
