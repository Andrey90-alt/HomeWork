package hw.hw13;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    private Socket socket = null;
    public Client(String address, int port)
    {
        try {
            Scanner sc = new Scanner(System.in);
            socket = new Socket(address, port);
            System.out.println("Установлено подключение");

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            while (true) {
                System.out.println("Введите числа и команду (с пробелами)");
                System.out.println("+,-,*,/");
                String input = sc.nextLine();

                if (input.equals("Стоп"))
                    break;
                outputStream.writeUTF(input);

                String ans = inputStream.readUTF();
                System.out.println("Ответ : " + ans);
            }
        }
        catch (Exception e) {
            System.out.println("Ошибка соединения");
        }
    }

    public static void main(String args[])
    {
        Client client = new Client("127.0.0.1", 5000);
    }
}