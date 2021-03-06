package tools.draw;

import java.awt.Point;
import java.awt.geom.Rectangle2D;

public class Selection extends DrawShape {

  private static final long serialVersionUID = 1L;

  private final Rectangle2D rectangle;

  public Selection() {
    super(new Rectangle2D.Double());
    rectangle = (Rectangle2D) shape;
  }

  @Override
  public void setStartPoint(Point startPoint) {
    this.startPoint = startPoint;
  }

  @Override
  public void setCurrentPoint(Point currentPoint) {
    rectangle.setFrameFromDiagonal(startPoint.x, startPoint.y, currentPoint.x, currentPoint.y);
  }
}
