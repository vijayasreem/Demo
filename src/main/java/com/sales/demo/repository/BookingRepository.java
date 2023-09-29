
package com.sales.demo.repository;

import com.sales.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByCustomerId(Long customerId); // Query to find bookings by customer ID

    List<Booking> findByStatus(String status); // Query to find bookings by status

    // Custom queries
    List<Booking> findByCustomerIdAndStatus(Long customerId, String status); // Query to find bookings by customer ID and status

    List<Booking> findByCustomerIdAndPaymentMethod(Long customerId, String paymentMethod); // Query to find bookings by customer ID and payment method

    List<Booking> findByCustomerIdAndRatingNotNull(Long customerId); // Query to find bookings by customer ID with non-null rating

    List<Booking> findByCustomerIdAndFeedbackNotNull(Long customerId); // Query to find bookings by customer ID with non-null feedback

    // Additional methods
    List<Booking> findByCustomerIdAndStatusNot(Long customerId, String status); // Query to find bookings by customer ID and not equal to status

    List<Booking> findByCustomerIdAndPaymentMethodIn(Long customerId, List<String> paymentMethods); // Query to find bookings by customer ID and payment method in the given list

    List<Booking> findByCustomerIdAndBookingDateBetween(Long customerId, LocalDate startDate, LocalDate endDate); // Query to find bookings by customer ID and booking date between the given range

    List<Booking> findByPromotionsNotNull(); // Query to find bookings with non-null promotions

}
