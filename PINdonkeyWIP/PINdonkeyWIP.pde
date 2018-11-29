PImage donkey;
PImage tail; 

void setup(){
  donkey = loadImage("pin.jpg");    
tail = loadImage("crop2.png");   
tail.resize(50, 315);
 size(628, 740);  

}

void draw(){
  println("X: " + mouseX + " Y: " + mouseY);
image(tail, mouseX, mouseY);
 rect(0, 0, 30, 30); 
 rect(540,347,25,30);
 if(dist(0, 0, mouseX, mouseY) < 30 ){
   background (donkey);
 }
 else{background(#ED0E0E);}
 //x-550 
}