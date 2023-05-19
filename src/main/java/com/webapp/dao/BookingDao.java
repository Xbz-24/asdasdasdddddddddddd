package com.webapp.dao;

import com.webapp.model.Booking;

import java.util.List;
public interface BookingDao {
    void createBooking(Booking booking);
    void updateBooking(Booking booking);
    void deleteBooking(int bookingId);
    Booking getBookingById(int bookingId);
    List<Booking> getAllBookings();
    List<Booking> getBookingsByClient(String clientName);
    List<Booking> getBookingsByStatus(String status);
    List<Booking> getBookingsByCrewMember(int crewMemberId);
    // Add additional methods as needed for specific queries or operations
}
