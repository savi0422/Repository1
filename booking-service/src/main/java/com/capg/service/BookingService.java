package com.capg.service;

import com.capg.dto.BookingDetailsDTO;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface BookingService {

    List<BookingDetailsDTO> getBookingDetails();
    BookingDetailsDTO getBookingDetailsById(Integer id);
    BookingDetailsDTO newBooking(BookingDetailsDTO bookingDetailsDTO);
    BookingDetailsDTO updateBookingDetails(Integer id, BookingDetailsDTO bookingDetailsDTO);
    void deleteBookingDetailsById(Integer id);
    void deleteAll();
}
