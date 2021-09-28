// Class architect
public class customer {
    // attributes
    String nameCus;
    int telephoneNumCus;
    String emailAddressCus;
    String postAddressCus;
    //  Constructor method
    public customer( String nameCus, int telephoneNumCus, String emailAddressCus, String postAddressCus){
        this.nameCus = nameCus;
        this.telephoneNumCus = telephoneNumCus;
        this.emailAddressCus = emailAddressCus;
        this.postAddressCus = postAddressCus;
    }
    // toString
    public String toString(){
        String output = " ";
        output += " \nName : " + nameCus;
        output += " \nTelephone Number : " + telephoneNumCus;
        output += " \nEmail Address : " + emailAddressCus;
        output += " \nPostal Address : " + postAddressCus;
        return output;
    }
}
