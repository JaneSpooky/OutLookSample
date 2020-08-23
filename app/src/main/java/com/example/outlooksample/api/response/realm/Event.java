package com.example.outlooksample.api.response.realm;

import androidx.annotation.NonNull;

import com.example.outlooksample.api.response.calendars.Value;

import java.util.Date;

public class Event {

    public String id;
    public String subject;
    public String name;
    public String address;
    public Date startedAt;


    @NonNull
    @Override
    public String toString() {
        return new StringBuilder()
                .append("id:").append(id).append(", ")
                .append("subject:").append(subject).append(", ")
                .append("name:").append(name).append(", ")
                .append("address:").append(address).append(", ")
                .append("startedAt:").append(startedAt)
                .toString();
    }

    public static Event makeEvent(Value value) {
        Event event = new Event();


        return event;
    }

}
