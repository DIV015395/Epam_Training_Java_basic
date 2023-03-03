
interface feature
{
    int modelname;
    string phonename;
    int color;
    int androidversion;
    abstract  void call();
    abstract void setalarm();
    abstract void download();
    abstract void screenrecoding();
}
class phone
{
    int modelname;
    string phonename;
    int color;
    int androidversion;
}
class simplephone extends phone implements feature
{
    public void phoneset()
    {
        System.out.println("This is phoneset ");
    }
    public void call()
    {
        System.out.println("Call kar diya bhai ");
    }
    public void setalarm()
    {
        System.out.println("Set alarm ho gya 6 baje");

    }

    @Override
    public void download() {

    }

    @Override
    public void screenrecoding() {

    }

}
class smartphone extends phone implements feature
{
    public void phoneset()
    {

    }


    @Override
    public void call() {

    }

    @Override
    public void setalarm() {

    }

    @Override
    public void download() {

    }

    @Override
    public void screenrecoding() {

    }


}
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }
}