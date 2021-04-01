import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    private int ball1Speed = 0;
    private int ball2Speed = 0;
    private int ball3Speed = 0;
    private int ball4Speed = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }



    @Override
    public void draw() {
        ellipse(ball1Speed ,HEIGHT/5, DIAMETER,DIAMETER);
        ball1Speed++;

        ellipse(ball2Speed ,2*HEIGHT/5, DIAMETER,DIAMETER);
        ball2Speed+=2;

        ellipse(ball3Speed ,3*HEIGHT/5, DIAMETER,DIAMETER);
        ball3Speed+=3;

        ellipse(ball4Speed ,4*HEIGHT/5, DIAMETER,DIAMETER);
        ball4Speed+=4;


    }
}
