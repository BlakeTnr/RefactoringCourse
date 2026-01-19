package ReplaceSubclassWithField;

/**
 * What the solution did differently
 * 
 * It created a factory method for creating male
 * and female. This was actaully a really good idea
 * because it allows for creation of strict types WITHOUT
 * subclasses
 */

class Person {
    private boolean isMale;
    private char code;

    private Person(boolean isMale, char code) {
        this.isMale = isMale;
        this.code = code;
    }

    boolean isMale() {
        return isMale;
    }

    char getCode() {
        return code;
    }

    static Person createMale() {
        return new Person(true, 'M');
    }

    static Person createFemale() {
        return new Person(false, 'F');
    }
}

// Client code
Person kent = new Person.createMale();
System.out.print("Person's gender is: " + kent.getCode());