package ie.atu;

public class Ferry implements Floatable{            //submarine class must adhere to Floatable contact
    private int capacity;
    private String flag;
    private int length;

    public Ferry(int capacity, String flag, int length) {
        this.capacity = capacity;
        this.flag = flag;
        this.length = length;
    }
    @Override
    public String printDetails() {                  //Contract from Floatable interface
        return "\nCapacity: " + capacity + "\nFlag: " + flag + "\nLength: " + length;}
    }
