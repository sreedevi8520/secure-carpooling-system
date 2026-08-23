package Secure.Carpooling.Backend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vehicles")
@CrossOrigin(origins = "*")
public class VehicleController {

    private final VehicleRepository vehicleRepository;

    public VehicleController(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @PostMapping
    public ResponseEntity<?> addVehicle(@RequestBody Vehicle vehicle) {

        if (vehicleRepository.existsByVehicleNumber(
                vehicle.getVehicleNumber())) {

            return ResponseEntity
                    .badRequest()
                    .body("Vehicle number already registered");
        }

        Vehicle savedVehicle = vehicleRepository.save(vehicle);

        return ResponseEntity.ok(savedVehicle);
    }

    @GetMapping
    public ResponseEntity<?> getAllVehicles() {

        return ResponseEntity.ok(
                vehicleRepository.findAll()
        );
    }
}