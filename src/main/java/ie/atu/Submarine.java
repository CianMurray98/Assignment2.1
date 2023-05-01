package ie.atu;

public class Submarine implements Floatable{        //submarine class must adhere to Floatable contact
    private String name;                            //define fields
    private String year;

    public Submarine(String name, String year) {
        this.name = name;                           //initialises fields
        this.year = year;
    }
    @Override
    public String printDetails(){                  //Contract from Floatable interface
    return "\nSubmarine: \nName: " + name + "\nYear: " + year;}
    }