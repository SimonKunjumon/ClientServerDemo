import java.io.*;
import java.net.*;
public class MyClient {
   public static void main(String args[]) {
      try {
         // create a new socket for communicating with the server
         Socket skt = new Socket("127.0.0.1", 6999);
         System.out.println("Connected to server");
         String msg = "Hello Server";
         OutputStream os = skt.getOutputStream();
         ObjectOutputStream oos = new ObjectOutputStream(os);
         oos.writeObject(msg); // send a message to server
         System.out.println("Sent a message to server");
         /* close open streams and sockets */
         oos.close();
         os.close();
         skt.close();
      } catch(Exception e) {
         System.out.println(e);
      }
   }
}
