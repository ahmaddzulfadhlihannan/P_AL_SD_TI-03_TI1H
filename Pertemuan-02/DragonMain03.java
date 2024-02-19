public class DragonMain03 {
    public static void main(String[] args) {
        Dragon03 dg = new Dragon03();
        dg.x = 0;
        dg.y = 2;
        dg.width = 1;
        dg.height = 1;

        dg.moveRight();
        dg.moveLeft();
        dg.moveUp();
        dg.moveDown();
    }
}
