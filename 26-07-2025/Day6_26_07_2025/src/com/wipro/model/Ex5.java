package com.wipro.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5 {
    public static void main(String[] args) {
        String f1 = "C:/Users/meman/OneDrive/Pictures/Camera Roll/Signature.jpg";     
        String f0 = "C:/Users/meman/OneDrive/Pictures/Camera Roll/Signature_copy.jpg";  
        
        try (
            FileInputStream s1 = new FileInputStream(f1);
            FileOutputStream s2 = new FileOutputStream(f0);
        ) {
            byte[] buffer = new byte[1024]; 
            int img;

            while ((img = s1.read(buffer)) != -1) {
                s2.write(buffer, 0, img);
            }

            System.out.println("JPG copied");
        } catch (IOException exp) {
            System.out.println("Error " + exp.getMessage());
        }
    }
}
