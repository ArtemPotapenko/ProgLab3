package PeopDescrip;


import MainClasses.Person;
import MainClasses.PrintSleep;
import Table.Table;

import static MainClasses.PrintSleep.print;

public final class Grizli extends People{
    @Override
    public void JoinStory() {
        super.JoinStory();
    }


    public Grizli(String name){
        super(name);
        this.face = new Grizli_Face();
        this.body = "Напоминает старую крысу";
        this.role_story="Редактор";
        JoinStory();
    }
    public void sit_on(Table table){
        sit();
        print("за следующим столом: "+table);
        System.out.println();
    }
}
