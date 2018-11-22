void setup(){
ryan = loadImage("ryan.jpg");
size(798,420);
    background(ryan);

}
PImage ryan;
void draw(){

background(ryan);


fill(255,255,255);
noStroke();
ellipse(300,156,45,45);
ellipse(430,154,45,45);
if (mouseX<295){
  mouseX=295;
}
if(mouseX>305){
  mouseX=305;}
  
if(mouseY<150){
  mouseY=150;}
  
  if(mouseY>160){
    mouseY=160;}

  fill(#311A00);  
ellipse(mouseX,mouseY, 35,35);
ellipse(mouseX+130,mouseY-2, 35,35);
}