package ie.atu;

public class Submarine implements Floatable{        //submarine class must adhere to Floatable contact
    private String name;
    private int year;                               //changed string to int as it is more relevant

    public Submarine(String name, int year) {
        this.name = name;
        this.year = year;
    }
    @Override
    public String printDetails(){                  //Contract from Floatable interface
    return "\nName: " + name + "\nYear: " + year;}
    }