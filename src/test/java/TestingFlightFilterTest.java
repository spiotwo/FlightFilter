import com.gridnine.testing.filter.Filter;
import com.gridnine.testing.filter.FilterImpl;
import com.gridnine.testing.model.Flight;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;


class TestingFlightFilterTest {

    List<Flight> testFlights;
    Filter flightFilter = new FilterImpl();

    @BeforeEach
    void setUp() {
        testFlights = FlightTestData.getList();
    }

    @AfterEach
    void tearDown() {
        testFlights = null;
    }

    @Test
    public void AlreadyDeparted(){
        List<Flight> expected = new ArrayList<>(testFlights);
        List<Flight> actual = flightFilter.AlreadyDeparted(testFlights);
        expected.remove(1);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    public void ArrivalBeforeDeparture() {
        List<Flight> expected = new ArrayList<>(testFlights);
        List<Flight> actual = flightFilter.ArrivalBeforeDeparture(testFlights);
        expected.remove(4);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    public void GroundTimeMoreThanTwoHours() {
        List<Flight> expected = new ArrayList<>(testFlights);
        List<Flight> actual = flightFilter.GroundTimeMoreThanTwoHours(testFlights);
        expected.remove(3);
        Assertions.assertIterableEquals(expected, actual);
    }
}
