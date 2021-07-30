package b07_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.animal;

import b07_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.fruits.Fruit;


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
    }
}
