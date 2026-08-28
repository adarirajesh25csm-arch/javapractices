class Aioob{
  public static void main(String[] args){

  int a[] = {10,20,30,40,50};
    
    try{
      
      System.out.println(a[7]);
      
    }catch(ArrayIndexOutOfBoundsException e){
      
      System.out.println("Array Index is Out of Bounds");
    }
    System.out.println("Program Executes Smoothly...");
  }
}
