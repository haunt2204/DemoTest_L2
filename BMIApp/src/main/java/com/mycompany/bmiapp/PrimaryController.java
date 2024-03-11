package com.mycompany.bmiapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
<<<<<<< HEAD
        int a = 2;
        boolean b;
        if(a<0)
            b=true;
=======
        int a = 3;
        boolean b;
        if(a>0)
            b = true;
>>>>>>> main
        App.setRoot("secondary");
    }
}
