package src.main.HW2;

import java.io.IOException;
import java.util.ArrayList;

public class LakyTikket {
    public static void main(String[] args) {

//        System.out.println(isMyTicketLucky(123006));
//        System.out.println(isMyTicketLucky(555555));
//        System.out.println(isMyTicketLucky(248754687));

    }


    public static boolean isMyTicketLucky(int ticketNumber) {
        if (ticketNumber >= 0 && ticketNumber < 1000000) {
            var leftSum = ticketNumber / 100000 + (ticketNumber / 10000 % 10) + (ticketNumber / 1000 % 10);
            var rightSum = (ticketNumber / 100 % 10) + (ticketNumber / 10 % 10) + (ticketNumber % 10);
            return leftSum == rightSum;
        }
        throw new IllegalArgumentException("Билет с таким номером не существует");
    }
}


