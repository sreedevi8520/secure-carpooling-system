package Secure.Carpooling.Backend;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    boolean existsByVehicleNumber(String vehicleNumber);
}