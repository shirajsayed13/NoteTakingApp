package com.shiraj.notetakingapp.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class DateUtilTest {
    private static final String today = "01-2020";

    @Test
    public void testGetCurrentTimestamp_returnedTimestamp() {
        assertDoesNotThrow(new Executable() {
            @Override
            public void execute() throws Throwable {
                assertEquals(today, DateUtil.getCurrentTimeStamp());
                System.out.println("Timestamp is generated correctly");
            }
        });
    }
}
