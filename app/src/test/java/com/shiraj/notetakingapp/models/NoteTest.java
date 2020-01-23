package com.shiraj.notetakingapp.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NoteTest {

    private static final String TIMESTAMP_1 = "05-2019";
    private static final String TIMESTAMP_2 = "04-2019";

    /*
       Compare two equal notes
    */

    @Test
    void isNotesEqual_identicalProperties_returnTrue() throws Exception {

        //Arrange
        Note note1 = new Note("Note #1", "This is note #1",TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note #1", "This is note #1",TIMESTAMP_1);
        note2.setId(1);

        //Act


        //Assert
        assertEquals(note1, note2);
        System.out.println("The notes are equal!!!");
    }
    /*
       Compare notes with 2 different ids
    */

    @Test
    void isNotesEqual_identicalProperties_returnFalse() throws Exception {
        //Arrange
        Note note1 = new Note("Note #1", "This is note #1",TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note #1", "This is note #1",TIMESTAMP_1);
        note2.setId(2);

        //Act

        //Assert
        assertNotEquals(note1, note2);
        System.out.println("The Notes are not equals!!!");
    }
    /*
       Compare two notes with different timeStamps
    */

    @Test
    void isNotesEqual_differentTimeStamps_returnTrue() throws Exception {
        //Arrange
        Note note1 = new Note("Note #1", "This is note #1",TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note #1", "This is note #1",TIMESTAMP_2);
        note2.setId(1);
        //Act

        //Assert
        assertNotEquals(note1, note2);
        System.out.println("This Notes have different timeStamps");
    }

    /*
       Compare two notes with different titles
    */

    @Test
    void isNotesEqual_differentTitle_returnFalse() throws Exception {
        //Arrange
        Note note1 = new Note("Note #1", "This is note #1",TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note #2", "This is note #1",TIMESTAMP_2);
        note2.setId(1);

        //Act

        //Assert
        assertNotEquals(note1, note2);
        System.out.println("The Notes are not equal! They have different Title!!!");
    }

    /*
       Compare two notes with different Content
    */
    @Test
    void isNotesEqual_differentContent_returnFalse() throws Exception {
        //Arrange
        Note note1 = new Note("Note #1", "This is note #1",TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note #2", "This is note #2",TIMESTAMP_2);
        note2.setId(1);

        //Act

        //Assert
        assertNotEquals(note1, note2);
        System.out.println("The Notes are not equal! They have different Content!!!");
    }
}
