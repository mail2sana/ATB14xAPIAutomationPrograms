package com.thetestingacademy.ex_07_PayloadManagement.POJO.ManualWay.response;

import com.thetestingacademy.ex_07_PayloadManagement.POJO.ManualWay.request.Booking;

public class BookingResponse {

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    private Integer bookingId;
    private Booking booking;


}
