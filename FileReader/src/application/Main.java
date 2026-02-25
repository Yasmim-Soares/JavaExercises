package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strPath = "C:\\Users\\yasmi\\OneDrive\\Área de Trabalho\\CURSOS PROGRAMAÇÃO\\Java POO\\ExercícioFileReader";

        File path = new File(strPath);

        boolean succes = new File(strPath + "\\out").mkdir();

        sc.close();
    }
}