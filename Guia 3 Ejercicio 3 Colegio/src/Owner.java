public class Owner {
    private String ownersID;
    private String ownersName;
    private String contactNumber;

    public Owner() {
        this("no owner", "no owner name", "no contact number");
    }

    public Owner(String ownersID, String ownersName, String contactNumber) {
        this.ownersID = ownersID;
        this.ownersName = ownersName;
        this.contactNumber = contactNumber;
    }

    public String getOwnersID() {
        return ownersID;
    }

    public void setOwnersID(String ownersID) {
        this.ownersID = ownersID;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}