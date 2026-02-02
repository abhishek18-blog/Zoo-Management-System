package com.mycompany.zoomanagementsystem;

import com.mongodb.client.*;
import org.bson.Document;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ZooManagementSystem extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Cage Entry");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label cageIdLbl = new Label("Cage ID:");
        TextField cageIdField = new TextField();
        grid.add(cageIdLbl, 0, 0);
        grid.add(cageIdField, 1, 0);

        Label sizeLbl = new Label("Size:");
        TextField sizeField = new TextField();
        grid.add(sizeLbl, 0, 1);
        grid.add(sizeField, 1, 1);

        Label typeLbl = new Label("Type:");
        TextField typeField = new TextField();
        grid.add(typeLbl, 0, 2);
        grid.add(typeField, 1, 2);

        Label capacityLbl = new Label("Capacity:");
        TextField capacityField = new TextField();
        grid.add(capacityLbl, 0, 3);
        grid.add(capacityField, 1, 3);

        Label occupancyLbl = new Label("Current Occupancy:");
        TextField occupancyField = new TextField();
        grid.add(occupancyLbl, 0, 4);
        grid.add(occupancyField, 1, 4);

        Label locationLbl = new Label("Location Desc:");
        TextField locationField = new TextField();
        grid.add(locationLbl, 0, 5);
        grid.add(locationField, 1, 5);

        Button saveBtn = new Button("Save Cage");
        Label statusLbl = new Label();
        grid.add(saveBtn, 0, 6);
        grid.add(statusLbl, 1, 6);

        saveBtn.setOnAction(e -> {
            String cageId = cageIdField.getText();
            String size = sizeField.getText();
            String type = typeField.getText();
            String capacity = capacityField.getText();
            String currentOccupancy = occupancyField.getText();
            String locationDescription = locationField.getText();

            try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
                MongoDatabase database = mongoClient.getDatabase("zooDB");
                MongoCollection<Document> collection = database.getCollection("cage");

                Document cageDoc = new Document("CageID", cageId)
                        .append("size", size)
                        .append("type", type)
                        .append("capacity", capacity)
                        .append("currentOccupancy", currentOccupancy)
                        .append("locationDescription", locationDescription);

                collection.insertOne(cageDoc);
                statusLbl.setText("Inserted!");
            } catch (Exception ex) {
                statusLbl.setText("Error: " + ex.getMessage());
                ex.printStackTrace();
            }
        });

        Scene scene = new Scene(grid, 350, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
