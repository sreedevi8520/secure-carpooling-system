package Secure.Carpooling.Backend;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface RideRepository extends JpaRepository<Ride, Integer> {

    List<Ride> findByStartLocationIgnoreCaseAndDestinationIgnoreCase(
            String startLocation,
            String destination
    );

    List<Ride> findByStartLocationIgnoreCaseAndDestinationIgnoreCaseAndTravelDate(
            String startLocation,
            String destination,
            LocalDate travelDate
    );
}