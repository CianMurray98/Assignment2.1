package ie.atu;

public class Trawler extends Ferry{                         //trawler class inherits ferry variables and methods
    private String IDcode;
    private int cargo;

    public Trawler(String IDcode, int cargo, int capacity, String flag, int length){
        super(capacity, flag, length);
        this.IDcode = IDcode;
        this.cargo = cargo;
    }

    @Override
    public String printDetails() {              //contract from Floatable interface
        return super.printDetails();}
    }
