package chapter2.independantAttributes;

/**
 * Created by sakhtar on 02/07/2014.
 */
public class TicketOffice2 implements Runnable {
    private Cinema cinema;
    public TicketOffice2(Cinema cinema){
        this.cinema=cinema;
    }

    public void run() {
        cinema.sellTickets2(2);
        cinema.sellTickets2(4);
        cinema.sellTickets1(2);
        cinema.sellTickets1(1);
        cinema.returnTickets2(2);
        cinema.sellTickets1(3);
        cinema.sellTickets2(2);
        cinema.sellTickets1(2);
    }
}
