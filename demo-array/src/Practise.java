public class Practise {
  public static void main(String[] args){
    //assume we have small letter only
    //Find the most frequently occur char
    char[] arr12 = new char[]{'p','a','p','b','a','p'};
    char maxChar = ' ';

    int[] letterBox = new int[26];//use this array as a counting box to count each letter frequent
    int max = 0;
    for(int i =0;i<arr12.length;i++){
      letterBox[(arr12[i]-'a')]++;//this line want to add one when the letter occur!!!!!
      }

    for(int i=0;i<letterBox.length;i++){//this loop find the maximum occuring number of the letter...
      if (letterBox[i]>max) {
        max = letterBox[i];
        maxChar = (char)(i+97);
      }

      
    }

  System.out.println("maxchar is:"+maxChar);

    }
  }

