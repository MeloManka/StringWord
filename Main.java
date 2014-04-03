package com.example.words;

import java.io.IOException;

public class Main {
    public static void main(String args[])throws IOException
    {
        Words text = new Words("file.txt");
        text.Show();
    }
}
