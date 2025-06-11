package Airlines.flight.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FlightInformation")
public class Passengers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int passengerId;

    private int flightNumber;

    private String passengerName;

    private String source;

    private String destination;

    private int passengerAge;
}
