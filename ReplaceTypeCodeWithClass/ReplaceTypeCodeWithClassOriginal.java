package ReplaceTypeCodeWithClass;

class  Person {
    public static final int O = 0;
    public static final int A = 1;
    public static final int B = 2;
    public static final int AB = 3;
    
    private int bloodGroup;

    public Person(int code) {
        bloodGroup = code;
    }

    public void setBloodGroup(int code) {
        bloodGroup = code;
    }

    public int getBloodGroup() {
        return bloodGroup;
    }
}

Person parent = new Person(Person.O);
if(parent.getBloodGroup() == Person.AB) {
    // ...
}
child.setBloodGroup(parent.getBloodGroup());