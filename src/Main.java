import processing.core.PApplet;
import java.util.Random;
public class Main extends PApplet {
    public static PApplet app;
    int d = 800;
    public Main(){
        super();
        app = this;
    }
    public static void main (String[] args) {
        PApplet.main("Main");
    }

    public void settings(){
        size(d, d);
    }

    public void setup(){}

    public void draw(){
        dS(d/2, d/2, d);
        someShape(d/2, d/2, 30);
        otherShape(d/2, d/2, 30);
        nextShape(d/2, d/2, 30);
        lastShape(d/2, d/2, 30);
    }

    private void dS(int x, int y, int w){
        Main.app.noStroke();
        Random r = new Random();
        float red = r.nextInt(255);
        float green = r.nextInt(255);
        float blue = r.nextInt(255);
        Main.app.fill(red, green, blue);
        rect(x, y, w, w);
        if(w > 10){
            dS(x, y + w/2, w/2);
            dS(x, y - w/2, w/2);
            dS(x + w/2, y, w/2);
            dS(x - w/2, y, w/2);
        }
    }
    private void someShape(int x, int y, int H){
        Main.app.noStroke();
        Random r = new Random();
        float red = r.nextInt(255);
        float green = r.nextInt(255);
        float blue = r.nextInt(255);
        Main.app.fill(red, green, blue);
        ellipse(x-H, y-H, H*2, H*2);
        if(H >= 2){
            H--;
            someShape(d/2, d/2, H);
        }
    }

    private void otherShape(int x, int y, int H){
        Main.app.noStroke();
        Random r = new Random();
        float red = r.nextInt(255);
        float green = r.nextInt(255);
        float blue = r.nextInt(255);
        Main.app.fill(red, green, blue);
        ellipse(x+H, y+H, H*2, H*2);
        if(H >= 2){
            H--;
            otherShape(d/2, d/2, H);
        }
    }

    private void nextShape(int x, int y, int H){
        Main.app.noStroke();
        Random r = new Random();
        float red = r.nextInt(255);
        float green = r.nextInt(255);
        float blue = r.nextInt(255);
        Main.app.fill(red, green, blue);
        ellipse(x+H, y-H, H*2, H*2);
        if(H >= 2){
            H--;
            nextShape(d/2, d/2, H);
        }
    }

    private void lastShape(int x, int y, int H){
        Main.app.noStroke();
        Random r = new Random();
        float red = r.nextInt(255);
        float green = r.nextInt(255);
        float blue = r.nextInt(255);
        Main.app.fill(red, green, blue);
        ellipse(x-H, y+H, H*2, H*2);
        if(H >= 2){
            H--;
            lastShape(d/2, d/2, H);
        }
    }
}