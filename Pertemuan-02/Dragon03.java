public class Dragon03 {
    int x, y, width, height;

    void moveLeft() {
        if (x < 0) {
            detectCollision();
        }
        else {
            x--;
        }
    }
    void moveRight() {
        if (x > width) {
            detectCollision();
        }
        else {
            x++;
        }
    }
    void moveUp() {
        if (y < 0) {
            detectCollision();
        }
        else {
            y--;
        }
    }
    void moveDown() {
        if (y > height) {
            detectCollision();
        }
        else {
            y++;
        }
    }
    void detectCollision() {
        System.out.println("Game Over");
    }

}
