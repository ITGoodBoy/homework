/**
 * Created by Sergey on 13.02.2017.
 */

@InitClass
public class Human  {


    public void move()
    {
        System.out.println("I move");
    }


    @InitMethod
    public void jump()
    {
        System.out.println("I jump");
    }
}
