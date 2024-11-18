import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.Scanner;

public class App {

    public static File getFilePath(String path) {
        if (path.isEmpty()) {
            return null;
        }
        return new File(path).getAbsoluteFile();
    }

    public static File questFileName(String path) {
        if (path == null) {
            return null;
        }
        File file;
        Scanner scanner = new Scanner(System.in);
        File rootDir;
        rootDir = getFilePath(path);
        if (rootDir == null) {
            return null;
        }
        do {
            System.out.print("Введите имя файла: ");
            file = new File(rootDir, scanner.next());
        } while (isFileExist(file));
        return file;
    }


    public static boolean isFileExist(@NotNull File file) {
        return !file.exists();
    }

    public static void main(String[] args) {
        String charSequence;
        Scanner scanner = new Scanner(System.in);
        String path = "src/main/java/text";
        File file = questFileName(path);
        System.out.print("Введите последовательность символов: ");
        charSequence = scanner.nextLine();
        int occurrences = readAndCount(file, charSequence);
        System.out.printf("Количество вхождений последовательности символов '%s' в файл %s равно %d%n",
                charSequence, file, occurrences);
    }

    public static int count(@NotNull String line, String charSequence) {
        int count = 0;
        int position = 0;
        while ((position = line.indexOf(charSequence, position)) != -1) {
            count++;
            position++;
        }
        return count;
    }

    public static int readAndCount(File file, String charSequence) {
        int count = 0;
        if (isFileExist(file)) {
            System.out.printf("Файл '%s' не существует", file);
            return 0;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()) {
                    count += count(line, charSequence);
                }
            }
        } catch (IOException e) {
            System.err.printf("Ошибка чтения файла:", e.getMessage());
        }
        return count;
    }
}