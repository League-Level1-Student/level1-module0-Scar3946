PImage record ;  
void setup () {
background (20) ;

                      
size(800,800); 
//in setup method
record = loadImage("320px-12in-Vinyl-LP-Record-Angle.jpg");     
//in setup method
record.resize( width,height);       
}
void draw(){
if(mousePressed){
  rotateImage(record,100);
}
image(record, 0, 0);  //in draw method  
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
   
