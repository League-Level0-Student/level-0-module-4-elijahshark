PImage backgroundImage;
void setup(){
 
size (800,760);  
  
  if(x > width){
    xSpeed = -xSpeed;
}
 backgroundImage = loadImage("PIKAZARD X.jpg"); 
}
int x = 250;
int y = 10;
int xSpeed = 1;
void draw(){

  image(backgroundImage, 0, 0);
  ellipse(x,x,y,y);
  fill(255,255,255);
  stroke(255,255,255);
  x+=xSpeed;
 rect(mouseX,700 , 125, 25);
  if(intersects(x, x, mouseX, 700, 125)){
  xSpeed = -xSpeed;
  }  

}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY,
int paddleLength) {
    if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
        return true;
    else
        return false;
}