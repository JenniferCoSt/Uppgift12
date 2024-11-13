package Sprint4.Lektion;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatListener {

    private static MultiUser mu = new MultiUser();

    public static void main(String[] args) {

        try(ServerSocket serverSocket = new ServerSocket(23456)){
            while (true){
                Socket socket = serverSocket.accept();

                Server server = new Server(socket, mu);
                server.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
