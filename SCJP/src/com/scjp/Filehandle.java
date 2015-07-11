package com.scjp;

import java.io.*;

/**
 * Created by IshanFx on 7/11/2015.
 */
public class Filehandle {

    public boolean fileCreateCheck(){
        File file = new File("Ishan.txt");
        try {
            /*
            * create the actual file.
            */
            FileWriter write = new FileWriter(file);
            write.write("Hello iShan");
            write.flush();
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public void readFiles()  {
        char[] ch = new char[4];
        /*
        * File is use to name the file It will not create a file
        * */
        File file = new File("ishan.txt");

        FileReader read = null;
        try {
            /*
            * Read the file and add data to char array
            */
            read = new FileReader(file);
            read.read(ch);
            /*
            *Go through the file and read the data
            */
            for(char c:ch){
                System.out.print(c);
            }
            read.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void getFileData(){
        File file = new File("ishan.txt");

        System.out.println("Exist"+file.exists());
        System.out.println("path"+file.getAbsolutePath());
        System.out.println("Directory"+file.isDirectory());
        System.out.println(file.length());

    }

    public void printWriteData(){
        File dir = new File("Name");
        dir.mkdir();

        File file = new File("Name","Ishan.txt");

        try {
           // FileWriter write = new FileWriter(file);
            /*
            * Make a actual file and create object
            */
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print("Hello man i can do it");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
