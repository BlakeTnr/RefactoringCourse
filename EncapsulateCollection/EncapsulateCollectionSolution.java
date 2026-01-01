package EncapsulateCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
What I did

Added
addCourse
removeCourse

getCourses already existed, although it doesn't return an immutable

I didn't update client code at bottom, but it's relatively simple
*/

/*
Solution

I didn't include everything just because this example
is long

The solution includes an initializeCourses
which takes in a set

it returns an unmodifiableSet

But most notably I missed the chance
to abstract out
numberOfAdvancedCourses()
and
numberOfCourses,

I had thought about extracting out numberOfCourses,
but I didn't, it was a better idea to extract it out
*/

class Course {
    public Course(String name, boolean isAdvanced) {
        // ...
    }

    public boolean isAdvanced() {
        // ...
    }
}

class Person {
    private Set courses = new HashSet<>();

    public Set getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    // public void setCourses(Set arg) {
    //     courses = arg;
    // }
}

// Client code
Person kent = new Person();
Set s = new HashSet();
s.add(new Course("Smalltalk Programming"), false);
s.add(new Course("Appreciating Single Malts"), true);
kent.setCourses(s);
Assert.equals(2, kent.getCourses().size());
Course refact = new Course("Refactoring", true);
kent.getCourses().add(refact);
kent.getCourses().add(new Course("Brutal Sarcasm", false));
Assert.equals(4, kent.getCourses().size());
kent.getCourses().remove(refact);
Assert.equals(3, kent.getCourses().size());

Iterator iter = kent.getCourses().iterator();
int count = 0;
while (iter.hasNext()) {
    Course each = (Course) iter.next();
    if(each.isAdvanced()) {
        count++;
    }
}
System.out.print("Advanced courses: " + count);