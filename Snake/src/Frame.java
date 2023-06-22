import javax.swing.JFrame;

public class Frame extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Frame(){
        this.setTitle("SnakeGame");
        this.add(new Panel());
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
    }
    
}
