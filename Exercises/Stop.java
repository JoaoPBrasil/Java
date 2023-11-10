import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main 
{
    private static final int EASY_TIME_LIMIT = 30; // facil
    private static final int MEDIUM_TIME_LIMIT = 20; // medio
    private static final int HARD_TIME_LIMIT = 10; // dificil

    public static void main(String[] args) 
    {
        System.out.print("Informe o número de categorias para o stop: ");
        Scanner scanner = new Scanner(System.in);
        int numcat = scanner.nextInt();
        scanner.nextLine();

        String[] categorias = new String[numcat];
        for (int i = 0; i < numcat; i++) 
        {
            System.out.print("Insira o nome da categoria: ");
            String nomeCategoria = scanner.nextLine();
            categorias[i] = nomeCategoria;
        }

        Random random = new Random();
        char letra = (char) (random.nextInt(26) + 'A');
        System.out.println("O stop é: " + letra);

        String[] respostas = new String[numcat];
        Timer timer = new Timer();
        TimerTask task = new TimerTask() 
        {
            int timeLimit = getTimeLimit(numcat);

            @Override
            public void run() 
            {
                if (timeLimit > 0) 
                {
                    System.out.println("Tempo restante: " + timeLimit + " segundos");
                    timeLimit--;
                } 
                else 
                {
                    System.out.println("Tempo esgotado!");
                    timer.cancel();
                    scanner.close();
                    System.exit(0);
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);

        for (int j = 0; j < numcat; j++) 
        {
            System.out.print(categorias[j] + ": ");
            String resposta = scanner.nextLine();
            respostas[j] = resposta;
        }

        timer.cancel();
        scanner.close();
        System.out.print("Preencheu todas as categorias e quer dar stop? 1- Sim\n 2- Não\n");
        int x = scanner.nextInt();

        if (x == 1) 
        {
            System.out.print("Stop!");
        } 
        else 
        {
            System.out.print("Perdeu!");
        }
    }

    private static int getTimeLimit(int numcat) 
    {
        int timeLimit;
        if (numcat <= 3) 
        {
            timeLimit = EASY_TIME_LIMIT;
        } 
        else if (numcat <= 6) 
        {
            timeLimit = MEDIUM_TIME_LIMIT;
        }
        else 
        {
            timeLimit = HARD_TIME_LIMIT;
        }
        return timeLimit;
    }
}
