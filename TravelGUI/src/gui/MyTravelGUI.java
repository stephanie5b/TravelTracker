package gui;

import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import travel.MyTravel; 

public class MyTravelGUI extends Application {
	public static String fileInput;		//contains the user's file name input
	protected TextArea textDisplay = new TextArea();	//text area
	MyTravel my = new MyTravel();
	
	protected BorderPane getPane(){		
		VBox buttonPane = new VBox(20);		//pane for buttons
		buttonPane.setPadding(new Insets(10, 10, 10, 10));
	   buttonPane.setStyle("-fx-border-color: silver");	//adds border
		
      
     FlowPane flowpane = new FlowPane();
      flowpane.setPadding(new Insets(10,10,10,10));
      TextField fileName = new TextField();	//where user inputs file name
		fileName.setPromptText("Enter file name.");
		Button readFile = new Button("Read File");
      
      flowpane.getChildren().addAll(fileName, readFile);
      flowpane.setAlignment(Pos.TOP_LEFT);
		
		Button printAT = new Button("Print Air Travel Data");
      Button printLT = new Button("Print Land Travel Data");
		Button printTD = new Button("Print Travel Days");
		Button printTC = new Button("Print Travel Cost");
		Button printTAD = new Button("Print Travel Air Mileage");
		Button printTLD = new Button("Print Travel Land Mileage");
      
      printAT.setMaxWidth(Double.MAX_VALUE);
      printLT.setMaxWidth(Double.MAX_VALUE);
      printTD.setMaxWidth(Double.MAX_VALUE);
      printTC.setMaxWidth(Double.MAX_VALUE);
      printTAD.setMaxWidth(Double.MAX_VALUE);
      printTLD.setMaxWidth(Double.MAX_VALUE);
      readFile.setMaxWidth(Double.MAX_VALUE);      
      
      buttonPane.setSpacing(25);     
		buttonPane.getChildren().addAll( printAT,printLT, printTD, printTC, printTAD, printTLD);
		buttonPane.setAlignment(Pos.CENTER_RIGHT);
		
      BorderPane pane = new BorderPane();
      pane.setCenter(buttonPane);
      pane.setTop(flowpane);
      
      VBox textPane = new VBox(70);	//for text area
		textPane.setPadding(new Insets(10, 10, 25, 10));
		textPane.setStyle("-fx-font-size: 20px;");
      textPane.setStyle("-fx-border-color: silver");	//adds border
		textPane.getChildren().add(textDisplay);
		textPane.setAlignment(Pos.TOP_LEFT);
		pane.setRight(textPane);
		
		textDisplay.setPrefHeight(500);	//sets height of text area
		textDisplay.setPrefWidth(500);	//sets width of text area
	   textDisplay.setEditable(false);	//does not allow editing in text area
		//Scroll bar controls
      VBox scrollpane = new VBox(50);
      ScrollPane sb = new ScrollPane();
      scrollpane.getChildren().add(sb);
      //pane.setRight(scrollpane);
     // sb.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
      sb.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
      sb.setContent(textPane);
      sb.setStyle("-fx-font-size: 15px;");
      
		readFile.setOnAction(e -> {
			fileInput = fileName.getText();
			if (fileInput.equals("travel.txt")) {
				my.init(fileInput);		
				textDisplay.setText(fileInput + " has been read" + "\n" + my.printTravel());
            
			}
			else
				textDisplay.setText(fileInput + " is not a correct file name");
		});
      printAT.setOnAction(e -> {
			textDisplay.setText(my.printAir());
		});
      printLT.setOnAction(e -> {
			textDisplay.setText(my.printLand());
		});
       printTD.setOnAction(e -> {
			textDisplay.setText(my.TravelDays());
		});
      printTC.setOnAction(e -> {
			textDisplay.setText(my.TravelCost());
		});
      
      printTAD.setOnAction(e -> {
			textDisplay.setText(my.AirMileage());
		});
      printTLD.setOnAction(e -> {
			textDisplay.setText(my.LandMileage());
		});
		

		return pane;
	}

	public void start(Stage primaryStage){
		Scene scene = new Scene(getPane(), 1000, 500);
		primaryStage.setTitle("Stephanie Borja");	//stage title
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args){		
		launch(args);
	}
}