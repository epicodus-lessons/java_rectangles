public class Rectangle {
  private int mLength;
  private int mWidth;
  private static ArrayList<Task> instances = new ArrayList<Task>();

  public Rectangle(int length, int width) {
    mLength = length;
    mWidth = width;
    instances.add(this);
  }

  public int getLength() {
    return mLength;
  }

  public int getWidth() {
    return mWidth;
  }

  public boolean isSquare() {
    return mLength == mWidth;
  }

  public int area() {
    return mLength * mWidth;
  }

  public static ArrayList<Rectangle> all() {
    return instances;
  }

}
