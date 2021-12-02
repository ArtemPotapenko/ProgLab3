package literature;

import PeopDescrip.People;

import static MainClasses.PrintSleep.println;

public class Anekdotsy extends Works{

    public Anekdotsy(String name, Book book) {
        super(name,book);
        react=React.Fany;
        size=Booksizе.Mini;
        JoinStory();
    }

    @Override
    public void Vnimanie(People people) {
        println("Не привлекает внимания персонажа: "+people.getName());
    }
}
