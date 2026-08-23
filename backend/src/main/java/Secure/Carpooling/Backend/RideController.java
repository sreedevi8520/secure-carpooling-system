package Secure.Carpooling.Backend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/rides")
@CrossOrigin(origins = "*")
public class RideController {

    private final RideRepository rideRepository;

    public RideController(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    @PostMapping
    public ResponseEntity<?> createRide(@RequestBody Ride ride) {

        Ride savedRide = rideRepository.save(ride);

        return ResponseEntity.ok(savedRide);
    }

    @GetMapping
    public ResponseEntity<?> getAllRides() {

        return ResponseEntity.ok(
                rideRepository.findAll()
        );
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchRides(
            @RequestParam String startLocation,
            @RequestParam String destination,
            @RequestParam(required = false) String travelDate) {

        if (travelDate != null && !travelDate.isBlank()) {

            LocalDate date = LocalDate.parse(travelDate);

            return ResponseEntity.ok(
                    rideRepository
                            .findByStartLocationIgnoreCaseAndDestinationIgnoreCaseAndTravelDate(
                                    startLocation,
                                    destination,
                                    date
                            )
            );
        }

        return ResponseEntity.ok(
                rideRepository
                        .findByStartLocationIgnoreCaseAndDestinationIgnoreCase(
                                startLocation,
                                destination
                        )
        );
    }
}