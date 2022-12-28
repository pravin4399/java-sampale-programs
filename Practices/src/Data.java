 class Data{

    int Data1;
    int Data2;

    public Data( int d1,int d2){
        Data1 = d1;
        Data2 = d2;
    }
     public Data( Data obj ){
        Data1 = obj.Data1;
        Data2 = obj.Data2;
     }
     public void displayData(){
         System.out.println("\nData1 :"+ Data1);
         System.out.println("Data2 :"+ Data2);
     }






}



