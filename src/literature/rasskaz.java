package literature;

import PeopDescrip.People;

import static MainClasses.PrintSleep.println;

public class rasskaz extends Works {

    public rasskaz(String name,Book book) {
        super(name,book);
        JoinStory();
    }

    @Override
    public void Vnimanie(People people) {
        println("Не привлекает внимания персонажа: "+people.getName());
    }
}
