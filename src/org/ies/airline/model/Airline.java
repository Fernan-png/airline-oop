package org.ies.airline.model;

import java.util.Arrays;
import java.util.Objects;

public class Airline {
    private String name;
    private Flight[] flights;

    public Airline(String name, Flight[] flights) {
        this.name = name;
        this.flights = flights;
    }

    public void showInfo() {
        System.out.println("Aerolinea " + name);
        for (var flight : flights) {
            flight.showInfo();
        }
    }

    public void showFlightsFromOrigin(String origin) {
        for (var flight : flights) {
            if (flight.getOrigin().equals(origin)) {
                flight.showInfo();
            }
        }
    }

    public Flight findFlight(int flightNumber) {
        for (var flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                return flight;
            }
        }
        return null;
    }

    public void showPassengerFlights(String nif) {
        for (var flight : flights) {
            if (flight.hasPassenger(nif)) {
                flight.showInfo();
            }
        }
    }ºº

    public Integer getPassengerSeat(int fligthnumber, String nif) {
        var flight = findFlight(fligthnumber);
        if (flight != null) {
            var passenger = flight.findPassenger(nif);
            if (passenger != null) {
                return passenger.getSeatNumber();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name) && Objects.deepEquals(flights, airline.flights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(flights));
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", flights=" + Arrays.toString(flights) +
                '}';
    }
}