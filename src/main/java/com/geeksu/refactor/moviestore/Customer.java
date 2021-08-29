package com.geeksu.refactor.moviestore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoint = 0;
        String result = "Rental Record for " + getName() + "\n";
        for (Rental each : rentals) {
            double thisAmount = 0;
            thisAmount += each.account();
            frequentRenterPoint++;
            if(each.isBonus()) {
                frequentRenterPoint++;
            }
            result += each.statement();
            totalAmount += thisAmount;
        }
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoint) +
                " frequent rentenr points";
        return result;
    }


}
