//Glazyrin
package HomeWork_1;

public class Road extends Barrier {
    private int length;

    public Road(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Дорога " + " км: " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("Успешный забег");

            return true;
        } else {
            System.out.println("Неудачный забег");

            return false;
        }
    }
}
