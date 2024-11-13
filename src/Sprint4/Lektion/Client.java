package Sprint4.Lektion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    private final int port = 23456;
    InetAddress address = InetAddress.getLocalHost();
    Socket socket = new Socket(address, port);
    Window window = new Window();

    public Client() throws IOException {

        try(PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));){

            String fromServer;

            while((fromServer = in.readLine()) != null){
                window.text.append(fromServer + "\n");
            }

        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        Client c = new Client();
    }
}
