import java.awt.Color;
import java.awt.Graphics2D;

public class RecursiveTree {
	private static final double PI = Math.PI;
	private double d , theta;
	private Graphics2D g;
	private int basex , basey , yMax;
	
	public RecursiveTree( int basex , int basey , int d , double theta , Graphics2D g , int middle ) {
		this . d = d;
		this . theta = theta;
		this . g = g;
		this . basex = basex;
		this . basey = basey;
		this . yMax = 2* middle;
	}
	
	public void draw() {
		recDraw( basex , basey , d , theta );
	}
	
	private void recDraw( int x , int y , double d , double theta ) {
		int xx = ( int ) ( x + d *Math.cos( theta )), xy = ( int ) ( y + d *Math.sin( theta ));
		if(d>2) g.setColor(Color.BLACK);
		else if (d<0.5) g.setColor(Color.red);
		else g.setColor(Color.GREEN);
		if ( d >= 1) {
			g .drawLine( x , yMax-y, xx , yMax-xy);
			recDraw(( int ) ( x + d /2.0*Math.cos( theta )), ( int ) ( y + d /2.0*Math.sin( theta )), d /2.0, theta + PI /4.0);
//			recDraw(( int ) ( x + d /4.0*Math.cos( theta )), ( int ) ( y + d /4.0*Math.sin( theta )), d /2.0, theta -PI/4.0);
//			recDraw(( int ) ( x + d *Math.cos( theta )), ( int ) ( y + d *Math.sin( theta )), d /10.0, theta + PI /4.0);
//			recDraw(( int ) ( x + d *Math.cos( theta )), ( int ) ( y + d *Math.sin( theta )), d /10.0, theta -PI/4.0);
//			recDraw(( int ) ( x + d *3/4.0*Math.cos( theta )), ( int ) ( y + d *3/4.0*Math.sin( theta )), d /3.0, theta -PI/4.0);
//			recDraw(( int ) ( x + d *3/4.0*Math.cos( theta )), ( int ) ( y + d *3/4.0*Math.sin( theta )), d /3.0, theta + PI /4.0);
//			recDraw(( int ) ( x + d /3.0*Math.cos( theta )), ( int ) ( y + d /3.0*Math.sin( theta )), d /5.0, theta + PI /5.0);
		}
	}
} // end of class RecursiveTree