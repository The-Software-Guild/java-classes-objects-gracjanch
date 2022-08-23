package dvdLibrary;

import dvdLibrary.view.UserView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        UserView userView = new UserView();

        userView.mainView();
    }
}
