package org.ies.airline.components;

import org.ies.airline.model.Passenger;

import java.util.Scanner;

public class PassengerReader {
    private final Scanner scanner;

    public PassengerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Passenger read() {
        System.out.println("** DATOS DEL VUELO **");

        System.out.print("NIF: ");
        String nif = scanner.nextLine();

        System.out.print("Nombre: ");
        String name = scanner.nextLine();

        System.out.print("Apellidos: ");
        String surname = scanner.nextLine();

        System.out.print("Número de asiento: ");
        Integer seatNumber = scanner.nextInt();
        scanner.nextLine();

        return new Passenger(
                nif,
                name,
                surname,
                seatNumber
        );
    }
}
