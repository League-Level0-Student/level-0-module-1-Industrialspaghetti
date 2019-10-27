PImage pepperoni;
void setup() {
    size(500, 500);
    fill (#EDC945);
    ellipse (250,250,300,300);
    fill (#F51F07);
   ellipse (250,250, 260, 260);
   fill (#F5DE0F);
   ellipse (250, 250, 250, 250);
  pepperoni = loadImage("pepperoni slice.png");
   pepperoni.resize(70, 20);
}
void draw(){ if (mousePressed){
image(pepperoni, mouseX, mouseY);
}
}
