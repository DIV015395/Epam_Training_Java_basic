interface remote
{
    void simpleremote();
}
class tv implements remote
{
    public void simpleremote()
    {
        System.out.println("Simple tv remote");
    }
}
class smarttv implements remote
{
    @Override
    public void simpleremote()
    {
        System.out.println("Smart tv remote");

    }
}
public class Main
{
    public  void main(String[] args)
    {
         remote r = new smarttv();
         r.simpleremote();

    }
}