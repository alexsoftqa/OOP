package weirdscience;

public class Dog {  // Class =========================================================

    private static int dogsCount;

    public static final int PAWS = 4;
    public static final int TAIL = 1;

    private String name;
    private String breed;
    private Size size = Size.UNDEFINED;

    public Dog() {
        dogsCount++;
        System.out.println("Dogs count " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPaws() {
        return PAWS;
    }

    public int getTail() {
        return TAIL;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        switch (size) {
            case LARGE:
            case EXTRA_LARGE:
                System.out.println("Wof - Wof !!!");
                break;
            case AVERAGE:
                System.out.println("Raf - Raf !!!");
                break;
            case SMALL:
            case EXTRA_SMALL:
                System.out.println("Aff - Aff !!!");
                break;
            default:
                System.out.println("Dog's size UNDEFINED");
        }
    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dogs biting you");
        } else {
            bark();
        }
    }
}   // Class =========================================================
