
public class Address {

    private String street;
    private int number;
    private String zipCode;


    public Address(String street, int number, String zipCode) {
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
    }


    public String getStreet(){
        return this.street;
    }

    public int getNumber(){
        return this.number;
    }

    public String getZipCode(){
        return this.zipCode;
    }

    @Override
    public String toString() {
        
        return "\tStreet: "+getStreet()+"\n"+
               "\tNumber: "+getNumber()+"\n"+
               "\tZipCode: "+getZipCode()+"\n";
    }

}
