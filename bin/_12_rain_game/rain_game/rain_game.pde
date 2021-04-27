int rain = 20;
void setup () {
background (20) ;

                      
size(600,600); 
}
void draw(){
  fill(0,0,40);
    stroke(0, 0, 40);
 ellipse(400, rain, 20, 30);
 fill (#FF0318);
  rect( 400,  400,  40 ,20);
   if( rain >=20 ){
     rain+=80;
   }
   if (rain >=800){
    int randomNumber = (int) random(width);
   }
}
