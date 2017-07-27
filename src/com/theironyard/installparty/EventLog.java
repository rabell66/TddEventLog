package com.theironyard.installparty;

import java.util.ArrayList;
import java.util.List;

public class EventLog {

    public static void main(String[] args) {

    }



    private List<Event> eventList = new ArrayList<>();

    public boolean addEvent(Event event) {

        if (event.name == null || event.action == null) {
            throw new IllegalArgumentException();
        }
            String action = (event.action.toString());
            if(action == "Face2Face" || action == "PhoneCall" || action == "TextMessaging" || action =="Unknown") {
                System.out.printf("\t The Name is %s  and the Activity is %s\n", event.name.toString(), event.action.toString());
                eventList.add(event);
                return true;
               }
                else{




                throw new IllegalArgumentException();

            }


    }
    public int getNumEvents () {
        return eventList.size();
    }
        }



