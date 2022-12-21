package com.cgvsu;

import com.cgvsu.model.Model;
import com.cgvsu.objreader.ObjReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        String text = "";
        try (Scanner scanner = new Scanner(
                new File("C:/Users/gvozdev_d_s/CGVSU-main/ObjModels/Faceform/WrapHand.obj"), "UTF-8" )) {
            text = scanner.useDelimiter("\\A").next();
        } catch (FileNotFoundException e) {
            System.out.println("smth wrong with file");
        }

        System.out.println("Loading model ...");
        Model model = ObjReader.read(text);

        System.out.println("Vertices: " + model.vertices.size());
        System.out.println("Texture vertices: " + model.textureVertices.size());
        System.out.println("Normals: " + model.normals.size());
        System.out.println("Polygons: " + model.polygons.size());
    }
}
