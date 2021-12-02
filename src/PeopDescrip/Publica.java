package PeopDescrip;

import static MainClasses.PrintSleep.println;

public class Publica extends People{
    @Override
    public void JoinStory(){
        println(this.name+" присоеденяется к итории.");
    }

    public Publica(String name) {
        super(name);
        JoinStory();
    }
}
