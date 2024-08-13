package arraylist;

import java.util.ArrayList;

import semarraylist.Paciente;

public class ColecaoPaciente {
    private ArrayList lista;

    public ColecaoPaciente() {
        this.lista = new ArrayList<>();
    }

    public ColecaoPaciente(int capacidade) {
        this.lista = new ArrayList<>();
    }

    public void cadastrarPaciente(Paciente paciente) {
        this.lista.add(paciente);
    }

    public void cadastrarPacientePosicao(int posicao, Paciente paciente) {
        this.lista.add(posicao, paciente);
    }

    public Object procurarPacientePorPosicao(int posicao) {
        return this.lista.get(posicao);
    }

    public void excluirPacientePosicao(int posicao) {
        this.lista.remove(posicao);
    }

    @Override
    public String toString() {
        return "ColecaoPaciente [lista=" + lista + "]";
    }

}
