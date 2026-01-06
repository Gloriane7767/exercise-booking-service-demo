package com.gloriane;

public class NonMemberBookingProcessor implements BookingProcessor{
    @Override
    public Booking processBooking(BookingRequest request) {
        double finalPrice = request.getBasePrice(); // No discount for non-members
        boolean priorityAccess = false; // Non-members do not get priority access
        return new Booking(request.getMemberName(), finalPrice, priorityAccess);
    }

}
