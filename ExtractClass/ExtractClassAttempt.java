package ExtractClass;

/*
What I did

Extracted out the office because there were 2 fields
that shared similar responsabilities

But now, Office is just a data class, which is not great

well, I moved getTelephoneNumber to office b.c. it uses
fields of office more therefore should be there, then
just made Person a proxy
*/

/*
Solution did pretty much the same thing, just called "office" TelephoneNumber instead

Me moving the method "getTelephoneNumber" actually
suggest I should have renamed Office to telephone number
*/

class Person {
    private String name;
    private Office office; // needs getters and setters obviously

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return office.getTelephoneNumber();
    }
}

class Office {
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