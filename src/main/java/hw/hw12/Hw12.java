package hw.hw12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Hw12 {
    public  void readFile(String filename) {
        try {
            File myObj = new File("C:\\Users\\User\\IdeaProjects\\HomeWork\\src\\main\\java\\hw\\hw12\\files\\"+filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка. Такого фаила нет");

        }
    }


    public  void createFile(String filename) {
        File myObj = new File("C:\\Users\\User\\IdeaProjects\\HomeWork\\src\\main\\java\\hw\\hw12\\files\\"+filename);
        try {
            if (myObj.createNewFile()) {
                System.out.println("Фаил создан: " + myObj.getName());
            } else {
                System.out.println("Фаил уже существует");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  void writeFile(String fileName) {
        Scanner in = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter(fileName);
            System.out.println("Введите строку");
            String line = in.nextLine();
            writer.write(line);
            writer.close();
            System.out.println("Сообщение успешно записано");
        } catch (IOException e) {
            System.out.println("Ошибка");
            e.printStackTrace();
        }
    }



    public static void main(String[] args){
        Hw12 hw12 = new Hw12();
        Scanner in = new Scanner(System.in);
        try {
            File f = new File("C:\\Users\\User\\IdeaProjects\\HomeWork\\src\\main\\java\\hw\\hw12\\files");
            File[] files = f.listFiles();
            System.out.println("Фаилы в директории:");
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Введите имя фаила, с которым хотите работать");
        String fileName = in.nextLine();

        hw12.readFile(fileName);

        hw12.writeFile(fileName);



    }

}
