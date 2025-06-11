package Airlines.flight.Repository;

import Airlines.flight.Entity.Passengers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Passengers,Integer> {
    List<Passengers> findBySource(String source);
    List<Passengers> findByDestination(String destination);
    List<Passengers> findByFlightNumber(int flightNumber);


    List<Passengers> findBySourceAndDestination(String source, String destination);
}
