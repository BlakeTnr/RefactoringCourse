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

class BloodType {
    String stringType;

    public BloodType(String stringType){
        this.stringType = stringType;
    }
}

class  Person {
    public static final BloodType O = new BloodType("O");
    public static final BloodType A = new BloodType("A");
    public static final BloodType B = new BloodType("B");
    public static final BloodType AB = new BloodType("AB");
    
    private BloodType bloodGroup;

    public Person(BloodType bloodType) {
        bloodGroup = bloodType;
    }

    public void setBloodGroup(BloodType bloodType) {
        bloodGroup = bloodType;
    }

    public BloodType getBloodGroup() {
        return bloodGroup;
    }
}

Person parent = new Person(Person.O);
if(parent.getBloodGroup() == Person.AB) {
    // ...
}
child.setBloodGroup(parent.getBloodGroup());