class divisible{
    public static void main(String args[]){

        int j=0,k=0,m=0;
        int a1[]=new int[];

        for(int i=1;i<=50;i++){
            if(i%3==0){
            a1[j]=i;
            j++;
            }
            else{
                System.out.println("false");
            }
           
        }
        System.out.println("divisible by 3");
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
        }
    }
}