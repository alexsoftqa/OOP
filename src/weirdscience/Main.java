package weirdscience;

import weirdscience.Dog;

public class Main {

    public static void main(String[] args) {

        System.out.println("Dogs count " + Dog.getDogsCount());

        Dog lab = new Dog();

        lab.setName("Charley");
        lab.setBreed("Lab");
        lab.setSize(Size.AVERAGE);
        lab.bite();

        Dog sheppard = new Dog();

        sheppard.setName("Mike");
        sheppard.setBreed("Shepprd");
        sheppard.setSize(Size.LARGE);
        sheppard.bite();

        Dog doberman = new Dog();
        doberman.setName("Rex");
        doberman.setBreed("Doberman");
        doberman.setSize(Size.SMALL);
        doberman.bite();

        Size[] values = Size.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

    }


}
