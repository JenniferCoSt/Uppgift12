package Sprint4.Lektion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Server extends Thread {

    private Socket clientSocket;
    private MultiUser multiUser;

    public Server() {}

    public Server(Socket clientSocket, MultiUser mu) {
        this.clientSocket = clientSocket;
        this.multiUser = mu;
    }

    public void run() {
        try(PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))){

            String inputLine;

            while((inputLine = br.readLine()) != null) {

            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeMessage(String input) {

    }

}
