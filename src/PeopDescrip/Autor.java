package PeopDescrip;

import MainClasses.Person;
import MainClasses.PrintSleep;

public class Autor extends People {
    @Override
    public void JoinStory(){
        PrintSleep.println("Автор начинает повестование.");
    }
    public Autor(String name) {
        super(name);
        JoinStory();
    }


}
