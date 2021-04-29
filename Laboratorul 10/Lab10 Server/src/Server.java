import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static final int PORT = 2021;
    private static List<Threads> clients = new ArrayList();

    public Server() throws IOException
    {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(PORT);
            while(true)
            {
                System.out.println("loading");
                Socket socket = serverSocket.accept();
                new Threads(socket).start();
            }
        }
        catch (IOException exception)
        {
            System.err.println(exception);
        }
        serverSocket.close();
    }

    public static List<Threads> getClients() {
        return clients;
    }
}
