package hw.hw12;

import java.io.*;
import java.util.Scanner;

public class Hw12 {
    public  void readFile(String filename) {
        try {
            File myFile = new File("src/main/java/hw/hw12/files/"+filename);
            Scanner myReader = new Scanner(myFile);
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
        File myObj = new File("src/main/java/hw/hw12/files/"+filename);
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

    public  void writeFile(String filename) {
        Scanner in = new Scanner(System.in);
        File myFile = new File("src/main/java/hw/hw12/files/"+filename);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(myFile, true));
            System.out.println("Введите строку");
            String line = in.nextLine();
            writer.append(line);
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
            File file = new File("src/main/java/hw/hw12/files/");
            File[] files = file.listFiles();
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
