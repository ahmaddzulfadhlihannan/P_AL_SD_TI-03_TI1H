public class Dragon03 {
    int x;
    int y;
    int width;
    int height;

    Dragon03(int startX, int startY, int gameWidth, int gameHeight) {
        x = startX;
        y = startY;
        width = gameWidth;
        height = gameHeight;
    }

    void moveLeft() {
        x--;
        if (x < 0) {
            detectCollision();
        }
    }

    void moveRight() {
        x++;
        if (x >= width) {
            detectCollision();
        }
    }

    void moveUp() {
        y--;
        if (y < 0) {
            detectCollision();
        }
    }

    void moveDown() {
        y++;
        if (y >= height) {
            detectCollision();
        }
    }

    void printPosition() {
        System.out.println("Posisi Dragon: (" + x + ", " + y + ")");
    }

    void detectCollision() {
        System.out.println("Game Over");
    }
}
