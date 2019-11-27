int xL = 335;
int xR = 679;
int y = 421;
int acceleration = 5;
PImage catPic;
import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample catLazer;
void setup()  {
  size(1000, 1000);
  catLazer = minim.loadSample("cat-lazer.wav");
  catPic = loadImage("catPic.jpg");
  catPic.resize(width, height);
  background(catPic);
}
void draw() { 
  fill(250, 0, 0);
  noStroke();
  ellipse(xL, y, 100, 100);
  ellipse(xR, y, 100, 100);
    if(xL > width) {
       background(catPic);
       xR = 335;
       xL = 679;
       y = 421;
       acceleration = 5;
  }
}
void keyPressed() {
  xR += 2 * acceleration;
  xL += 2 * acceleration;
  y += 2 * acceleration;
  catLazer.trigger();
}
