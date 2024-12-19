package org.ies.airline.components;

import org.ies.airline.model.Flight;
import org.ies.airline.model.Passenger;

import java.util.Scanner;

public class FlightReader {
    private final Scanner scanner;
    private final PassengerReader passengerReader;

    public FlightReader(Scanner scanner, PassengerReader passengerReader) {
        this.scanner = scanner;
        this.passengerReader = passengerReader;
    }

    public Flight read() {
        System.out.println("** DATOS DEL PASAJERO **");
        System.out.print("Número de vuelo: ");
        int flightNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Lugar de origen: ");
        String origin = scanner.nextLine();

        System.out.print("Lugar de destino: ");
        String destination = scanner.nextLine();

        System.out.print("Puerta de embarque: ");
        int gateNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Cuantos pasajeros hay?");
        int size = scanner.nextInt();
        scanner.nextLine();

        Passenger[] passengers = new Passenger[size];
        for (int i = 0; i < size ; i++) {
            passengers[i] = passengerReader.read();
        }

        return new Flight(
                flightNumber,
                origin,
                destination,
                gateNumber,
                passengers
        );
    }
}
