import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;


class Threads extends Thread
{
    private Socket socket = null;
    private int serverStop = 0;
    private List<Threads> clients = new ArrayList();

    public Threads(Socket socket)
    {
        this.socket = socket;
    }

    public void run()
    {
        /* to be continued */
    }
}
