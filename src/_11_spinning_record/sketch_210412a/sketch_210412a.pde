PImage record ;  
int rotateamount = 0;
void setup () {
background (20) ;

                      
size(800,800); 
//in setup method
record = loadImage("320px-12in-Vinyl-LP-Record-Angle.jpg");     
//in setup method
record.resize( width,height);       
}
void draw(){
 rotateImage( record,rotateamount);
 rotateamount += 5;
  
image(record, 0, 0);  //in  xwsdcxdraw method  
onMousePress


}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
