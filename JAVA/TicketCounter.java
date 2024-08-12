public class TicketCounter {
    int no_of_tickets, ticker_counter;

    TicketCounter(int tickets, int counter){
        this.no_of_tickets = tickets;
        this.ticker_counter = counter;
    }

    void buyTickets(int n){
        if (n > no_of_tickets) {
            System.out.println("Buying tickets failed due to incificient ticket");
        }
        else{
            no_of_tickets -= n;
            System.out.println("you purchase "+n+" number of tickets successfully");
        }
    }

    void cancleTickets(int n){
        no_of_tickets += n;
        System.out.println("you cancle "+n+" number of tickets successfully");
    }

    void totalTickets(){
        System.out.println("Total Tickets : "+ no_of_tickets);
    }
}
