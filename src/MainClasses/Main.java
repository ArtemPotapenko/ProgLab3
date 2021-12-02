package MainClasses;

import PeopDescrip.*;
import Table.Table;
import literature.*;

import static MainClasses.PrintSleep.print;

public class Main {
    private static void addWorks(Works book, People p1,People p2){
        p1.say_on(book);
        book.Vnimanie(p2);
        book.react_after_reed(p2);
    }
    public static void main(String[] args) {
        Autor autor = new Autor("Автор");
        Publica publica=new Publica("Публика");
        Book Gazeta = new Book("Газета");
        rasskaz hud_rass = new rasskaz("Художественный рассказ",Gazeta);
        addWorks(hud_rass,autor,publica);
        Reklama reklama = new Reklama("Реклама",Gazeta);
        addWorks(reklama,autor,publica);
        Umoreski umoreski= new Umoreski("Юморески",Gazeta);
        addWorks(umoreski,autor,publica);
        Anekdotsy anekdot=new Anekdotsy("Анекдоцы",Gazeta);
        addWorks(anekdot,autor,publica);
        GospodinKrabs Krabs = new GospodinKrabs("Крабс");
        autor.say_on(Krabs);
        Krabs.go();
        Table table = new Table("Стол, заваленный разными рукописями");
        autor.say_on(table);
        Grizli grizli = new Grizli("Гризли");
        grizli.sit_on(table);
        Krabs.look_on(grizli);



    }




}
