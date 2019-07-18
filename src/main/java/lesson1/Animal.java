package lesson1;

public class Animal implements Info {
    public Animal(int id){
        this.id = id;
    }
        public int id;

        public void sleeping(){
            System.out.println("I'm sleeping");
        }
    public void showInfo(){
        System.out.println("ID is " +this.id);
    }
}
