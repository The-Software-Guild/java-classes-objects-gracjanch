package dvdLibrary.view;

import dvdLibrary.controller.Controller;

import java.io.IOException;

public class UserView {
    Controller controller = new Controller();

    public void mainView() throws IOException {

        int userInput;
        do {
            System.out.println("===================" +
                    "\n[1] Add DVD" +
                    "\n[2] Remove DVD" +
                    "\n[3] Edit existing DVD" +
                    "\n[4] Show all DVDs" +
                    "\n[5] Show info about DVD" +
                    "\n[6] Find DVD by title" +
                    "\n[7] Exit" +
                    "\n===================");
            userInput = controller.userControl();
        } while (userInput < 7);

    }
}
