import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NewSocket {

    public static void main(String[] args) {

        //NioSocketImpl instead PlainSocketImpl
        try (ServerSocket serverSocket =
                     new ServerSocket(8888)){

            boolean running = true;
            while(running){
                Socket clientSocket = serverSocket.accept();
                //...
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
