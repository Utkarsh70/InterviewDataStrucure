class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> list = new ArrayList<>();
        int i,k=0,l=0;
        
        while(k<r && l<c ){
            for(i=l;i<c;++i){
                list.add(matrix[k][i]);
            }
            k++;
            
            for(i=k;i<r;++i){
                list.add(matrix[i][c-1]);
            }
            c--;
            
            if(k<r){
                for(i=c-1;i>=l;--i){
                    list.add(matrix[r-1][i]);
                }
                r--;
            }
            if(l<c){
                for(i=r-1;i>=k;--i){
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }
        return list;
    }
}
