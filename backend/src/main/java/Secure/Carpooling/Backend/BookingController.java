package Secure.Carpooling.Backend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*")
public class BookingController {

    private final BookingRepository bookingRepository;

    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @PostMapping
    public ResponseEntity<?> createBooking(@RequestBody Booking booking) {

        if (booking.getRideId() == null) {
            return ResponseEntity.badRequest().body("rideId is required");
        }

        if (booking.getPassengerId() == null) {
            return ResponseEntity.badRequest().body("passengerId is required");
        }

        if (booking.getSeatsBooked() == null || booking.getSeatsBooked() <= 0) {
            return ResponseEntity.badRequest().body("seatsBooked must be greater than 0");
        }

        booking.setBookingStatus("Confirmed");

        if (booking.getBookingDate() == null) {
            booking.setBookingDate(java.time.LocalDateTime.now());
        }

        Booking savedBooking = bookingRepository.save(booking);

        return ResponseEntity.ok(savedBooking);
    }

    @GetMapping
    public ResponseEntity<?> getAllBookings() {
        return ResponseEntity.ok(bookingRepository.findAll());
    }

    @GetMapping("/passenger/{passengerId}")
    public ResponseEntity<?> getPassengerBookings(
            @PathVariable Integer passengerId) {

        return ResponseEntity.ok(
                bookingRepository.findByPassengerId(passengerId)
        );
    }

    @GetMapping("/ride/{rideId}")
    public ResponseEntity<?> getRideBookings(
            @PathVariable Integer rideId) {

        return ResponseEntity.ok(
                bookingRepository.findByRideId(rideId)
        );
    }
}

