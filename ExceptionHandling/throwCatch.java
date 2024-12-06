package ExceptionHandling;
//HANDLING VS DUCKING AN EXCEPTION

public class throwCatch {
    public void a() throws Exception{
        // a says mrko jisne call kra h..vo hi handle krega..here main funv has called this method
        //the fact is khi n khi exceptions ko handle krna pdega!
            b();
    }
    public void b() throws Exception{
        //what we want is only that method will handle the exceptions that has called this method
        //here a has called b..therefore a should handle the exception here
        //bcoz no one knows wheter there is an exception or not..therefore..jo bhi method calls this method will handle the error

      int num1 = 8;
      int num2 =0;
      int result = num1/num2;
        System.out.println(result);
    }
    public static void main(String[] args) throws Exception {
         throwCatch obj = new throwCatch();
        try{
            obj.a();
        }
        catch (Exception e) {
            obj.b();
        }
    }
}
