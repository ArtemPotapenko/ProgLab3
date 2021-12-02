package PeopDescrip;
import MainClasses.Animated;
import MainClasses.DefQual;
import MainClasses.Person;

import java.util.Objects;

import static MainClasses.PrintSleep.*;

public class People extends MainClasses.Person implements Animated {
    Face face;
    String role_story;
    String body;
    People(String name){
        super(name);
        role_story=DefQual.Default_female;
        body = DefQual.Default_neuter;
        face=DefQual.Default_Face;
    }
      @Override
    public String toString() {
        return "имя: \n"+name+"\n"+this.face+"Внешzний вид:\n"+this.body+"\n"+"Роль: \n"+this.role_story;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(face, people.face) && Objects.equals(name, people.name) && Objects.equals(role_story, people.role_story) && Objects.equals(body, people.body);
    }

    public void JoinStory(){
        println("Человек со следующими характеристиками присоединяется к истории\n"+this);
    };

    @Override
    public int hashCode() {
        return Objects.hash(face, name, role_story, body);}

    @Override
    public void sit() {
        print(this.name+" cидит ");

    }

    @Override
    public void go() {
        print(this.name+" идет ");

    }

    @Override
    public void look_on(Person person) {
        println(this.name+" смотрит на "+person.getName());

    }
    public void say_on(Person person){
        println(this.name+" рассказывает о персонаже: "+person.getName());

    };

}
