HashMap<Character, String> map = new HashMap<Character, String>();
       
       map.put('0', " ");
       map.put('2', "ABC");
       map.put('3', "DEF");
       map.put('4', "GHI");
       map.put('5', "JKL");
       map.put('6', "MNO");
       map.put('7', "PQRS");
       map.put('8', "TUV");
       map.put('9', "WXYZ");
       
       for(int i=0;i<S.length();i++) {
           char ch = S.charAt(i);
           for(Map.Entry<Character, String> e : map.entrySet()) {
               if(e.getValue().indexOf(ch) != -1) {
                   if(e.getValue().indexOf(ch)+1 == 4)
                   res += e.getKey()+""+e.getKey()+""+e.getKey()+""+e.getKey();
                   else if(e.getValue().indexOf(ch)+1 == 3)
                   res += e.getKey()+""+e.getKey()+""+e.getKey();
                   else if(e.getValue().indexOf(ch)+1 == 2)
                   res += e.getKey()+""+e.getKey();
                   else
                   res += e.getKey();
               }
           }
       }
       return res;