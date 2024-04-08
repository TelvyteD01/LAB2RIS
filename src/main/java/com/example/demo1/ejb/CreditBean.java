package com.example.demo1.ejb;

import com.example.demo1.entity.Credit;
import jakarta.ejb.Stateless;

import java.util.ArrayList;
import java.util.List;

@Stateless
public class CreditBean {
    private List<Credit> credits;

    public CreditBean() {
        credits = new ArrayList<>();
        credits.add(new Credit(1, "Credit 1", 5.0, 10000, 12));
        credits.add(new Credit(2, "Credit 2", 4.5, 15000, 24));
        credits.add(new Credit(3, "Credit 3", 6.0, 20000, 36));
        credits.add(new Credit(4, "Credit 4", 3.0, 12000, 22));
        credits.add(new Credit(5, "Credit 5", 7.5, 14000, 14));
    }

    public List<Credit> findCreditsWithBestConditions(int count) {
        List<Credit> bestCredits = new ArrayList<>();
        credits.sort((c1, c2) -> Double.compare(c1.getInterestRate(), c2.getInterestRate()));
        for (int i = 0; i < count && i < credits.size(); i++) {
            bestCredits.add(credits.get(i));
        }
        return bestCredits;
    }

    public double calculateMonthlyPayment(double loanAmount, double interestRate, int durationMonths) {
        double monthlyInterestRate = interestRate / 100 / 12;
        double denominator = Math.pow(1 + monthlyInterestRate, durationMonths) - 1;
        double monthlyPayment = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, durationMonths)) / denominator;
        return monthlyPayment;
    }

    public List<Credit> getCredits() {
        return credits;
    }

    public Credit getCreditById(int creditId) {
        for (Credit credit : credits) {
            if (credit.getId() == creditId) {
                return credit;
            }
        }
        return null;
    }
}