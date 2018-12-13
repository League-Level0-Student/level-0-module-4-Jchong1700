 import ddf.minim.*;        
AudioSample woohooSound;          
boolean playSound = true;          
PImage donkey;
PImage tail; 
int x = 0;
int y = 0;
boolean tailSet = false;
boolean tries = false;
void setup(){
  donkey = loadImage("pin.jpg");    
tail = loadImage("crop2.png");   
tail.resize(50, 315);
 size(628, 740);  
 Minim minim = new Minim(this);     
woohooSound = minim.loadSample("homer-woohoo.wav");    

}

void draw(){
  rect(0, 0, 30, 30); 
 rect(540,347,25,30);

if(dist(0, 0, mouseX, mouseY) < 30 || tries == true){
  background (donkey);
 }
 else{background(#8DEEFA);}

  if (tailSet == false){
  x=mouseX;
   y=mouseY;
  }
  if (mousePressed&& tries == false){
    tailSet = true;
   x=mouseX;
   y=mouseY;
   tries = true;
   
  
}

 image(tail, x,y);
 if (tries == true){
   if (x>540&&x<565&&y>347 && y<377){
     
        fill(#FA1A05);
  textSize(60);
   text("You Win!",340,150);
   if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
   }
else{fill(#FA1A05);
  textSize(60);
  text("You Lose!",340,150);
}
  }
 
 
 
  



}