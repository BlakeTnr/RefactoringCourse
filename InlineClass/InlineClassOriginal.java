package InlineClass;

class Person {
    private String name;
    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return officeTelephone.getTelephoneNumber();
    }

    public TelephoneNumber getOfficeTelephone() {
        return officeTelephone;
    }
}

class TelephoneNumber {
    private String officeAreaCode;
    private String officeNumber;

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String arg) {
        officeAreaCode = arg;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String arg) {
        officeNumber = arg;
    }

    public String getTelephoneNumber() {
        return ("(" + getOfficeAreaCode() + ")" + getOfficeNumber());
    }
}

// Somewhere in client code
Person martin = new Person()
martin.getOfficeTelephone().setAreaCode("781");