package literature;

import PeopDescrip.People;

import static MainClasses.PrintSleep.println;

public class Umoreski extends Works{
    public Umoreski(String name, Book book) {
        super(name,book);
        react=React.Fany;
        size=Booksizе.Mini;
        JoinStory();

    }

    @Override
    public void Vnimanie(People people) {
        println("Привлекает внимания персонажа: "+people.getName());
    }
}
