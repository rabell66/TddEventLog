package com.theironyard.installparty;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class EventLogTest {
    private EventLog testEventLog = new EventLog();
    private Event testEvent = new Event();


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Rule
    public ExpectedException expected = ExpectedException.none();

    //*Throw an IllegalArgumentException if the event parameter is null or if either if the two
    // variables of event are null.
    @Test
    public void throwsErrorIfActionNull() {
        System.out.println("Testing--'Throws IllegalArgumentException if Action is null'\n");
        testEvent.name = "Text";
        testEvent.action = null;
        expected.expect(IllegalArgumentException.class);
        assertTrue(testEventLog.addEvent(testEvent));
    }

    @Test
    public void throwsErrorIfNameNull() {
        System.out.println("Testing--'Throws IllegalArgumentException if Name is null'\n");
        testEvent.name = null;
        testEvent.action = "Texting";
        expected.expect(IllegalArgumentException.class);
        assertTrue(testEventLog.addEvent(testEvent));
    }

    @Test
    public void throwsErrorIfBothFieldsNull() {
        System.out.println("Testing--'Throws IllegalArgumentException if Both fields are null'\n");
        testEvent.name = null;
        testEvent.action = null;
        expected.expect(IllegalArgumentException.class);
        assertTrue(testEventLog.addEvent(testEvent));
    }

    @Test
    public void addsToList() {
        System.out.println("Testing--'Adds events to eventList'\n");
        testEvent.name = "Text";
        testEvent.action = "TextMessaging";
        testEventLog.addEvent(testEvent);
        assertTrue(testEventLog.getNumEvents() > 0);
    }

    @Test
    public void addEventMethodTrue() {
        System.out.println("Testing--'Event Method tests True'\n");
        testEvent.name = "Text";
        testEvent.action = "TextMessaging";
        assertTrue(testEventLog.addEvent(testEvent) == true);
    }

    @Test
    public void throwsErrorIfActionNotSpecificValue() {
        System.out.println("Testing--'Throws IllegalArgumentException if Action is not of the required amount'\n");
        testEvent.name = "Text";
        testEvent.action = "Sends Texts";
        expected.expect(IllegalArgumentException.class);
        assertTrue(testEventLog.addEvent(testEvent));
    }
    @Test
    public void specificValuesForAction() {
        System.out.println("Testing--That only specified values can be used\n");
        testEvent.name = "Text";
        testEvent.action = "Face2Face";

    }


}







