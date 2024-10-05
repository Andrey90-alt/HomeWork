package HW;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    private Socket socket = null;
    public Client(String address, int port) {
        try {
            Scanner in = new Scanner(System.in);
            socket = new Socket(address, port);
            System.out.println("Установлено подключение");
            System.out.println("Если хотите прервать выполнение программы, напишите Стоп");

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            while (true) {
                System.out.println("Введите числа и команду (с пробелами)");
               // System.out.println("+,-,*,/");
                String operands = inputStream.readUTF();
                System.out.println(operands);
                String input = in.nextLine();

                if (input.equals("Стоп"))
                    break;
                outputStream.writeUTF(input);

                String answer = inputStream.readUTF();
                System.out.println("Ответ : " + answer);
            }
        }
        catch (Exception e) {
            System.out.println("Ошибка соединения");
        }
    }

    public static void main(String args[])
    {
        //127.0.0.1
        Scanner in = new Scanner(System.in);
        //System.out.println("Введите адрес сервера: (например:127.0.0.1)");
        Client client = new Client("127.0.0.1", 5000);
    }
}