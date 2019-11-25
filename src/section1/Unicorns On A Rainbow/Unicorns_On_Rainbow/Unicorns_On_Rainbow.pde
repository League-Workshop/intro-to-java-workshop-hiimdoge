PImage rainbow;
PImage unicorn;
void setup() {
    rainbow = loadImage("rainbow.jpg");
    size(800, 600);
    rainbow.resize(width,height);
    unicorn = loadImage("unicorn.png");
    unicorn.resize(200, 200);
}

void draw() {
    background(rainbow);
    if(mouseButton == LEFT) {
        image(unicorn, mouseX - , mouseY);
    }
}
