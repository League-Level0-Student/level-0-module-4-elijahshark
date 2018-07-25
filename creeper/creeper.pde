int y = 600;
int x = 600;
PImage creeper;
void setup(){
size(1200, 1200);
PImage minecraft = loadImage("minecraft.jpg");
minecraft.resize(1200,1200);
background(minecraft);
creeper=loadImage("creeper.png");
creeper.resize(5, 5);


}


void draw (){
 
  image(creeper, x, y);  
  if(mousePressed){
  ellipse (mouseX,mouseY,5,5);
if (distance(mouseX,mouseY,x,y)<5){

}
}
}

int distance (int x1, int y1, int x2, int y2) {
  int distance = (int)Math.sqrt( Math.pow (  x2- x1,2) + Math.pow (y2 - y1,2));
  return distance;
  
  
  
}