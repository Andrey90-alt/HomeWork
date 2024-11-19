package HW21;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    private char letter = 'A';
    private final Object line = new Object();

    public void print(Character letter) {
        synchronized (line) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (this.letter != letter) {
                        line.wait();
                    }
                    System.out.print(letter);
                    this.letter = next(letter);
                    line.notifyAll();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    private char next(char letter) {
        switch (letter) {
            case 'A': return 'B';
            case 'B': return 'C';
            case 'C': return 'A';
            default: throw new IllegalArgumentException("Ошибка: " + letter);
        }
    }
    public static void main(String[] args) {
        App app = new App();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 1; i <= 3; i++) {
            final int index = i;
            executorService.execute(() -> {
                switch (index) {
                    case 1:
                        app.print('A');
                        break;
                    case 2:
                        app.print('B');
                        break;
                    case 3:
                        app.print('C');
                        break;
                    default:
                        throw new IllegalArgumentException("Ошибка: " + index);
                }
            });
        }
        executorService.shutdown();
    }
}
