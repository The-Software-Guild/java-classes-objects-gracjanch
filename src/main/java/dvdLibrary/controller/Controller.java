package dvdLibrary.controller;

import dvdLibrary.InputOutputIntoFile;
import dvdLibrary.model.DVD;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    InputOutputIntoFile inputOutputIntoFile = new InputOutputIntoFile();
    List<DVD> listDVDs = new ArrayList<>();

    public int userControl() throws IOException {
        listDVDs = inputOutputIntoFile.readFromFile();
        int userInput = Integer.parseInt(getInputFromUser("Choose what do you want to do: "));
        List<DVD> newList = new ArrayList<>();
        switch (userInput) {
            case 1:
                addDVD();
                break;
            case 2:
                removeDVD();
                break;
            case 3:
                editDVD();
                break;
            case 4:
                showAllDVDs();
                break;
            case 5:
                showInfo();
                break;
            case 6:
                findByTitle();
                break;
        }
        inputOutputIntoFile.saveToFile(listDVDs);
        return userInput;
    }

    private String getInputFromUser(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    private void addDVD() {
        String title = getInputFromUser("Type title:");
        LocalDate releaseDate = LocalDate
                .parse(getInputFromUser("Type release date in format 'yyyy-MM-dd'"));
        String mpaaRating = getInputFromUser("Type MPAA Rating:");
        String directorName = getInputFromUser("Type Director name:");
        String studio = getInputFromUser("Type studio:");
        String userRatingOrNote = getInputFromUser("Type user rating or note:");
        DVD newDVD = new DVD(title, releaseDate, mpaaRating, directorName, studio, userRatingOrNote);
        listDVDs.add(newDVD);
    }

    private void removeDVD() {
        int idToDelete = Integer.parseInt(
                getInputFromUser("Type index of DVD which you want to delete: "));
        listDVDs.remove(idToDelete);
    }

    private void editDVD() {
        int idToEdit = Integer.parseInt(
                getInputFromUser("Type index of DVD which you want to edit: "));
        DVD dvdToEdit = listDVDs.get(idToEdit);
        String title = getInputFromUser("Type new title, previous: " + dvdToEdit.getTitle());
        LocalDate releaseDate = LocalDate
                .parse(getInputFromUser("Type new release date in format 'yyyy-MM-dd', previous: "
                        + dvdToEdit.getReleaseDate()));
        String mpaaRating = getInputFromUser("Type new MPAA Rating, previous: "
                + dvdToEdit.getMpaaRating());
        String directorName = getInputFromUser("Type new Director name, previous: "
                + dvdToEdit.getDirectorName());
        String studio = getInputFromUser("Type new studio, previous: " + dvdToEdit.getStudio());
        String userRatingOrNote = getInputFromUser("Type new user rating or note, previous: "
                + dvdToEdit.getUserRatingOrNote());

        dvdToEdit.setTitle(title);
        dvdToEdit.setReleaseDate(releaseDate);
        dvdToEdit.setMpaaRating(mpaaRating);
        dvdToEdit.setDirectorName(directorName);
        dvdToEdit.setStudio(studio);
        dvdToEdit.setUserRatingOrNote(userRatingOrNote);
    }

    private void showAllDVDs() {
        for (int i = 0; i < listDVDs.size(); i++) {
            System.out.println("[" + i + "] " + listDVDs.get(i));
        }
    }

    private void showInfo() {
        int idToShow = Integer.parseInt(
                getInputFromUser("Type index of DVD for more details: "));
        System.out.println(listDVDs.get(idToShow));
    }

    private void findByTitle() {
        String searchingTitle = getInputFromUser("Write title which you looking: ");
        String message = "Not found DVD with '" + searchingTitle + "' title!";
        for (DVD dvd : listDVDs) {
            if(dvd.getTitle().equalsIgnoreCase(searchingTitle)) {
                message = dvd.toString();
            }
        }
        System.out.println(message);
    }
}
