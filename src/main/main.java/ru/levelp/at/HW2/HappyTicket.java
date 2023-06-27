package ru.levelp.at.HW2;

public class HappyTicket {
    public static void main(String[] args) {
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


