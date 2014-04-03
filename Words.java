package com.example.words;

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.util.ArrayList;
import java.io.*;
import java.util.*;


public class Words {
    private ArrayList<String> text;

    Words(String fileName)throws IOException //конструктор считывает с файла
    {
        text = new ArrayList<String>();

        String var;
        StringBuilder textStr = new StringBuilder();

        BufferedReader in = new BufferedReader(new FileReader(fileName));

            while((var = in.readLine())!= null)
            {
                textStr.append(var);
            }
            StringTokenizer str = new StringTokenizer(textStr.toString(),".");

            while(str.hasMoreTokens())
            {
                text.add(str.nextToken());
            }
    }

    public void Show() //вывод на экран
    {
        System.out.print(text.get(0));
    }

}
