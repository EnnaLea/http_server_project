package org.example;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try(ServerSocket serverSocket = new ServerSocket(4025)){
            serverSocket.setReuseAddress(true);
            System.out.println("accepted new connection");

            //listen until 'exit' call or termination
            while(true){
                System.out.println("Waiting for the client request");

                //creating new socket and waiting for client connection
                Socket socket = serverSocket.accept();

                //read from socket to ObjectInputStream object
                ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            }
        }

    }
}