package com.telran.project.inputdata;


import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input path to properties file : ");
        String s = scanner.nextLine();
        scanner.close();
        // s=/Users/munhalmammadov/IdeaProjects/ProjectTelRan1/src/com/telran/project/inputdata/one.properties

        Properties properties = new Properties();

        try (FileReader fileReader = new FileReader(s)) {
            properties.load(fileReader);
            System.out.println(properties.values());
            properties.storeToXML(new FileOutputStream("properties.xml"), "new properties  xml file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
