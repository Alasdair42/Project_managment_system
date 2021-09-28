// Class project
public class project {
    // attributes
    int projectNum;
    String projectName;
    String buildingType;
    String projectAddress;
    int erfNum;
    int totalFee;
    int paidToDate;
    int dueDate;
    String architect;
    String contractor;
    String customer;
    //  Constructor method
    public project(int projectNum, String projectName, String buildingType, String projectAddress, int erfNum, int totalFee, int paidToDate, int dueDate, String architect, String contractor, String customer){
        this.projectNum = projectNum;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.projectAddress = projectAddress;
        this.erfNum = erfNum;
        this.totalFee = totalFee;
        this.paidToDate = paidToDate;
        this.dueDate = dueDate;
        this.architect = architect;
        this.contractor = contractor;
        this.customer = customer;
    }
    // toString
    public String toString(){
        String output = " ";
        output += " \nProject Number : " + projectNum;
        output += " \nProject Name : " + projectName;
        output += " \nBuilding Type : " + buildingType;
        output += " \nProject Address : " + projectAddress;
        output += " \nERF Number : " + erfNum;
        output += " \nTotal Fee : " + totalFee;
        output += " \nPaid to Date : " + paidToDate;
        output += " \nDue Date : " + dueDate;
        output += " \nArchitect : " + architect;
        output += " \nContractor : " + contractor;
        output += " \nCustomer : " + customer;
        return output;
    }
}
