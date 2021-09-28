// Class architect
public class contractor {
    // attributes
    String nameCon;
    int telephoneNumCon;
    String emailAddressCon;
    String postAddressCon;
    //  Constructor method
    public contractor( String nameCon, int telephoneNumCon, String emailAddressCon, String postAddressCon){
        this.nameCon = nameCon;
        this.telephoneNumCon = telephoneNumCon;
        this.emailAddressCon = emailAddressCon;
        this.postAddressCon = postAddressCon;
    }
    // toString
    public String toString(){
        String output = " ";
        output += " \nName : " + nameCon;
        output += " \nTelephone Number : " + telephoneNumCon;
        output += " \nEmail Address : " + emailAddressCon;
        output += " \nPostal Address : " + postAddressCon;
        return output;
    }
}
