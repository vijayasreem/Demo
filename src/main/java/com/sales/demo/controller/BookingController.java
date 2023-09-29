package com.sales.demo.controller;

import com.sales.demo.model.Booking;
import com.sales.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<Booking>> findBookingsByCustomerId(@PathVariable Long customerId) {
        List<Booking> bookings = bookingService.findBookingsByCustomerId(customerId);
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<Booking>> findBookingsByStatus(@PathVariable String status) {
        List<Booking> bookings = bookingService.findBookingsByStatus(status);
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @GetMapping("/customer/{customerId}/status/{status}")
    public ResponseEntity<List<Booking>> findBookingsByCustomerIdAndStatus(@PathVariable Long customerId, @PathVariable String status) {
        List<Booking> bookings = bookingService.findBookingsByCustomerIdAndStatus(customerId, status);
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @GetMapping("/customer/{customerId}/payment-method/{paymentMethod}")
    public ResponseEntity<List<Booking>> findBookingsByCustomerIdAndPaymentMethod(@PathVariable Long customerId, @PathVariable String paymentMethod) {
        List<Booking> bookings = bookingService.findBookingsByCustomerIdAndPaymentMethod(customerId, paymentMethod);
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @GetMapping("/customer/{customerId}/rating-not-null")
    public ResponseEntity<List<Booking>> findBookingsByCustomerIdAndRatingNotNull(@PathVariable Long customerId) {
        List<Booking> bookings = bookingService.findBookingsByCustomerIdAndRatingNotNull(customerId);
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @GetMapping("/customer/{customerId}/feedback-not-null")
    public ResponseEntity<List<Booking>> findBookingsByCustomerIdAndFeedbackNotNull(@PathVariable Long customerId) {
        List<Booking> bookings = bookingService.findBookingsByCustomerIdAndFeedbackNotNull(customerId);
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @GetMapping("/customer/{customerId}/status-not/{status}")
    public ResponseEntity<List<Booking>> findBookingsByCustomerIdAndStatusNot(@PathVariable Long customerId, @PathVariable String status) {
        List<Booking> bookings = bookingService.findBookingsByCustomerIdAndStatusNot(customerId, status);
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @GetMapping("/customer/{customerId}/payment-method-in")
    public ResponseEntity<List<Booking>> findBookingsByCustomerIdAndPaymentMethodIn(@PathVariable Long customerId, @RequestParam List<String> paymentMethods) {
        List<Booking> bookings = bookingService.findBookingsByCustomerIdAndPaymentMethodIn(customerId, paymentMethods);
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @GetMapping("/customer/{customerId}/booking-date-between")
    public ResponseEntity<List<Booking>> findBookingsByCustomerIdAndBookingDateBetween(@PathVariable Long customerId, @RequestParam LocalDate startDate, @RequestParam LocalDate endDate) {
        List<Booking> bookings = bookingService.findBookingsByCustomerIdAndBookingDateBetween(customerId, startDate, endDate);
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @GetMapping("/promotions")
    public ResponseEntity<List<Booking>> findBookingsWithPromotions() {
        List<Booking> bookings = bookingService.findBookingsWithPromotions();
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    // Additional business methods for booking modification, cancellation, payment, reviews, feedback, etc.
    
}