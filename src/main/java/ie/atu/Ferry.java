package ie.atu;

public class Ferry implements Floatable {            //submarine class must adhere to Floatable contact
    public int capacity;
    public String flag;                             //declared as public for inheritance
    public int length;

    public Ferry(int capacity, String flag, int length) {
        this.capacity = capacity;
        this.flag = flag;
        this.length = length;
    }

    @Override
    public String printDetails() {                  //Contract from Floatable interface
        return "\nFerry: \nFerry capacity: " + capacity + "\ncountry of registration: " + flag + "\nlength: " + length;
    }
    }
