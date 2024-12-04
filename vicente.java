import java.awt.Color;
import sas.*;

public class Baum
{
    Rectangle stamm;
    Polygon blatter;
    public Baum(int posX, int posY, int width, int height, int widthB, int heightB)
    {
        
        Color brown = new Color(150, 75, 0);
        stamm = new Rectangle(posX, posY, width, height);
        stamm.setColor(brown);
        blatter = new Polygon((posX + width / 2 - widthB / 2), posY);
        blatter.add(widthB / 3, heightB / -3);
        blatter.add(0, heightB / -3);
        blatter.add(widthB / 3, 2*(heightB / -3));
        blatter.add(0, 2*heightB / -3);
        blatter.add(widthB / 2, -heightB);
        blatter.add(widthB, 2*heightB / -3);
        blatter.add(2*(widthB / 3), 2*heightB / -3);
        blatter.add(widthB, heightB / -3);
        blatter.add(2*widthB / 3, heightB / -3);
        blatter.add(widthB, 0);
        blatter.setColor(Color.GREEN);
    }
}
