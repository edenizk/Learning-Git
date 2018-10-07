public class bottle {
  public static void main (String[] args) {
    int beernum = 99;
	String word = "bottles";
	
	while (beernum > 0) {
	  
	  if (beernum == 1) {
	    word = "bottle"; //singular, as in ONE bottle
		}
		
		System.out.print(beernum + " " + word + " of beer on the wall, ");
		System.out.println(beernum + " " + word + " of beer."); // beernum + " " + word + " of beer."
		System.out.print("Take one down and pass it around, ");
		beernum = beernum - 1;
		System.out.println(+ beernum + " " + word + " of beer on the wall.");// + beernum + " " + word + " of beer on the wall."
		
		if (beernum > 1) {
		  System.out.print(beernum + " of beer on the wall, " );
		  System.out.println(beernum + " " + word + " of beer.");//beernum + " " + word + " of beer."
	} else {
	     System.out.println("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more");
         }
      }
    }
  }
	   
	