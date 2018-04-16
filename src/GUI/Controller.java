package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

public class Controller {

    @FXML
    private TextArea showContent;

    @FXML
    private ArrayList<String> alleHoldList = new ArrayList<>();

    @FXML
    private ArrayList<String> alleKursisterList = new ArrayList<>();

    @FXML
    private Button alleHold;

    @FXML
    private Button opretHold;

    @FXML
    private Button alleKursister;

    @FXML
    private Button opretKursist;

    @FXML
    private void handleAlleHoldButton() {

        System.out.println("Hold oprettet: " + alleHoldList);
        showContent.setText("Følgende hold er oprettet:\n" + alleHoldList);
    }

    @FXML
    private void handleOpretHoldButton() {

        System.out.println("Hold oprettet.");
        alleHoldList.add("Nyt hold");
        showContent.setText("Holdet er oprettet.");
    }

    @FXML
    private void handleAlleKursisterButton() {

        System.out.println("Kursister oprettet: " + alleKursisterList);
        showContent.setText("Følgende kursister er oprettet:\n" + alleKursisterList);
    }

    @FXML
    private void handleOpretKursistButton() {

        System.out.println("Kursist oprettet.");
        alleKursisterList.add("Ny kursist");
        showContent.setText("Kursisten er oprettet.");
    }
}
