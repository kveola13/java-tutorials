package com.kveola.studies;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public void writeFile() throws IOException{
        File file = new File("filetest.txt");
        file.createNewFile();
        Scanner input = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter(file);
        System.out.println("Writing...");
        fileWriter.write("Test");
        fileWriter.close();
        System.out.println("Done");
    }

    public static void main(String[] args) throws IOException {
        Football football = new Football();
        football.locker = "Locker 1";
        football.ballId = 1;
        football.needsReplacement = false;
        System.out.println(football);
    }
}
