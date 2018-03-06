public class InternetRadio implements IConnect {

    private String station;

    public InternetRadio(String station) {
        this.station = station;
    }

    public String getStation() {
        return station;
    }

    @Override
    public String connect(String data) {
        return "Connected to network: " + data;
    }




}
