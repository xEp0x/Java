package io;


public interface Writer {

    void write(String text);

    void write(String text, Object... params);
}
