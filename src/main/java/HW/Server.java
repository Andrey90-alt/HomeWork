package HW;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

    private Socket socket = null;

    public Server(int port)
    {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            while (true) {
                outputStream.writeUTF("+,-,*,/");
                String input = inputStream.readUTF();
                if (input.equals("Стоп"))
                    break;
                System.out.println("Получено");
                int result = 0;

                StringTokenizer st = new StringTokenizer(input);
                int firstOperand = Integer.parseInt(st.nextToken());

                int secondOperand = Integer.parseInt(st.nextToken());
                String operation = st.nextToken();

                if (operation.equals("+")) {
                    result = firstOperand + secondOperand;
                }
                else if (operation.equals("-")) {
                    result = firstOperand - secondOperand;
                }
                else if (operation.equals("/")) {
                    result = firstOperand / secondOperand;
                }
                else if (operation.equals("*")) {
                    result = firstOperand * secondOperand;
                }
                System.out.println("Отправка результата");
                outputStream.writeUTF(Integer.toString(result));
            }
        }
        catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    public static void main(String args[])
    {
        Server server = new Server(5000);
    }
}