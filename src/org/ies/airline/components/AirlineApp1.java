package org.ies.airline.components;

import org.ies.airline.model.Airline;
import org.ies.airline.model.Flight;

import java.util.Scanner;

public class AirlineApp1 {
    private final Scanner scanner;
    private final AirlineReader airlineReader;
    private final FlightReader flightReader;

    public AirlineApp1(Scanner scanner, AirlineReader airlineReader, FlightReader flightReader) {
        this.scanner = scanner;
        this.airlineReader = airlineReader;
        this.flightReader = flightReader;
    }

    public void run() {

        System.out.println("** DATOS DE LA AEROLÍNEA **");
        Airline airline = airlineReader.read();

        System.out.println("** DATOS DE EL VUELO **");
        int flightNumber = scanner.nextInt();
        scanner.nextLine();
        Flight flight = flightReader.read();
        flight.getFlightNumber();
    }
}
