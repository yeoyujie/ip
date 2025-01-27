package duke;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UiTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    @Test
    void numberOfTasks_empty() {
        Ui ui = new Ui();
        String output = ui.printNumberOfTasks(0);
        assertEquals("Now you have 0 task in your list.", output);
    }
}
