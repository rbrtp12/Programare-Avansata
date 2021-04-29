import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;


public class Commands {
    public static void main(String[] args) throws IOException
    {
        String serverAddress = "192.168.154.221";
        int PORT = 2021;
        System.out.println("Write your command: ");

        try (
                Socket socket = new Socket(serverAddress, PORT);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                )
        {
            while (!socket.isClosed())
            {
                BufferedReader clientInput = new BufferedReader(new InputStreamReader(System.in));
                BufferedReader serverOutput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = clientInput.readLine();
                String[] commands = request.split(" ");
                String response;

                if(commands[0].equals("exit"))
                {
                    out.println(request);
                    response = serverOutput.readLine();
                    System.out.println(response);
                    socket.close();
                }
                else if(commands[0].equals("stop"))
                {
                    out.println(request);
                    response = serverOutput.readLine();
                    System.out.println(response);
                    socket.close();
                }
                else {
                    out.println(request);
                    response = serverOutput.readLine();
                    System.out.println(response);
                    socket.close();
                }
                }
            }
        catch (UnknownHostException exception)
        {
            System.err.println(exception);
        }
        }
    }

