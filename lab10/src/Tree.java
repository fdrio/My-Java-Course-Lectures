import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Tree {

	private JFrame frame ;
	private DrawPanel drawPanel ;
	private static final int FRAME_WIDTH = 800; //900;
	private static final int FRAME_HEIGHT = 700; //800;
	private static final float TWOPI = 2.0f * (( float ) Math. PI );
	private static final float HALFPI = ( float ) Math. PI /2.0f;
	// The (x,y) center point in the frame... just in case is needed
	private static final int cx = FRAME_WIDTH /2;
	private static final int cy = ( int ) ( FRAME_HEIGHT *4.0f/5.0f);
	
	public Tree() {
		frame = new JFrame( "The RollingBallsGame" );
		frame .setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE );
		drawPanel = new DrawPanel();
		frame .add( drawPanel );
		frame .setVisible( true );
		frame .setResizable( false );
		frame .setSize( FRAME_WIDTH , FRAME_HEIGHT );
		frame .setLocation(0, 0);
	}
	
	class DrawPanel extends JComponent {
		public void paintComponent(Graphics g ) {
			Graphics2D g1 = (Graphics2D) g;
			drawTree( g1 );
		}
		
		private void drawTree(Graphics2D g ) {
			RecursiveTree t = new RecursiveTree( cx , cy , 400, HALFPI , g , cy );
			t .draw();
		}
	}
} // end of class Tree