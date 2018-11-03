package ProjectADV;

import com.sun.javafx.css.Size;
import com.sun.javafx.scene.control.skin.FXVK.Type;

public class Ship {
    private int count;
    private Size size;
    private Type type;

    public Ship(Size size, Type type) {
        this.size = size;
        this.type = type;
    }

    public void add(int count) {
        this.count += count;
    }

    public boolean countCheck() {
        if (count >= size.getValue()) {
            return false;
        }
        return true;
    }

    public int getCount() {
        return count;
    }

    @SuppressWarnings("restriction")
	public Type getType() {
        return type;
    }
    @SuppressWarnings("restriction")
    public Size getSize() {
        return size;
    }
}