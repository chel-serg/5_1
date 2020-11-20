package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String buff = "";
        try(FileInputStream out = new FileInputStream("test"))
        {
            int a = 0;
            while ((a=out.read())!=-1)
            {
                buff += (char) a;
            }
        }
        catch(IOException ex)
        {
            System.out.println("Wrong filename!");
        }
        String max = "";
        String[] Arrays = buff.split("\n");
        for (int i = 0;i<Arrays.length - 1;i++)
        {
            if (Arrays[i].split(" ").length > Arrays[i+1].split(" ").length)
                max = Arrays[i];
            else
                max = Arrays[i+1];
        }
        System.out.println(max);
    }
}
