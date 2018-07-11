int y = 500;
int x = 500;
PImage creeper;
void setup(){
size(1200, 1200);
PImage minecraft = loadImage("minecraft.jpg");
minecraft.resize(1200,1200);
background(minecraft);
creeper=loadImage("creeper.png");
creeper.resize(20, 20);


}


void draw (){
 
  image(creeper, x, y);  
  if(mousePressed){
  ellipse (mouseX,mouseY,20,20);
  }
}