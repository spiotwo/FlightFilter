package com.gridnine.testing.filter;

import com.gridnine.testing.model.Flight;
import java.util.List;

public interface Filter {

    List<Flight> AlreadyDeparted(List<Flight> flights);

    List<Flight> ArrivalBeforeDeparture(List<Flight> flights);

    List<Flight> GroundTimeMoreThanTwoHours(List<Flight> flights);
}
