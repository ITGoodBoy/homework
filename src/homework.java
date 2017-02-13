import java.lang.reflect.Method;

/**
 * Created by Sergey on 10.02.2017.
 */
public class homework {


    public static void main(String[] args) {
        Class humanClass = Human.class;

        if (humanClass.isAnnotationPresent(InitClass.class))
        {
            for (Method method: humanClass.getMethods())
            {
                if (method.isAnnotationPresent(InitMethod.class))
                {
                    try {
                         method.invoke(humanClass.newInstance());
                    } catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
