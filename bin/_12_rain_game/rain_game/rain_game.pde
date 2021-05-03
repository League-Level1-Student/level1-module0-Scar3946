int rain = 20;
int score = 0;
int x = 0;
void setup () {


                      
size(600,600); 
}
void draw(){
  background (#095D22) ;
  fill(0,0,40);
    stroke(0, 0, 40);
 ellipse(x, rain, 20, 30);
 fill (#FF0318);
  rect( mouseX,  400,  40 ,20);
   if( rain >=20 ){
     rain+=5;
   }
   if (rain >=800){
     checkCatch (x);
    x = (int) random(width);
    rain = 20;
    
   }
   fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20); 
}
 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
