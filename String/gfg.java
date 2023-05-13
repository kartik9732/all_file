public class gfg {
  

    String longestCommonPrefix(String arr[], int n)
    {
        String fs=arr[0];

       for(int i=1;i<arr.length;i++)
       {

           while(arr[i].indexOf(fs)!=0)
           {

               fs=fs.substring(0,fs.length()-1);

           }

       }

       if(fs.length()==0)

           return "-1";

         

       return fs; 
    }
}
    

