package com.gloriane;

public class BookingApp {
    public static void main(String[] args) {
        BookingProcessor processor = new MemberBookingProcessor();
        BookingRequest request = new BookingRequest("Susane Joy", 500.0);
        Booking booking = processor.processBooking(request);
        System.out.println(booking);
    }
}
