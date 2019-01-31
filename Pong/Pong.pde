int ballMove = 320;
int ballUp = 200; 
int ballSpeed = 5;
int paddleX =0;
int paddleLength = 85;
PImage backgroundImage; 
void setup(){
  backgroundImage = loadImage("image.jpg"); //in the setup method
  size(640, 400); 

  
}

void draw(){
backgroundImage = loadImage("pong.jpg"); 
image(backgroundImage, 0, 0);

  fill(#FF9543) ;

stroke(#B96F36) ;
  ellipse(ballMove, ballUp, 20, 20); 
  ballMove+=ballSpeed;
  
if(ballMove > 630|| ballMove<10){
    ballSpeed = -ballSpeed;
}
if (ballUp <10 || ballUp >390){
 ballSpeed = -ballSpeed; 
}
 fill(#8BFA93) ;

stroke(#439B49) ;
  rect(0, mouseY, 20, 85);
  
  
  
}  
boolean intersects(int ballMove, int ballUp, int paddleX, int mouseY,
int paddleLength) {
    if (ballUp > mouseY && ballMove > paddleX && ballMove< paddleX + paddleLength)
        return true;
    else
        return false;
}