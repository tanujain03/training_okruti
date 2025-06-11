package Airlines.flight.Controller;

import Airlines.flight.Entity.Passengers;
import Airlines.flight.Service.FlightDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/flights")
public class FlightController {

    @Autowired
  private FlightDetailsService flightDetailsService;

    //add flightdetails or Passenger
    @PostMapping("/addPassenger")
    public ResponseEntity<String> addPassenger(@RequestBody List<Passengers> passengers){
        flightDetailsService.addPassengers(passengers);
        return ResponseEntity.status(HttpStatus.CREATED).body("passenger details add successfully");
    }


    // Delete the passenger details by ID
    @DeleteMapping("/deletePassengerDetails/{passengerId}")
    public ResponseEntity<String> deletePassenger(@PathVariable("passengerId") int passengerId) {
        flightDetailsService.deletePassenger(passengerId);
        return ResponseEntity.ok("Passenger successfully deleted!");
    }


    //update the passenger details
    @PutMapping("UpdatePassenger/{PassengerId}")
    public ResponseEntity<String> updatePassengerDetails(@PathVariable("PassengerId") int passengerId,
                                                         @RequestBody Passengers passengers){
        passengers.setPassengerId(passengerId);
        Passengers updatedPassenger=flightDetailsService.updatePassengerDetails(passengers);
        return new ResponseEntity<>("Passenger Updated",HttpStatus.OK);
    }

    //get Passenger details via flightNumber
    @GetMapping("detailsByFlightNumber/{flightNumber}")
    public ResponseEntity<List<Passengers>> getDetailsByFlightNumber(@PathVariable("flightNumber") int flightNumber){
        List<Passengers> passengers=flightDetailsService.FlightdetailsviaNumber(flightNumber);
        return ResponseEntity.ok(passengers);
    }

    //get Passenger details via source
    @GetMapping("detailsBysource/{source}")
    public ResponseEntity<List<Passengers>> getDetailsBySource(@PathVariable("source") String source){
        List<Passengers> passengers=flightDetailsService.FlightdetailsviaSource(source);
        return ResponseEntity.ok(passengers);
    }
    //get Passenger details via destination
    @GetMapping("detailsBydestination/{destination}")
    public ResponseEntity<List<Passengers>> getDetailsByDestination(@PathVariable("destination") String destination){
        List<Passengers> passengers=flightDetailsService.FlightdetailsviaDestination(destination);
        return ResponseEntity.ok(passengers);
    }
    //get all passengers
    @GetMapping("getUsers")
    public ResponseEntity <List<Passengers>> getAllUSers(){
        List<Passengers> users=flightDetailsService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Passengers>> getPassengersBySourceAndDestination(
            @RequestParam("source") String source,
            @RequestParam("destination") String destination) {

        List<Passengers> passengers = flightDetailsService
                .findBySourceAndDestination(source, destination);

        return ResponseEntity.ok(passengers);
    }


}
