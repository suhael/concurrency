package chapter1.daemon;

import java.util.Date;

/**
 * Created by sakhtar on 18/06/2014.
 */
public class Event {

    private Date date;
    private String event;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
