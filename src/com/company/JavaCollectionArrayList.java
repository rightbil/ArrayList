package com.company;

import java.util.*;

public class JavaCollectionArrayList {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
//TODO: 1 ArrayList Debugging Activity
        /* // Create an arraylist
        ArrayList<String> letters = new ArrayList();
        System.out.println("Initial size of al: " + letters.size());
        // Add elements to the arraylist
        letters.add("C");
        letters.add("A");
        letters.add("E");
        letters.add("B");
        letters.add("D");
        letters.add("F");
        letters.add(1, "A2");
        System.out.println("Size of al after additions: " + letters.size());

        // Display the arraylist
        System.out.println("Contents of al: " + letters);

        // Removes elements from the arraylist
        letters.remove("F");
        letters.remove("G");
        letters.remove(2);
       System.out.println("Content after removing: " + letters);
        int searchIndex = Collections.binarySearch(letters, "B", Collections.reverseOrder());
        if (searchIndex >= 0) {
            System.out.println("Letter found : " + searchIndex);
        } else System.out.println("Letter is not found: " + searchIndex);
        */
//TODO: 2 ArrayList Debugging Activity
/*
        // create an array list
        ArrayList al = new ArrayList();
        System.out.println("Initial size of al: " + al.size());
// add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Size of al after additions: " +  al.size());
// display the array list
        System.out.println("Contents of al: " + al);
// Remove elements from the array list
        al.remove("F");
        al.remove("G");
        al.remove(2);
        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
*/

// TODO: 3 Fun With ArrayLists ( 1 to 6)
/*
        ArrayList<String> favoriteColors = new ArrayList<>();
        favoriteColors.add("Green");
        favoriteColors.add("Yellow");
        favoriteColors.add("Red");
        Iterator color = favoriteColors.iterator();
        while (color.hasNext()) {
            System.out.println(color.next());
        }
        for (int i = 0; i < favoriteColors.size(); i++) {
            if(i==2)
            System.out.println(favoriteColors.get(i));
        }

        String control = "";
        do {
            System.out.println("Your favorite Color? Q to quit");
            control=keyboard.next();
            favoriteColors.add(control);
        }while (!control.equalsIgnoreCase("Q"));
         System.out.println(favoriteColors);
*/
// TODO: 4 Movie including bonus
/*
       // BONUS: Print out the list of movies sorted in alphabetical order.
       // BONUS x2: Suggest a movie to the user to watch by randomly selecting a movie from the list of movies entered.


        ArrayList<String> movie = new ArrayList<>();
        String control = "";
        while (!control.equalsIgnoreCase("Q")) {
            System.out.println("Your movie ? Q to quit");
            control = keyboard.next();
            if (!control.equalsIgnoreCase("Q")){
                movie.add(control);
            System.out.println("Enter Q to quit C to continue");
            control = keyboard.next();
        }
        }
        Collections.sort(movie,Collections.reverseOrder());
        System.out.println(movie);
        Random r = new Random();
        int index= r.nextInt(movie.size());
        for(int i= 0; i< movie.size(); i++) {
        if(i==index)
            System.out.println(movie.get(i));
        }
*/
// TODO: 5 Finding a value in an arrayList
/*         ArrayList<Integer> randomList = new ArrayList<>();
         Random rand = new Random();
         int i=0;
         while(i< 10)
         {
             randomList.add(1+ rand.nextInt(50));
             i++;
         }
        System.out.println(randomList);
        System.out.println("Enter your number to search?");
        int searchItem = keyboard.nextInt();
        int counter=0;
        for( int num : randomList)
        {
            if(num ==searchItem){
                counter+=1;
            }
        }
        if(counter > 1){
            System.out.println(searchItem + " was found " + counter + " times in the ArrayList");
        }
        else if(counter==1){
            System.out.println(searchItem + " was in the ArrayList");
        }
        else
        {
            System.out.println(searchItem + " was not found in the ArrayList");
        }*/
// Really TODO: 6 Get Random Item From ArrayList

// TODO: 7 Hangman Requirements
        /**When you run the application, randomly choose a word from that list for the user to guess.
         For each letter the user guesses wrong, let them know along with how many wrong guesses they have left.
         The user is allowed up to 5 wrong guesses. On the 6th wrong guess, they lose the game.
         If the user guesses correctly, output the word with the letters they have guessed correctly so far and blanks for letters they have not guessed yet.
         The user can input either a letter or a word for their guess.
         If the user guesses the word correctly, output "You've won!" and end the game.
         */
        // TODO :Hangman Solution
/*ArrayList<String> hangManWord = new ArrayList<>();
        Collections.addAll(hangManWord,"tree","rain" ,"bear","encourage" ,"promise","soup" ,"chess" ,"insurance" ,"pancakes","stream");
        Random rand = new Random();
        String myWord = hangManWord.get(rand.nextInt(hangManWord.size()));
        int incorrectGuessCounter = 1;
        final int maxAllowedGuess = 6;
        char[] name = new char[myWord.length()];
        name = myWord.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < name.length; i++) {
            sb.append('*');
        }
        String search = "default";

        boolean isWordFound;
        boolean isLetterFound;
        System.out.println("Welcome, let's play hangman!" + myWord);
        System.out.println("Here is the word I am thinking of:" + sb);
        while (incorrectGuessCounter <= maxAllowedGuess) {
            isWordFound = false;
            isLetterFound = false;
            System.out.println("Enter letter or word guess:");
            search = keyboard.next();
            if (myWord.equalsIgnoreCase(search)) {
                isWordFound = true;
                incorrectGuessCounter = maxAllowedGuess + 1;

            } else {//if (search.length()==1){
                for (int i = 0; i < name.length; i++) {
                    for (int j = i; j < name.length; j++) {
                        if (name[j] == search.charAt(0)) { // correct word guess
                            sb.setCharAt(j, search.charAt(0));
                            isLetterFound = true;
                        }// if ends here
                    }
                }
                if (!sb.toString().contains("*")) {
                    isWordFound = true;
                }
                ;
            } // end of else
            if (isWordFound == true && isLetterFound == false) {
                System.out.println("You've won! The word was " + myWord);
                System.out.println("Thank you for playing!");
                System.out.println("=======================================");

            }// Custom out put messages
            if (isWordFound == false && isLetterFound == true) {
                System.out.println("Your guess so far:" + sb);
            }
            if (isWordFound == false && isLetterFound == false) {
                if (incorrectGuessCounter == maxAllowedGuess) {

                    System.out.println("You have guessed incorrectly " + incorrectGuessCounter + "/" + maxAllowedGuess + " times.");
                    System.out.println("Sorry, you have no more guesses left. The word was " + myWord);
                    incorrectGuessCounter++;
                } else {
                    System.out.println("You have guessed incorrectly " + incorrectGuessCounter + "/" + maxAllowedGuess + " times.");
                    incorrectGuessCounter++;
                }

            }
         } // end of while loop
         */
// TODO: My Set; convert it to Map
 /*int[] n= new int[]{24,60,50,70,70,56,78,90,90,80};
        Set<Integer> s= new HashSet();
        for (int i=0; i<n.length; i++) {
            s.add(n[i]);
        }
        System.out.println(s);
        TreeSet ts= new TreeSet<Integer>(s);
        System.out.println(ts);
        */
// TODO: Array Deep Comparison
/*   int inarr1[] = {1, 2, 3};
        int inarr2[] = {1, 2, 3};
        Object[] arr1 = {inarr1};  // arr1 contains only one element
        Object[] arr2 = {inarr2};  // arr2 also contains only one element
        Object[] outarr1 = {arr1}; // outarr1 contains only one element
        Object[] outarr2 = {arr2}; // outarr2 also contains only one element
        if (Arrays.deepEquals(outarr1, outarr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
    }
    */
   } // end of main
}// end of class


