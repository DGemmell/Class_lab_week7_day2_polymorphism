import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void setUp() throws Exception {
        printer = new Printer();
    }

    @Test
    public void canPrint() {
        assertEquals("printing: hello world", printer.print("hello world"));
    }

    @Test
    public void canConnectToNetwork() {
        assertEquals("Ria's Printer is connected", printer.connect("Ria's Printer"));
    }
}
