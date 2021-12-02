package literature;


import MainClasses.Person;



import java.util.Objects;

import static MainClasses.PrintSleep.println;

public  class Book extends Person{



    public Book(String name) {
        super(name);
        JoinStory();
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

    @Override
    protected void JoinStory() {
        println(this.name+" присоединяется к истории");
    }



}
