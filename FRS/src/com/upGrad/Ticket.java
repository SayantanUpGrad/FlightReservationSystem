package com.upGrad;
import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private String PNRNumber;
    private String departureLocation;
    private String destinationLocation;
    private LocalDateTime arrival;
    private LocalDateTime destination;
    private Passanger passanger;
    private String seatNo;
    private boolean isCancled;
    private int price;
    private Flight flight;

    public Ticket(String PNRNumber, String departureLocation, String destinationLocation,
                  LocalDateTime arrival, LocalDateTime destination, Passanger passanger,
                  String seatNo, boolean isCancled, int price, Flight flight) {
        this.PNRNumber = PNRNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.arrival = arrival;
        this.destination = destination;
        this.passanger = passanger;
        this.seatNo = seatNo;
        this.isCancled = isCancled;
        this.price = price;
        this.flight = flight;
    }
    public String getPNRNumber() {
        return PNRNumber;
    }

    public void setPNRNumber(String PNRNumber) {
        this.PNRNumber = PNRNumber;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public void setArrival(LocalDateTime arrival) {
        this.arrival = arrival;
    }

    public LocalDateTime getDestination() {
        return destination;
    }

    public void setDestination(LocalDateTime destination) {
        this.destination = destination;
    }

    public Passanger getPassenger() {
        return passanger;
    }

    public void setPassenger(Passanger passanger) {
        this.passanger = passanger;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public boolean isCancled() {
        return isCancled;
    }

    public void setCancled(boolean cancled) {
        isCancled = cancled;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    Ticket(Flight flight, Passanger passanger){
        this.flight = flight;
        this.passanger = passanger;
    }


    public  String checkStatus(){
        if(isCancled==true){
            return "Cancel";
        }
        else{
            return "Confirm";
        }

    }
    public long getDuration(){
        Duration duration = Duration.between(arrival, destination);
        long diff = Math.abs(duration.toMinutes());
        return diff;

    }
    public void cancelTicket(){
        isCancled=true;

    }


    public String toString() {
        return "Ticket{" +
                "PNRNumber='" + PNRNumber + '\'' +
                ", departureLocation='" + departureLocation + '\'' +
                ", destinationLocation='" + destinationLocation + '\'' +
                ", arrival=" + arrival +
                ", destination=" + destination +
                ", passanger=" + passanger +
                ", seatNo='" + seatNo + '\'' +
                ", isCancled=" + isCancled +
                ", price=" + price +
                ", flight=" + flight +
                '}';
    }

}
