public class OrdemLacos {
    public static void main(String[] args) {
        int n = 1000;
        double[][] a = new double[n][n];
        double[][] b = new double[n][n];
        
        // Inicialização de teste
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 1.0;
                b[i][j] = 2.0;
            }
        }

        // Versão i, j, k
        double[][] c1 = new double[n][n];
        long inicioIJK = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c1[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        long tempoIJK = System.nanoTime() - inicioIJK;

        // Versão i, k, j
        double[][] c2 = new double[n][n];
        long inicioIKJ = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < n; j++) {
                    c2[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        long tempoIKJ = System.nanoTime() - inicioIKJ;

        double tempoIJK_ms = tempoIJK / 1e6;
        double tempoIKJ_ms = tempoIKJ / 1e6;
        double fator = tempoIJK_ms / tempoIKJ_ms;

        System.out.printf("Tempo i, j, k: %.2f ms\n", tempoIJK_ms);
        System.out.printf("Tempo i, k, j: %.2f ms\n", tempoIKJ_ms);
        System.out.printf("Fator de aceleração (i,j,k / i,k,j): %.2fx\n", fator);
    }
}