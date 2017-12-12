import javax.swing.ImageIcon;

/**
 * The special characteristics of the brick class that is unique to itself
 * @author darionjusuf
 *
 */
public class Brick extends Sprite {

    private boolean destroyed;

    public Brick(int x, int y) {
        super();
        this.x = x;
        this.y = y;

        ImageIcon ii = new ImageIcon("brick.png");
        image = ii.getImage();

        i_width = image.getWidth(null);
        i_heigth = image.getHeight(null);

        destroyed = false;
    }

    public boolean isDestroyed() {
        
        return destroyed;
    }

    public void setDestroyed(boolean val) {
        
        destroyed = val;
    }
}