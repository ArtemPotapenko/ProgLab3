package literature;

import MainClasses.Literature;
import MainClasses.Person;
import PeopDescrip.People;

import static MainClasses.PrintSleep.println;

public abstract class Works extends Person implements Literature{
    Booksizе size;
    React react = React.Default;
    Book book;

    @Override
    protected void JoinStory() {
        println(this.name+" присоединяется к истории");
        this.printed(book);
        System.out.println(this.name+this.size);


    }



    protected Works(String name,Book book) {
        super(name);
        this.book=book;
        this.size= Booksizе.Medium;

    }


    @Override
    public void react_after_reed(People people) {
        println(this.name+this.react+people.getName());
    }


    @Override
    public  void printed(Book book) {
        println(this.name+ " печатается в издании : "+book+".");

    }

    @Override
    public String toString() {
        return "Произведение :" +this.name;
    }

}
