package InlineClass;

/*
What I did


*/

class Person {
    private String name;
    private String officeAreaCode;
    private String officeNumber;

    public String getName() {
        return name;
    }

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
martin.setAreaCode("781");