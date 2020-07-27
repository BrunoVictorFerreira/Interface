package aplicattion;

import Model.entities.CarRental;
import Model.entities.Vehicle;
import Model.services.BrasilTaxService;
import Model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        CarRental cr = new CarRental(sdf.parse("25/06/2018 10:30"), sdf.parse("25/06/2018 14:40"), new Vehicle("Civic"));
        RentalService rs = new RentalService(10.00, 130.00, new BrasilTaxService());
        rs.processInvoice(cr);

//        System.out.println("Enter rental data");
//        System.out.print("Car model: ");
//        String carModel = sc.nextLine();
//        System.out.println("Pickup (dd/MM/yyyy hh/mm): ");
//        Date start = sdf.parse(sc.nextLine());
//        System.out.println("Return (dd/MM/yyyy hh/mm): ");
//        Date finish = sdf.parse(sc.nextLine());
//        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
//        System.out.println("Enter price per hour: ");
//        double pricePerHour = sc.nextDouble();
//        System.out.println("Enter price per day: ");
//        double pricePerDay = sc.nextDouble();
//        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
//        rentalService.processInvoice(cr);
//        System.out.println("INVOICE: ");
//        System.out.println("Basic Payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
//        System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
//        System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();
    }
}
