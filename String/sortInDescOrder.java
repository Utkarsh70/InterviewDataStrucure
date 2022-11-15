code here
        int n = str.length();
        char arr[] = str.toCharArray();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]> arr[j+1]){
                    //swap
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        String str1="";
        for(char ch : arr){
            str1=ch+str1;
        }
        return str1;