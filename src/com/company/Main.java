/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Main {

    public static void main(String[] args) {
        JSONParser sonkParser = new JSONParser();
        try {
            Object object1 = sonkParser.parse(new FileReader("D:/downloads.json"));
            JSONObject object = (JSONObject) object1;
            JSONArray subject1 = (JSONArray)jsonObject.get("Products");
            BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
            String sonkput;
            int read = 0;

            System.out.print("What is the product name? ");
            sonkput = bufferReader.readLine();

            Iterator sonkerator = subjects.iterator();

            while (sonkerator.hasNext()) {
                JSONObject object2 = (JSONObject) sonkerator.next();
                String name = (String) object2.get("name");

                if (sonkput.toLowerCase().equals(name.toLowerCase())) {
                    System.out.print("Name: " + name);
                    System.out.print("Price: " + object2.get("price"));
                    System.out.print("Quantity: " + object2.get("quantity"));
                    read = 1;
                }
            }
            if (read == 0) {
                System.out.print("Sorry, that was not found in our inventory ");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

