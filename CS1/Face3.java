/*
 *  Write a complete program in a class named Face3 that uses the DrawingPanel to draw the following figure, 
 *  based on the face figure from the previous problem. Use a parameterized static method and a loop to draw 
 *  each face without redundancy.
 *  
 *  window size: 520 x 180 px
 *  faces' top-left at (10, 30), (110, 30), (210, 30), (310, 30), and (410, 30)
 *  (You don't need to include any import statements at the top of your program.)
 */
 
public class Face3 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(520,180);
        Graphics g = panel.getGraphics();
        
        for(int i = 0; i < 5; i++){
            face(g,i*100+10,30);
        }
    }
    public static void face(Graphics g, int x, int y){
        g.drawOval(x,y,100,100);
        g.setColor(Color.BLUE);
        g.fillOval(x+20,y+30,20,20);
        g.fillOval(x+60,y+30,20,20);
        g.setColor(Color.RED);
        g.drawLine(x+30,y+70,x+70,y+70);
        g.setColor(Color.BLACK);
    }
}
