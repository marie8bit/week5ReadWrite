package com.MarieErickson;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedWriter bufWriter = new BufferedWriter(new FileWriter("MES Data"));
        bufWriter.write("Marie\n");
        bufWriter.write("Yellow\n");
        bufWriter.write("2545\n");
        bufWriter.close();
        BufferedReader bufReader = new BufferedReader(new FileReader("MES Data"));
        String line = bufReader.readLine();
        while(line!=null){
            System.out.println(line);
            line=bufReader.readLine();
        }
        bufReader.close();

    }
}
