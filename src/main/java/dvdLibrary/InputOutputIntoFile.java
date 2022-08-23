package dvdLibrary;

import dvdLibrary.model.DVD;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputOutputIntoFile {
    public List<DVD> readFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(
                new FileReader("DVD_Library.txt")));
        List<DVD> dvdList = new ArrayList<>();

        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            String[] arrayFromFile = currentLine.split(",");
            dvdList.add(new DVD(arrayFromFile[0], LocalDate.parse(arrayFromFile[1]),
                    arrayFromFile[2], arrayFromFile[3], arrayFromFile[4], arrayFromFile[5]));
        }
        return dvdList;
    }

    public void saveToFile(List<DVD> actualList) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter("DVD_Library.txt"));

        for (DVD dvd : actualList) {
            printWriter.println(dvd.getTitle() + "," + dvd.getReleaseDate() + ","
                    + dvd.getMpaaRating() + "," + dvd.getDirectorName() + ","
                    + dvd.getStudio() + "," + dvd.getUserRatingOrNote());
        }

        printWriter.flush();
        printWriter.close();
    }
}
