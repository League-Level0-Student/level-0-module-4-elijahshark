import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample BASS;

void playBASS() {
     BASS.stop();
     BASS.trigger();
}
int y = 500;
int x = 500;
PImage creeper;
void setup(){
size(1000, 1000);
PImage minecraft = loadImage("minecraft.jpg");
minecraft.resize(1000,1000);
background(minecraft);
creeper=loadImage("creeper.png");
creeper.resize(5, 5);
     BASS = minim.loadSample("BASS.wav");
}








void draw (){
 println("X: " + mouseX + " Y: " + mouseY);
  image(creeper, x, y);  
  if(mousePressed){
  ellipse (mouseX,mouseY,5,5);
if (mouseX>500&&mouseX<505&&mouseY>500&&mouseY<505){
playBASS();
}
}
}

int distance (int x1, int y1, int x2, int y2) {
  int distance = (int)Math.sqrt( Math.pow (  x2- x1,2) + Math.pow (y2 - y1,2));
  return distance;
  
  
  
}