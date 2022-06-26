public class ThreadDemo
{
    public static void main(String []args) throws Exception
    {
        Thread obj1 = new Thread(() -> 
        {
             for(int i=1;i<=10;i++)
              {
                System.out.println("Hii");
                try{Thread.sleep(100); }
                catch(Exception e){}
              }
        });
        Thread obj2 = new Thread(() ->
        {
                 for(int i=1;i<=10;i++)
               {
                 System.out.println("Hello");
                 try{ Thread.sleep(100); }
                 catch (Exception e){}
               }
        });
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        obj1.start();
        obj2.start();
        obj1.join();
        obj2.join();
        System.out.println(obj1.isAlive());
        System.out.println("bye");
    }
}