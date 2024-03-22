import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// Draw 10 x 10 grid in quadrant 1 

  for(int lineX = 20; lineX <= 200; lineX +=20) {
    line(lineX, 0, lineX, 200);
     }

  for(int lineY = 20; lineY <= 200; lineY += 20) {
    line(0, lineY, 200, lineY);
      }

  //Draw Circles  
  for(int circleY = 20; circleY <= 200; circleY += 40) {
    for(int circleX = 220; circleX <= 400; circleX += 40) {
      ellipse(circleX, circleY, 30, 30); 
    }
  }

  // Draw grayscale gradient 

  for(int y = 200; y < height; y++){
    for(int x = 0; x < 200; x++){ 
      stroke(x, x, x); 
      point(x, y);
    }
  }
  // Draw a flower 
  fill(25,12,57);
  ellipse(300,300,50,50); 

  // Draw flower petals 

  fill(25,7,250); 
  translate(300,300); 
  for (int i= 1; i <= 8; i++){
    ellipse(50,0,65,20); 
    rotate(PI/4);

  }
  
  

  
  } 
}