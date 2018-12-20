 PImage creeper; 
 int x=465;
 int y = 25;
 int time = -1;
   
void setup(){
  size(500,500);
  PImage minecraft = loadImage("background.jpeg"); 
minecraft.resize(500, 500);    
background(minecraft);        
creeper=loadImage("ewMinecraft.png"); 
creeper.resize(6,6);   
}

void draw(){
  PImage minecraft = loadImage("background.jpeg"); 
  minecraft.resize(500, 500);    
  image(creeper, x, y);  
  if (mousePressed){
    if(isNear(mouseX, x) == true&& isNear(mouseY, y)==true){
      stroke(#1CFC00);
      noFill();
    }
  else {
      stroke(#FF0A1F);
      noFill();
    }
      ellipse(mouseX,mouseY,16,16);
      
 if(isFound(mouseX,x)== true && isFound(mouseY, y) == true){
      fill(#FA1A05);
      textSize(60);
      text("You found it!",55,250);
      time=50;}
  }
   if(time==0){
      int r = (int)random(0, 500);
  int p = (int)random(0, 500);
     x=r;
      y=p;
        background(minecraft); 

}
else if(time>-1){
  time--;
}
  
  
  
}
 
  



   boolean isNear(int x, int y) {
if (abs(x - y) < 75)
     return true;
else
     return false;
   
}
 boolean isFound(int x, int y) {
if (abs(x - y) <= 5)
     return true;
else
     return false;
   
}