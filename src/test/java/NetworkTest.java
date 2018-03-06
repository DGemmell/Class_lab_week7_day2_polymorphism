import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NetworkTest {

    Network network;
    Desktop desktop;
    Printer printer;
    InternetRadio internetRadio;

    @Before
    public void before() {
        network = new Network("CodeClan", 3);
        desktop = new Desktop("Keith's Desktop", "Apple", "Macbook Pro");
        printer = new Printer();
        internetRadio = new InternetRadio("Radio1");
    }

    @Test
    public void canConnectPrinterDeskotpRadio() {
        network.connect(printer);
        network.connect(desktop);
        network.connect(internetRadio);
        assertEquals(3, network.deviceCount());
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", network.getName());
    }

    @Test
    public void deviceListStartsEmpty() {
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectDesktop() {
        network.connect(desktop);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll() {
        network.connect(desktop);
        network.disconnectAll();
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void freeConnectionSlots() {
        network.connect(printer);
        assertEquals(2, network.freeslots());
    }

    @Test
    public void noFreeSlots() {
        network = new Network("CodeClan", 1);
        network.connect(printer);
        network.connect(printer);
        assertEquals(0, network.freeslots());
        assertEquals(1, network.deviceCount());

    }
}
