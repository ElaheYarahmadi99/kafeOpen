package model.entity;

import java.util.Date;

public class Member {
    private long id;
    private String name;
    private Date startDate;

    public long getId() {
        return id;
    }

    public Member setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Member setName(String name) {
        this.name = name;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Member setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }
}
