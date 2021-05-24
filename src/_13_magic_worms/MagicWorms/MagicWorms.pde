void setup (){
background (#2238F2) ;
size (500,500);
}

void draw (){
if (mousePressed){
  for(int i =0 ; i<=300 ; i++){
int red = (int)random(0,255);
int blue = (int)random(0,255);
int green = (int)random(0,255);
int x = (int)random(0,400);
int y = (int)random(0,400);
fill (red,blue,green);
 ellipse(mouseX,mouseY,80,60);
 ellipse(i,i,80,60);
 
makeMagical ();
}
}
}
 float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
