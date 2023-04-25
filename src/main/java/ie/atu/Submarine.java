package ie.atu;

public class Submarine implements Floatable{        //submarine class must adhere to Floatable contact
    private String name;
    private String year;

    public Submarine(String name, String year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String printDetails(){                  //Contract from Floatable interface
    return "\nName: " + name + "\nYear: " + year;}

}