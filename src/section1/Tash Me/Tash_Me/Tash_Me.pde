PImage mustache;
PImage randomlady;
PImage Monocle;
void setup() {
    randomlady = loadImage("randomlady.jpg");
    size(800, 600);
    randomlady.resize(width, height);
    mustache = loadImage("mustache.png");
    mustache.resize(300, 92);
    Monocle = loadImage("Monocle.png");
    Monocle.resize(150, 150);
}

void draw() {
    background(randomlady);
    if(mouseButton == LEFT) {
        image(mustache, mouseX - 150, mouseY - 25);
    }
    if(mouseButton == RIGHT) {
        image(Monocle, mouseX - 75, mouseY - 45);
    }
}
