package com.gloriane;

public class MemberBookingProcessor implements BookingProcessor{
    @Override
    public Booking processBooking(BookingRequest request) {
        double discount = 0.2; // 20% discount for members
        double finalPrice = request.getBasePrice() * (1 - discount);
        boolean priorityAccess = true; // Members get priority access
        return new Booking(request.getMemberName(), finalPrice, priorityAccess);
    }
}
