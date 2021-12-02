package Table;

import MainClasses.Person;

import static MainClasses.PrintSleep.println;

public class Table extends Person {

    public Table(String name) {
        super(name);
        JoinStory();
    }

    @Override
    protected void JoinStory() {
        println(this.name+" входит в историю");
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
