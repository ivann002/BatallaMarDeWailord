package com.example.batallamardewailord;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;


import java.util.Timer;

public class HelloController {
        @FXML
        private ImageView Ventana;
        @FXML
        private ImageView yate;

        public void initialize(){
                Barco lancha = new Barco("Lancha",10, 20, 10,10,"España", yate);
        }

        @FXML
        public void OnMouseDragged(Event evento) {
                yate.setOnMouseDragged(event -> {
                        yate.setTranslateX(event.getSceneX());
                        yate.setTranslateY(event.getSceneY());
                });
        }
}