package com.ravi.springboot.xml_comparision;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class XmlComparatorMain extends Application {

        Scene scene1, scene2;
        @Override
        public void start(Stage primaryStage) throws Exception {
            primaryStage.setTitle("Xml Comparison Tool !!");


            //Scene 1
            Label prodLabel= new Label("Production XML");
            TextArea prodXmlArea = new TextArea();
            VBox layout1 = new VBox(20);
            Label prodPrlLabel= new Label("Production Prl XML");
            TextArea prodPrlXmlArea = new TextArea();





            scene1= new Scene(layout1, 300, 250);

            ListView<String> listView = new ListView();
            listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            Button button1= new Button("Compare XML");
            button1.setOnAction(e -> {
                boolean result = prodXmlArea.getText().equalsIgnoreCase(prodPrlXmlArea.getText());
                listView.getItems().add(""+result);
            });
            layout1.getChildren().addAll(prodLabel, prodXmlArea,prodPrlLabel,prodPrlXmlArea ,button1);
            layout1.getChildren().add(listView);
            primaryStage.setScene(scene1);
            primaryStage.show();
        }

        public static void main(String[] args) {
            Application.launch(args);
        }


}
