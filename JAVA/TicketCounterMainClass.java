public class TicketCounterMainClass {
    public static void main(String[] args) {
        TicketCounter t1 = new TicketCounter(50, 101);
        t1.totalTickets();
        t1.buyTickets(10);
        t1.totalTickets();
        t1.cancleTickets(7);
        t1.totalTickets();
        t1.buyTickets(30);
        t1.totalTickets();
    }
}
