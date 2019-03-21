/*
Admission No. 114161
BBIT 1203 EC - OOP I TAKEAWAY CAT (30 Marks) Submission Date: Friday 22nd March 2019
*/

/*
a) Provide a redesigned Television class that uses more appropriate member visibilit
*/
public class Television
{
    private int volume;
    private double frequency;
}

// b) Provide signatures for two mutator (setter) methods that will enable the two instance variables to be changed through an object of the class

bool setFrequency(double newFrequency);
bool setVolume(int newVolume);

// c) Write bodies for the mutator (setter) methods for which you provided signatures in question (b), above. 
//The implemented methods must prevent the two instance variables from being set to invalid values. Return a boolean flag to indicate the success/failure of the requested operation

 bool setFrequency(double newFrequency)
 {
     if (newFrequency > 534 && newFrequency < 1606)
     {
         frequency = newFrequency
         return true;
     }
     return false;
 }

 bool setVolume(int newVolume)
 {
     if (newVolume > 0 && newVolume < 11)
     {
         volume = newVolume;
         return true;
     }
     return false;
 }

 // 2. 

//  a) Write a constructor for the class Series, which takes a String representing the title of the series,
//   a String representing the studio, and a String representing the rating as its arguments,
//    and sets the respective class variables to these values

public Series( String t, String s, String r){
    title = t;
    studio = s;
    rating = r;
}

// b) Write a second constructor for the class Series, which takes a String representing the title of the series and a String representing the studio as its arguments,
// and sets the respective class variables to these values, while the class variable rating is set to "PG"

public Series (String t, String s){
    title = t;
    studio = s;
    rating = "PG";
}

//c) Write a piece of code that creates an instance of the class Series with the title “Casino Royale”, the studio “Eon Productions”, and the rating “PG13”

// Casino royale is a movie??

  Series seriess = new Seies("Casino Royale", "Eon Productions", "PG-13");