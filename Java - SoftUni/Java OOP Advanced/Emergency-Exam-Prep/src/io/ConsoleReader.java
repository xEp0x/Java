package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConsoleReader implements Reader {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public String read() throws IOException {
        return reader.readLine();
    }
}
