public class Dog {
    private Owner newOwner = new Owner();
    private String dogName;
    private String dogRace;
    private String dogLocation;
    private String assistanceDay;


    public Dog() {
        this("default name", "no race", "no location",
                "no owner", "no owner name", "no contact number", "no day");
    }

    public Dog(String dogName, String dogRace, String dogLocation, String ownersID,
               String ownersName, String contactNumber, String assistanceDay) {
        this.dogName = dogName;
        this.dogRace = dogRace;
        this.dogLocation = dogLocation;
        newOwner.setOwnersID(ownersID);
        newOwner.setOwnersName(ownersName);
        newOwner.setContactNumber(contactNumber);
        this.assistanceDay = assistanceDay;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogRace() {
        return dogRace;
    }

    public void setDogRace(String dogRace) {
        this.dogRace = dogRace;
    }

    public String getDogLocation() {
        return dogLocation;
    }

    public void setDogLocation(String dogLocation) {
        this.dogLocation = dogLocation;
    }

    public String getOwnersID() {
        return newOwner.getOwnersID();
    }

    public void setOwnersID(String ownersID) {
        newOwner.setOwnersID(ownersID);
    }

    public String getOwnersName() {
        return newOwner.getOwnersName();
    }

    public void setOwnersName(String ownersName) {
        newOwner.setOwnersName(ownersName);
    }

    public String getContactNumber() {
        return newOwner.getContactNumber();
    }

    public void setContactNumber(String contactNumber) {
        newOwner.setContactNumber(contactNumber);
    }

    public String getAssistanceDay() {
        return assistanceDay;
    }

    public void setAssistanceDay(String assistanceDay) {
        this.assistanceDay = assistanceDay;
    }

    @Override
    public String toString() {
        return ("Dog's Name: " + this.dogName + "\n" +
        "Dog's Race: " + this.dogRace + "\n" +
        "Dog's Location: " + this.dogLocation + "\n" +
        "Owner's ID: " + getOwnersID() + "\n" +
        "Owner's Name: " + getOwnersName() + "\n" +
        "Contact Number: " + getContactNumber() + "\n" +
        "Day of Assistance: " + this.assistanceDay);
    }
}