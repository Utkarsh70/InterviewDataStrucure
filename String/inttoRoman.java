class Solution
{
	String convertToRoman(int n) {
		//code here
		String result="";
		int []arr1 = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String []arr2 ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		for(int i=0;i<arr1.length;i++){
		    while(n>=arr1[i]){
		        result+=arr2[i];
		        n-=arr1[i];
		    }
		}
		return result;
	}
}