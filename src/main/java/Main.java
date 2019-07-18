package lesson1;

import sun.plugin2.message.MarkTaintedMessage;

public class Main {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Mark");
    info1.showInfo();
    info2.showInfo();
        }
    public static void oututInfo(Info info){
    info.showInfo();
    }

}

