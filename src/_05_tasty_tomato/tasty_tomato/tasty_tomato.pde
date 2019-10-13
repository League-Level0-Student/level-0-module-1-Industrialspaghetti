void setup() {
    size(500, 500);
}
void draw() {
      fill (#C1C1C1);
    background(200, 200, 200);
    noStroke();
   fill(#F52A2A);
   ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill (#8CD313);
    rect(176, 103, 12, 32);
    if (mousePressed){ 
      fill (#C1C1C1);
      ellipse(mouseX,mouseY, mouseX,mouseY);
      
      
      

    }

}
