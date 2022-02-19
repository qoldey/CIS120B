import java.awt.Rectangle;
import java.awt.Point;

public class RectCenter {
   public static void main(String[] args) {
      Rectangle rect = new Rectangle(20, 40, 100, 50);
      Point center = findCenter(rect);
      System.out.println("The center of rect is " + center);
      System.out.println("The center of modified rect is " + findCenter(concentricRectangle(rect, 1)));
   }

   public static Point findCenter(Rectangle box) {
      int x = box.x + box.width / 2;
      int y = box.y + box.height / 2;
      return new Point(x, y);
   }

   // returns rectangle obj with same center as input rectangle
   // and overall dimensions increased by input num
   private static Rectangle concentricRectangle(Rectangle rec, int num) {
      rec.height += num;
      rec.width += num;
      return rec;
   }
}