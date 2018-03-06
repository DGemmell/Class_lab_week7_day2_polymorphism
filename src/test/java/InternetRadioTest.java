import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InternetRadioTest {

 InternetRadio internetRadio;


    @Before
    public void setUp() throws Exception {
        internetRadio = new InternetRadio("Radio1");
    }

    @Test
    public void canConnectToNetwork() {
        assertEquals("Connected to network: codeclan", internetRadio.connect("codeclan"));
    }

    @Test
    public void tuneToStation() {
        assertEquals("Radio1", internetRadio.getStation());
    }
}
