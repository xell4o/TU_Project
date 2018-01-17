import javax.swing.JFrame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;

public class Cube implements GLEventListener {

	private GLU glu = new GLU();
	private float rtri = 0.0f;

	@Override
	public void display(GLAutoDrawable drawable) {
		final GL2 gl = drawable.getGL().getGL2();

		// Clear The Screen And The Depth Buffer
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
		gl.glLoadIdentity(); // Reset The View
		gl.glTranslatef(-0.5f, 0.0f, -6.0f); // Move the cube
		gl.glRotatef(rtri, 0.5f, 1.0f, 0.0f);

		// drawing edge1.....
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(-0.75f, 0f, 0);
		gl.glVertex3f(0f, -0.75f, 0);
		gl.glEnd();

		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(-0.75f, 0f, 1f); 
		gl.glVertex3f(0f, -0.75f, 1f);
		gl.glEnd();

		// top
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(-0.75f, 0f, 0);
		gl.glVertex3f(-0.75f, 0f, 1f);
		gl.glEnd();

		// bottom
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(0f, -0.75f, 0);
		gl.glVertex3f(0f, -0.75f, 1f);
		gl.glEnd();

		// edge 2....
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(0f, -0.75f, 0);
		gl.glVertex3f(0.75f, 0f, 0);
		gl.glEnd();

		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(0f, -0.75f, 1f);
		gl.glVertex3f(0.75f, 0f, 1f);
		gl.glEnd();

		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(0f, -0.75f, 0);
		gl.glVertex3f(0f, -0.75f, 1f);
		gl.glEnd();

		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(0.75f, 0f, 0);
		gl.glVertex3f(0.75f, 0f, 1f);
		gl.glEnd();

		// Edge 3.............
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(0.0f, 0.75f, 0);
		gl.glVertex3f(-0.75f, 0f, 0);
		gl.glEnd();

		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(0.0f, 0.75f, 1f);
		gl.glVertex3f(-0.75f, 0f, 1f);
		gl.glEnd();

		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(0.0f, 0.75f, 0);
		gl.glVertex3f(0.0f, 0.75f, 1f);
		gl.glEnd();

		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(-0.75f, 0f, 0);
		gl.glVertex3f(-0.75f, 0f, 1f);
		gl.glEnd();

		// final edge
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(0.75f, 0f, 0);
		gl.glVertex3f(0.0f, 0.75f, 0);
		gl.glEnd();

		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(0.75f, 0f, 1f);
		gl.glVertex3f(0.0f, 0.75f, 1f);
		gl.glEnd();

		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(0.75f, 0f, 0);
		gl.glVertex3f(0.75f, 0f, 1f);
		gl.glEnd();

		gl.glBegin(GL2.GL_LINES);
		gl.glVertex3f(0.0f, 0.75f, 0);
		gl.glVertex3f(0.0f, 0.75f, 1f);

		gl.glEnd();
		gl.glFlush();
		rtri += 0.6f;
	}

	@Override
	public void dispose(GLAutoDrawable drawable) {
		// method body
	}

	@Override
	public void init(GLAutoDrawable drawable) {
		// method body
	}

	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		GL2 gl = drawable.getGL().getGL2();

		float h = (float) width / (float) height;
		gl.glViewport(0, 0, width, height);
		gl.glMatrixMode(GL2.GL_PROJECTION);
		gl.glLoadIdentity();

		glu.gluPerspective(46.0f, h, 1.0, 20.0);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		gl.glLoadIdentity();

	}
}