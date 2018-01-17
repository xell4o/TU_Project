import javax.swing.JFrame;

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;

public class Main {

	public static void main(String[] args) {

		GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities capabilities = new GLCapabilities(profile);

		// The canvas
		GLCanvas glcanvas = new GLCanvas(capabilities);
		Cube cube = new Cube();

		glcanvas.addGLEventListener(cube);
		glcanvas.setSize(600, 600);

		JFrame frame = new JFrame("Cube");

		frame.getContentPane().add(glcanvas);
		frame.setSize(frame.getContentPane().getPreferredSize());
		frame.setVisible(true);

		FPSAnimator animator = new FPSAnimator(glcanvas, 20, true);
		animator.start();
	}
}
