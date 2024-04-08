package com.example.demo1.entity;

public class Credit {
    private int id; // Новое поле id
    private String name;
    private double interestRate;
    private double loanAmount;
    private int durationMonths;

    public Credit() {
    }

    public Credit(int id, String name, double interestRate, double loanAmount, int durationMonths) {
        this.id = id;
        this.name = name;
        this.interestRate = interestRate;
        this.loanAmount = loanAmount;
        this.durationMonths = durationMonths;
    }

    public int getId() { // Метод getId()
        return id;
    }

    public void setId(int id) { // Метод setId()
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }
}