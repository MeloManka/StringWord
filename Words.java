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

    public void Find() //Ищет совпадение слова из первого предложения с остальным текстом.
    {
        StringTokenizer sentence = new StringTokenizer(text.get(0)," ");
        int value, value1 = 0;

        while(sentence.hasMoreTokens())
        {
            String word = sentence.nextToken();
            value = 0;
            for(int i = 1; i < text.size(); ++i)
            {
                int num = Comparison(word,text.get(i));
                if(num != 0)
                {
                    ++value;
                }
            }
            if(value == (text.size()-1))
            {
                Show(word);
                ++value1;
            }

        }
        if(value1 == 0)
            System.out.println("Such words are not.");

    }
    public int Comparison(String word,String sentence) //передаём одно слово и одну строку и ищем совпадение.
    {
        StringTokenizer sent = new StringTokenizer(sentence);
        while(sent.hasMoreTokens())
        {
            String wordSent = sent.nextToken();
            if(word.compareToIgnoreCase(wordSent) == 0)
            {
                return 0;
            }
        }
        return 1;
    }

    public void Show(String word) //вывод на экран
    {
        System.out.println(word);
    }

}
