package tools;

import vesmirnetelesa.Zem;

import java.io.FileWriter;
import java.io.IOException;

public class PrintToFile {
    private FileWriter fileWriter;

    public void writeToFile(Zem maticka) throws IOException {

            fileWriter = new FileWriter("out.txt");
            for (int i = 0; i < maticka.getPocet_tvorov(); i++) {
                fileWriter.write(maticka.getPoleTvorov().get(i).toString() + "\n");


            }
            fileWriter.close();

    }
}
