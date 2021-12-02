package MainClasses;

public abstract class Person {
     protected String name;

     protected abstract void JoinStory();
     protected Person(String name){
         this.name=name;

     };

    public String getName() {
        return name;
    }
}
