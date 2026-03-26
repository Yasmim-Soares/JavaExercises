package application;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] lines = new String[] {"TV LED", "1290.99", "1", "Video Game Chair", "350.50","3", "Iphone X", "900.00","2", "Samsung Galaxy", "9,850.00", "2"};
        String path = "C:\\Users\\yasmi\\OneDrive\\Documentos\\AtividadeFile\\source.csv";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}