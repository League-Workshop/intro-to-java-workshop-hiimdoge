int foodX = (int) random(width-20);
int foodY = 20;
int score = 0;
int fishX = 900;
int fishSpeed = 0;
boolean launched = false;
void setup() {
  size(1000, 1000);
}
void draw() {
  background(141,233,237);
  fill(150, 150, 0);
  noStroke();
  ellipse(foodX, foodY, 500, 500);
  foodY += 5;
  fill(0, 0, 0);
   textSize(16);
   text("Score: " + score, 20, 20);
   fishX += fishSpeed;
   drawFish();
  if (foodY >= 1010) {
   foodY = 20; 
   foodX = (int) random(width-20);
  }
  checkCatch(foodX, foodY);
  if (score == 5) {
    textSize(35); //if it’s not big enough
    fill(0, 0, 0);
    score ++;
    text("You won! The fish is not hungry anymore!!", 125, 500);
        stop();
  }
  }
   void checkCatch(int x, int y){
   if(x > fishX && x < fishX+70){
      if(y > mouseY-17 && y < mouseY+30){
             score++;
             foodY = 20; //if the food was eaten, make more food fall from the top
             foodX = (int) random(width - 20);
          }
     }
     else if (foodY > height && score > 0){
          score--;
     }
     if (mousePressed) {
      launched = true; 
     }
     if (launched = true) {
     fishSpeed = -7;
     }
     if (fishX <= 25) {
       launched = false;
       fishSpeed = 0;
       fishX = 900;
     }
}


void drawFish(){
     noStroke();
     fill(255,255,255);
     ellipse(fishX-17,mouseY-17,20,20); //back side eye
     fill(255,200,88);
     ellipse(fishX,mouseY,90,50); //body
     triangle(fishX+30,mouseY,fishX+70,mouseY+30,fishX+70,mouseY-30); //tail
     stroke(0);
     triangle(fishX,mouseY,fishX+15,mouseY+10,fishX+15,mouseY-10); //side fin
     noStroke();
     fill(255,200,88);
     ellipse(fishX,mouseY,15,15); //side fin cover
     noStroke();
     fill(255,255,255);
     ellipse(fishX-25,mouseY-15,20,20); //front eye
     fill(0,0,0);
     ellipse(fishX-25,mouseY-15,5,5); //pupil
     fill(141,233,237);
     ellipse(fishX-45,mouseY,25,25); //mouth
}
