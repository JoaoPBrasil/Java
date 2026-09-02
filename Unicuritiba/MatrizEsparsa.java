import java.util.ArrayList;
import java.util.List;

public class MatrizEsparsaTripas {

    // Representação do elemento não nulo (Tripa)
    public static class Triplet {
        int linha;
        int coluna;
        double valor;

        public Triplet(int linha, int coluna, double valor) {
            this.linha = linha;
            this.coluna = coluna;
            this.valor = valor;
        }
    }

    private int linhas;
    private int colunas;
    private List<Triplet> tripas;

    public MatrizEsparsaTripas(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.tripas = new ArrayList<>();
    }

    // Operação de Escrita (Define ou atualiza valor)
    public void escrever(int i, int j, double valor) {
        for (int k = 0; k < tripas.size(); k++) {
            Triplet t = tripas.get(k);
            if (t.linha == i && t.coluna == j) {
                if (valor == 0.0) {
                    tripas.remove(k); // Remove se virar zero
                } else {
                    t.valor = valor;
                }
                return;
            }
        }
        if (valor != 0.0) {
            tripas.add(new Triplet(i, j, valor));
        }
    }

    // Operação de Leitura
    public double ler(int i, int j) {
        for (Triplet t : tripas) {
            if (t.linha == i && t.coluna == j) {
                return t.valor;
            }
        }
        return 0.0; // Padrão para elemento nulo
    }

    // Percurso apenas dos elementos Não Nulos
    public void percorrerNaoNulos() {
        for (Triplet t : tripas) {
            System.out.printf("m[%d][%d] = %.2f\n", t.linha, t.coluna, t.valor);
        }
    }

    public int getQuantidadeNaoNulos() {
        return tripas.size();
    }
}