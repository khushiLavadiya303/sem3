1.EMPLYOEE
class Employee 
{
    int age;
    String name;
    float salary;

    void setData(int a, String n, float s) 
    {
        age = a;
        name = n;
        salary = s;
    }

    void displayData() 
    {
        System.out.println("Employee Name   : " + name);
        System.out.println("Employee Age    : " + age);
        System.out.println("Employee Salary : " + salary);
    }
}
public class EmployeeTest 
{
    public static void main(String[] args) 
    {
        Employee emp = new Employee();
        emp.setData(28, "Priya Sharma", 48500.50f);
        emp.displayData();
    }
}
2. INPUT THEE NUMBERS AND MINIMUM AMONG THEM 
class MinFinder 
{
    int a = 15, b = 8, c = 22;
    void findMinimum() 
    {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("Numbers: " + a + ", " + b + ", " + c);
        System.out.println("Minimum number is: " + min);
    }
}
public class MinDemo 
{
    public static void main(String[] args) 
    {
        MinFinder obj = new MinFinder();
        obj.findMinimum();
    }
}
3.ARUTHMETIC OP USING COMMAND LINE ARG
public class CommandLineArithmetic 
{
    public static void main(String[] args) 
    {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        System.out.println("Addition       : " + (num1 + num2));
        System.out.println("Subtraction    : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Division       : " + (num1 / num2));
        } else {
            System.out.println("Division       : Division by zero is not allowed.");
        }
    }
}
4.METHOD OVERLOADING
class Calculate 
{
    int add(int a, int b) 
    {
        return a + b;
    }
    float add(float a, float b) 
    {
        return a + b;
    }
    String add(String s1, String s2) 
    {
        return s1 + s2;
    }
}
public class CalculateDemo 
{
    public static void main(String[] args) 
    {
        Calculate calc = new Calculate();

        System.out.println("Sum of two integers : " + calc.add(10, 20));
        System.out.println("Sum of two floats   : " + calc.add(12.5f, 7.3f));
        System.out.println("Concatenated String : " + calc.add("Hello, ", "Java!"));
    }
}
5.MULTIPLE INTERFACE:
interface Printable 
{
    void print();
}
interface Showable 
{
    void show();
}
public class Test_Multiple implements Printable, Showable 
{
    public void print() 
    {
        System.out.println("Executing print() method from Printable interface.");
    }
    public void show() 
    {
        System.out.println("Executing show() method from Showable interface.");
    }
    public static void main(String[] args) 
    {
        Test_Multiple obj = new Test_Multiple();
        obj.print();
        obj.show();
    }
}
6.EXCEPTION HANDLING 
public class ExceptionDemo 
{
    public static void main(String[] args) 
    {
        int[] arr = new int[2];

        try {
            // This line triggers ArithmeticException first (30 / 0), 
            // or ArrayIndexOutOfBoundsException depending on evaluation order.
            arr[3] = 30 / 0;
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Caught Exception: ArrayIndexOutOfBoundsException -> " + e);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Caught Exception: ArithmeticException -> " + e);
        }

        System.out.println("Rest of the code executed successfully.");
    }
}


6.INHERITANCE:
class AddSub 
{
    int num1 = 30, num2 = 10;

    void calAdd() 
    {
        System.out.println("Addition       : " + (num1 + num2));
    }

    void calSub() 
    {
        System.out.println("Subtraction    : " + (num1 - num2));
    }
}

class MulDiv extends AddSub 
{
    void calMul() 
    {
        System.out.println("Multiplication : " + (num1 * num2));
    }

    void calDiv() 
    {
        if (num2 != 0) {
            System.out.println("Division       : " + ((double) num1 / num2));
        } else {
            System.out.println("Division       : Division by zero error.");
        }
    }
}

public class MathOperationDemo 
{
    public static void main(String[] args) 
    {
        MulDiv obj = new MulDiv();
        obj.calAdd();
        obj.calSub();
        obj.calMul();
        obj.calDiv();
    }
}