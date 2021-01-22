package com.upGrad;
import java.time.LocalDateTime;

public class RegularTicket extends Ticket{
    private String specialService;

    public RegularTicket(String PNRNumber,String departureLocation,String destinationLocation,LocalDateTime arrival,LocalDateTime destination,Passanger passanger,String seatNo,boolean isCanceled,int price,Flight flight,
                         String specialService) {
       super(PNRNumber,departureLocation,destinationLocation,arrival,destination,passanger,seatNo,isCanceled,price,flight);
        this.specialService = specialService;
    }

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }


    public String toString() {
        return "RegularTicket{" +
                "specialService='" + specialService + '\'' +
                '}';
    }
}
