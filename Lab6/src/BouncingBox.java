import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

public class BouncingBox extends JComponent {

	private ArrayList<BouncingFigure> figures = new ArrayList<BouncingFigure>();

	public void add(BouncingFigure f) {
		figures.add(f);
	}

	public void paintComponent(Graphics g) {
		// This approach considers angles that hit on both ways 
		for (BouncingFigure f : figures) {
			f.draw(g); f.move();
			if (f.rightBorderCollision(this.getParent().getWidth()) == true) {
				if (f.getTrajectory() < 90) {
					f.setTrajectory(180 - f.getTrajectory());
				}
				else {
					f.setTrajectory((360-f.getTrajectory())+180);
				}

			}
			if (f.leftBorderCollision() == true) {
				if (f.getTrajectory() < 180) {
					f.setTrajectory(180-f.getTrajectory());
				}
				else {
					f.setTrajectory(360-((f.getTrajectory()-180)));
				}

			}
			if (f.upperBorderCollision() == true) {
				if (f.getTrajectory() < 90) {
					f.setTrajectory((90-f.getTrajectory())+270);
				}
				else {
					f.setTrajectory(270-(f.getTrajectory()-90));
				}

			}
			if (f.lowerBorderCollision(this.getParent().getHeight()) == true) {
				if (f.getTrajectory() < 270) {
					f.setTrajectory((270-f.getTrajectory())+90);
				}
				else {
					f.setTrajectory(90-(f.getTrajectory()-270));
				}

			}
		}
	}
}
