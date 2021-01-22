package com.upGrad;


import java.time.LocalDateTime;

public class Main {
    public static void main(String[] arg) {

        String[] locations = {"DL", "BL", "HP", "LL", "AG"};
        Flight f = new Flight("123", "AI", 128, 33);
        Passanger p = new Passanger("71", "Bn", "UP", "SM", "9759", "sayantanrulestheworld@gmail.com", 12);
        RegularTicket regular = new RegularTicket("R1234567", "BN", "DL", LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(70), p, "33", false, 675, f, "Food");
        TouristTicket tourist = new TouristTicket("T1234567", "BN", "DL", LocalDateTime.now(), LocalDateTime.now().plusMinutes(70),
                p, "33", false, 675, f, "BNww", locations);
        printTicketDetails(regular);
        printTicketDetails(tourist);

    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPNRNumber());
    }
}







