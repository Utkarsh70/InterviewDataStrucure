  
class demo {

  ArrayList<Integer> list = new ArrayList<>();
        // int n1 = leftRotate(N,D);
        // int n2 = rightRotate(N,D);
        int t=16;
        int left= ((N<<D) | N>>(t-D)) & 0xFFFF;
        int right=((N>>D) | N<<(t-D)) & 0xFFFF;
        list.add(left);
        list.add(right);
        return list;

}