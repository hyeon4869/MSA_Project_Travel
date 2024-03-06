package travel.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import travel.domain.*;
import travel.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class FlightReservaionCancelRequested extends AbstractEvent {

    private Long id;
    private String airLine;
    private String arrAirport;
    private String depAirport;
    private Date arrTime;
    private Date depTime;
    private Long charge;
    private String vihicleId;
    private String status;
    private Long userId;
    private String name;
    private Long flightId;
    private String email;

    public FlightReservaionCancelRequested(FlightReservation aggregate) {
        super(aggregate);
    }

    public FlightReservaionCancelRequested() {
        super();
    }
}
//>>> DDD / Domain Event
