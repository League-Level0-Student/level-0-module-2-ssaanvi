//Make a variable to hold the X co-ordinate of the dot and set it to 
int x=77 ;
void setup() {
    size(800, 200);

}

void draw() {
  fill (87,10,244) ;
  ellipse (x,88,59,66) ;
  //make it a nice color

    //if the mouse is pressed...
  if (mousePressed) {
 x=x+22;
  }
    //... change the X co-ordinate so that the dot moves to the right
    //Draw an ellipse of height and width 10 Make sure to use your variable for the X position.

    //Make your dot move really fast so that it can win the race 
    //    (you have to figure out what part of your code to change)
}