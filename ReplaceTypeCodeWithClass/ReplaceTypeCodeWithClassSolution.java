package ReplaceTypeCodeWithClass;

/*
What I did

This feels like such a crappy fix for type codes

I really wanted to use subclasses

I created a instance of BloodType for each type and let the client
code access those

This doesn't really provide any benefit to be honest, except
maybe a little abstraction
*/

/*
What soltuion did

made a private class with self instantiated instances of the code

this is still relatively crappy compared to subclasses

this seems essentially just like an enum
*/

class BloodGroup {
    private final int code;

    private BloodGroup(int code){
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static BloodGroup O() {
        return new BloodGroup(0);
    }

    public static BloodGroup A() {
        return new BloodGroup(1);
    }

    public static BloodGroup B() {
        return new BloodGroup(2);
    }

    public static BloodGroup AB() {
        return new BloodGroup(3);
    }
}

class  Person {
    private BloodGroup bloodGroup;

    public Person(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }
}

Person parent = new Person(BloodGroup.O());
if(parent.getBloodGroup() == BloodGroup.AB()) {
    // ...
}
child.setBloodGroup(parent.getBloodGroup());