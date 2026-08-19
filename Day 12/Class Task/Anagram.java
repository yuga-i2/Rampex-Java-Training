public class Anagram {

    public static main(String [] args){


        isAnagram("pot","top");

    }
    public static boolean  isAnagram( String s1,String s2){

       if(s1.length() ==s2.length()){
           for(int j=0;j<s2.length();j++){

               for (int i=0;i<s1.length();i++){  //top

                   if (s1.charAt(j)==s2.charAt(i){



                       return true;
                   }


                   }
               }

           }







       }


return false;


    }



}