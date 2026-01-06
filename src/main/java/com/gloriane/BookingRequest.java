package com.gloriane;

public class BookingRequest {
    private String memberName;
    private double basePrice;

    public BookingRequest(String memberName, double basePrice) {
        this.memberName = memberName;
        this.basePrice = basePrice;
    }

    public String getMemberName() {
        return memberName;
    }

    public double getBasePrice() {
        return basePrice;
    }

}
