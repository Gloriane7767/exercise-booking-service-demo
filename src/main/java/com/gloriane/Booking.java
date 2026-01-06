package com.gloriane;

public class Booking {
    private String memberName;
    private double finalPrice;
    private boolean priorityAccess;

    public Booking(String memberName, double finalPrice, boolean priorityAccess) {
        this.memberName = memberName;
        this.finalPrice = finalPrice;
        this.priorityAccess = priorityAccess;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "memberName='" + memberName + '\'' +
                ", finalPrice=" + finalPrice +
                ", priorityAccess=" + priorityAccess +
                '}';
    }
}
