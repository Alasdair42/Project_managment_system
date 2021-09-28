// Class architect
public class architect {
    // attributes
    String name;
    int telephoneNum;
    String emailAddress;
    String postAddress;
    //  Constructor method
    public architect( String name, int telephoneNum, String emailAddress, String postAddress){
        this.name = name;
        this.telephoneNum = telephoneNum;
        this.emailAddress = emailAddress;
        this.postAddress = postAddress;
    }
    // toString
    public String toString(){
     String output = " ";
     output += " \nName : " + name;
     output += " \nTelephone Number : " + telephoneNum;
     output += " \nEmail Address : " + emailAddress;
     output += " \nPostal Address : " + postAddress;
     return output;
    }
}
