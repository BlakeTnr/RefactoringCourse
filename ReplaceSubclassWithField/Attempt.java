package ReplaceSubclassWithField;

/**
 * What I did
 * 
 * I deleted the subclass
 * Made the Person not abstract
 * Gave it fields
 * Only allowed fields to be set in the constructor
 * Created getters
 */

class Person {
    private boolean isMale;
    private char code;

    public Person(boolean isMale, char code) {
        this.isMale = isMale;
        this.code = code;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public char getCode() {
        return code;
    }
}

// Client code
Person kent = new Person(true, "M");
System.out.print("Person's gender is: " + kent.getCode());