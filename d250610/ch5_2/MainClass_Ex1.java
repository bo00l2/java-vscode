package d250610.ch5_2;

public class MainClass_Ex1 {
    public static void main(String[] args) {
        Dog_Ex1 dog_Ex1 = new Dog_Ex1();

        Cat_Ex1 cat_Ex1 = new Cat_Ex1();

        Animal_Ex1 ani = new Dog_Ex1();
        Animal_Ex1 ani2 = new Cat_Ex1();
        Animal_Ex1 ani3 = new Fish_Ex1();

        Animal_Ex1[] animal = { ani, ani2, ani3 };

        for (Animal_Ex1 animal_Ex1 : animal) {
            if (animal_Ex1 instanceof Dog_Ex1) {
                Dog_Ex1 dog = (Dog_Ex1) animal_Ex1;
                dog.sound();
            } else if (animal_Ex1 instanceof Cat_Ex1) {
                Cat_Ex1 cat = (Cat_Ex1) animal_Ex1;
                cat.sound();
                cat.eat();
                cat.move();
                cat.out();
            }

        }
    }
}
