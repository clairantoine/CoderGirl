public class MethodReturnValuesSampleCode
{
    public static float divide(int top, int bottom)
    {
        float answer = (float)top / (float)bottom;
        return answer;
    }

    public static void main(String[] args) 
    {
        float result = 0.0f;
        result = divide(5, 3);
        System.out.println("Result is " + result);
    }
}

