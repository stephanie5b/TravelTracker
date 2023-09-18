# TravelTracker

JavaFX Travel Tracker This project focuses on developing a JavaFX GUI application to keep track of all your travels.

Objective: 
The main goal is to create a GUI using JavaFX that manages travel data.

Description: 
The structure for this project is divided into the following classes:

Travel.java: The superclass storing common travel details. 
AirTravel.java: A subclass of Travel dedicated to air travel. 
LandTravel.java: A subclass of Travel for land travels. 
MyTravel.java: Initializes the non-gui program logic. 
MyTravelGUI.java: Contains the GUI program initialization.

Travel Abstract Class This class holds general travel information, including details like travel type, country, city, travel and return dates, stay duration, hotel, cost, and mileage.

AirTravel Class Specific to air travels, this class includes details such as the airline and reference number.

LandTravel Class Specific to land travels, this class defines the type of car used for the travel.

MyTravel Class Here, all travel objects are initialized from data read from an input file.

MyTravelGUI Class This is the main class for the JavaFX GUI.
