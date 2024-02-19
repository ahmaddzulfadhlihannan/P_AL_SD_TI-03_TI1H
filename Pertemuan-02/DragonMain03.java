public class DragonMain03 {
    public static void main(String[] args) {
        Dragon03 dg = new Dragon03(0, 0, 2, 3);

        dg.moveRight();
        dg.moveLeft();
        dg.moveUp();
        dg.moveDown();
        dg.printPosition();
    }
}
