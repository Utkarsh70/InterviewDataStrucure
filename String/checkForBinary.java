class GfG
{
	boolean isBinary(String str)
	{
	  //Your code here
	  int n = str.length();
	  boolean flag =true; 
	  for(int i=0;i<n;i++){
	      if(str.charAt(i) == '0' || str.charAt(i) == '1'){
	          continue;   
	      }
	      else{
	          flag=false;
	          break;
	      }
	  }
	  return flag;
	}
}