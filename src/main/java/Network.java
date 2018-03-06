import java.util.*;

public class Network {
    private String name;
//    instead of Desktop or Printer we use IConnect to add in the ArrayList
    private ArrayList<IConnect> devices;
//    private ArrayList<Desktop> devices;
//    private ArrayList<Printer> printers;
    private int capacity;


    public Network(String name, int capacity){
        this.devices = new ArrayList<IConnect>();
//        this.devices = new ArrayList<Desktop>();
//        this.printers = new ArrayList<Printer>();
        this.name = name;
        this.capacity = capacity;
    }

    public String getName(){
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int deviceCount(){
        return devices.size();
//        return devices.size() + printers.size();
    }

    public void connect(IConnect device){
        if (freeslots() > 0) {
            devices.add(device);
        }
    }

//    public void connect(Desktop desktop){
//        devices.add(desktop);
//    }

//    public void connect(Printer printer){
//        printers.add(printer);
//    }

    public void disconnectAll(){
        devices.clear();
//        printers.clear();
    }

    public int freeslots() {
        return capacity - deviceCount();
    }
}