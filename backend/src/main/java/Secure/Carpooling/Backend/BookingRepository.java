package Secure.Carpooling.Backend;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

    List<Booking> findByPassengerId(Integer passengerId);

    List<Booking> findByRideId(Integer rideId);
}