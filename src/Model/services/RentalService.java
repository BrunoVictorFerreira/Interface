package Model.services;

import Model.entities.CarRental;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;

    private BrasilTaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, BrasilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        long p1 = carRental.getStart().getTime();
        long p2 = carRental.getFinish().getTime();
        double basicPayment = Math.ceil((p2 - p1) / 1000 / 60 / 60);
        System.out.println(basicPayment);

    }
}
