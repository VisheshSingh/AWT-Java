import java.awt.*;
public class awtSample2 {
	awtSample2() {
		Frame f = new Frame();
		Button b = new Button("Hello world");
		b.setBounds(50,100, 80, 30);
		f.add(b);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		awtSample2 awt = new awtSample2();
	}
}
