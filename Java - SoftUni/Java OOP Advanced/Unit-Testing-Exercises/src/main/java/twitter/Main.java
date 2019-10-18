package twitter;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        ByteArrayOutputStream str = new ByteArrayOutputStream();
        System.setOut(new PrintStream(str));
        Tweet tweet = new Message();
        Client client = new MicrowaveOven(new ServerImpl());
        client.receive(tweet);
        String a = str.toString();
    }
}
