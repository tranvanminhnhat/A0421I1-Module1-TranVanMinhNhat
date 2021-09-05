package l07_abstract_class_and_interface.practice.lop_animal_va_interface_edible.animal;

import l07_abstract_class_and_interface.practice.lop_animal_va_interface_edible.edible.Edible;
import l07_abstract_class_and_interface.practice.lop_animal_va_interface_edible.fruits.Apple;
import l07_abstract_class_and_interface.practice.lop_animal_va_interface_edible.fruits.Fruit;
import l07_abstract_class_and_interface.practice.lop_animal_va_interface_edible.fruits.Orange;


public class AstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal : animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edibler = (Chicken)animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
