class demo {

   public static int sum(String s){
         String res = "";
         int sum =0;
         for(int i=0;i<s.length;i++){
               if(Character.isDigit(s.charAt(i))){
                     res+=s.charAt(i);
                 }else{
                    if(res.length!=0){
                          sum+=Integer.parseInt(res);
                          res="";
                       }
                } 
          }
              if(res.length!=0){
                          sum+=Integer.parseInt(res);
             }
   return sum;
    }
}