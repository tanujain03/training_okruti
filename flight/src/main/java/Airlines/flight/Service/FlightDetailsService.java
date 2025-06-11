package Airlines.flight.Service;


import Airlines.flight.Entity.Passengers;
import Airlines.flight.Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightDetailsService {

    @Autowired
    public FlightRepository flightRepository;

    //to add the passengers(passenger details)
    public List<Passengers> addPassengers(List<Passengers> passengers){
        return flightRepository.saveAll(passengers);
    }

    //to delete the passenger details
    public void deletePassenger(int PassengerId){
      flightRepository.deleteById(PassengerId);
    }

    //to update the passenger details
    public Passengers updatePassengerDetails(Passengers passenger){
        Passengers existPassenger=flightRepository.findById(passenger.getPassengerId()).get();
        existPassenger.setPassengerName(passenger.getPassengerName());
        existPassenger.setPassengerAge(passenger.getPassengerAge());
        existPassenger.setSource(passenger.getSource());
        existPassenger.setDestination(passenger.getDestination());

        Passengers updatedPassenger=flightRepository.save(existPassenger);
        return updatedPassenger;
    }

    //search passenger Details

    //via flightNumber
    //.orElseThrow only works with Optional.
    public List<Passengers> FlightdetailsviaNumber(int flightNumber) {
        List<Passengers> flights = flightRepository.findByFlightNumber(flightNumber);
        if (flights.isEmpty()) {
            throw new RuntimeException("No flights found from source: " + flightNumber);
        }
        return flights; }

    //via Source
    public List<Passengers> FlightdetailsviaSource(String source) {
        List<Passengers> flights = flightRepository.findBySource(source);
        if (flights.isEmpty()) {
            throw new RuntimeException("No flights found from source: " + source);
        }
        return flights;
    }

    //via destination
    public List<Passengers> FlightdetailsviaDestination(String destination) {
        List<Passengers> flights = flightRepository.findByDestination(destination);
        if (flights.isEmpty()) {
            throw new RuntimeException("No flights found from destination: " + destination);
        }
        return flights;
    }

    public List<Passengers> getAllUsers(){
        return flightRepository.findAll();
    }

    public List<Passengers> findBySourceAndDestination(String source, String destination) {
        List<Passengers> flights =  flightRepository.findBySourceAndDestination(source, destination);
        if (flights.isEmpty()) {
            throw new RuntimeException("No flights found from destination: " + destination);
        }
        return flights;
    }
}
