package service;

import domain.Residence;

import java.util.List;

public class ResidenceService {

    public static double getTotalPrice(List<Residence> residences) {
        double totalPrice = 0;
        for (Residence residence: residences) {
            totalPrice += residence.getPrice();
        }
        return totalPrice;
    }

    public static int getTotalSquareMeter(List<Residence> residences) {
        int totalSquareMeter = 0;
        for (Residence residence: residences) {
            totalSquareMeter += residence.getSquareMeter();
        }
        return totalSquareMeter;

    }

    public static List<Residence> getResidences(List<Residence> residences,int roomNumber,int saloonNumber) {
       return  residences.stream().
                filter(residence ->
                        (residence.getRoomNumber() == roomNumber
                                && residence.getSaloonNumber() == saloonNumber)).toList();

    }


}
