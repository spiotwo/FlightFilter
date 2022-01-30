package com.gridnine.testing.utility;

import com.gridnine.testing.model.Flight;

import java.util.List;

public class FlightPrinter {
    public static void PrintFlights(List<Flight> flights) {
        int i = 0;
        for (Flight flight : flights) {
            System.out.println("Перелёт №" + (i+1) + ": " + flight + "\n");
            i++;
        }
        System.out.println("Введите номера фильтров через пробел: \n" +
                "Фильтр 1: Исключить полёты, которые уже вылетели\n" +
                "Фильтр 2: Исключить полёты, где имеются сегменты с датой прилёта раньше даты вылета\n" +
                "Фильтр 3: Исключить полёты, при которых общее время, проведённое на земле превышает два часа\n"  +
                "Для выхода нажмите 0");
    }
}
