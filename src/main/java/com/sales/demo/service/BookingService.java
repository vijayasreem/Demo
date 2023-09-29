package com.sales.demo.service;

import com.sales.demo.model.Booking;
import com.sales.demo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> findBookingsByCustomerId(Long customerId) {
        return bookingRepository.findByCustomerId(customerId);
    }

    public List<Booking> findBookingsByStatus(String status) {
        return bookingRepository.findByStatus(status);
    }

    public List<Booking> findBookingsByCustomerIdAndStatus(Long customerId, String status) {
        return bookingRepository.findByCustomerIdAndStatus(customerId, status);
    }

    public List<Booking> findBookingsByCustomerIdAndPaymentMethod(Long customerId, String paymentMethod) {
        return bookingRepository.findByCustomerIdAndPaymentMethod(customerId, paymentMethod);
    }

    public List<Booking> findBookingsByCustomerIdAndRatingNotNull(Long customerId) {
        return bookingRepository.findByCustomerIdAndRatingNotNull(customerId);
    }

    public List<Booking> findBookingsByCustomerIdAndFeedbackNotNull(Long customerId) {
        return bookingRepository.findByCustomerIdAndFeedbackNotNull(customerId);
    }

    public List<Booking> findBookingsByCustomerIdAndStatusNot(Long customerId, String status) {
        return bookingRepository.findByCustomerIdAndStatusNot(customerId, status);
    }

    public List<Booking> findBookingsByCustomerIdAndPaymentMethodIn(Long customerId, List<String> paymentMethods) {
        return bookingRepository.findByCustomerIdAndPaymentMethodIn(customerId, paymentMethods);
    }

    public List<Booking> findBookingsByCustomerIdAndBookingDateBetween(Long customerId, LocalDate startDate, LocalDate endDate) {
        return bookingRepository.findByCustomerIdAndBookingDateBetween(customerId, startDate, endDate);
    }

    public List<Booking> findBookingsWithPromotions() {
        return bookingRepository.findByPromotionsNotNull();
    }

    // Additional business methods for booking modification, cancellation, payment, reviews, feedback, etc.

}