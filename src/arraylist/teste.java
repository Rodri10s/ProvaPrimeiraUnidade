package arraylist;

import java.util.Scanner;
import semarraylist.Paciente;

public class teste {
    public static void main(String[] args) {
        ColecaoPaciente colecao = new ColecaoPaciente();
        Scanner input = new Scanner(System.in);

        int opcao = 1;
        do {

            menu();
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarPacienteDinamicamente(colecao, input);
                    break;
                case 2:
                    cadastrarPacienteManualmente(colecao, input);
                    break;
                case 3:
                    cadastrarPacientePorPosicao(colecao, input);
                    break;
                case 4:
                    procurarPacientePorPosicao(colecao, input);
                    break;
                case 5:
                    excluirPacientePorPosicao(colecao, input);
                    break;
                case 6:
                    System.out.println(colecao.toString());
                    break;
                case 0:
                    System.out.println("PROGRAMA FINALIZADO!");
                    break;
                default:
                    System.out.println("Insira Um Valor Válido");
                    break;
            }
        } while (opcao != 0);
    }

    public static void menu() {
        System.out.println("ESCOLHA ENTRE AS OPÇÕES: ");
        System.out.println("1 - Cadastrar Paciente Dinamicamente");
        System.out.println("2 - Cadastrar Paciente Manualmente");
        System.out.println("3 - Cadastrar Paciente Por Posição");
        System.out.println("4 - Procurar Paciente Por Posição");
        System.out.println("5 - Excluir Paciente Por Posição");
        System.out.println("6 - Listar Pacientes");
        System.out.println("0 - Fechar\n");
    }

    public static void cadastrarPacienteDinamicamente(ColecaoPaciente colecao, Scanner scan) {
        System.out.println("Quantos Pacientes deseja Cadastrar?");
        int quantidade = scan.nextInt();

        Paciente paciente;
        for (int i = 0; i < quantidade; i++) {
            paciente = new Paciente();
            paciente.setNome("Nome" + i);
            paciente.setRg("" + i + i + i + i + i + i + i + i);
            paciente.setIdade(i);

            colecao.cadastrarPaciente(paciente);
        }
    }

    public static void cadastrarPacienteManualmente(ColecaoPaciente colecao, Scanner scan) {
        System.out.println("Quantos Pacientes deseja Cadastrar?");
        int quantidade = scan.nextInt();

        Paciente paciente;
        for (int i = 0; i < quantidade; i++) {
            paciente = new Paciente();
            System.out.println("Nome do Paciente: ");
            paciente.setNome(scan.nextLine());
            paciente.setNome(scan.nextLine());
            System.out.println("RG do Paciente: ");
            paciente.setRg(scan.nextLine());
            System.out.println("Idade do Paciente: ");
            paciente.setIdade(scan.nextInt());
            System.out.println();

            colecao.cadastrarPaciente(paciente);
        }
    }

    public static void cadastrarPacientePorPosicao(ColecaoPaciente colecao, Scanner scan) {
        System.out.println("Em qual posição deseja inserir o paciente?");
        int posicao = scan.nextInt();

        Paciente paciente = new Paciente();

        System.out.println("Nome do Paciente: ");
        paciente.setNome(scan.nextLine());
        paciente.setNome(scan.nextLine());
        System.out.println("RG do Paciente: ");
        paciente.setRg(scan.nextLine());
        System.out.println("Idade do Paciente: ");
        paciente.setIdade(scan.nextInt());

        colecao.cadastrarPacientePosicao(posicao, paciente);

    }

    public static void procurarPacientePorPosicao(ColecaoPaciente colecao, Scanner scan) {
        System.out.println("Deseja o paciente de qual posição?");
        int posicao = scan.nextInt();

        System.out.println(colecao.procurarPacientePorPosicao(posicao));
    }

    public static void excluirPacientePorPosicao(ColecaoPaciente colecao, Scanner scan) {
        System.out.println("Deseja excluir o paciente de qual posição?");
        int posicao = scan.nextInt();

        colecao.excluirPacientePosicao(posicao);
    }
}
