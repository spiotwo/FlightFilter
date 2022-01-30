package com.gridnine.testing;

import com.gridnine.testing.filter.Filter;
import com.gridnine.testing.filter.FilterImpl;
import com.gridnine.testing.model.Flight;
import com.gridnine.testing.utility.FlightBuilder;
import com.gridnine.testing.utility.InputParser;
import com.gridnine.testing.utility.FlightPrinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
        public static void main(String[] args) throws IOException {
        List<Flight> flights = FlightBuilder.createFlights();
        FlightPrinter.PrintFlights(flights);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Filter FlightFilter = new FilterImpl();
        while(true) {
            String input = br.readLine();
            if (!input.equals("0")) {
                int[] filterID = InputParser.ParseInput(input);
                for (int i : filterID) {
                    switch (i) {
                        case (1):
                            flights = FlightFilter.AlreadyDeparted(flights);
                            break;
                        case (2):
                            flights = FlightFilter.ArrivalBeforeDeparture(flights);
                            break;
                        case (3):
                            flights = FlightFilter.GroundTimeMoreThanTwoHours(flights);
                    }
                }
                FlightPrinter.PrintFlights(flights);
                flights = FlightBuilder.createFlights();
            }
            else{
                return;
            }
        }
    }
}
