package task;

public class Main {


    public static void main(String[] args) {

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        task1.lineReverse("Andersen");

        task1.replaceCharacter("Hello", 1, 'a');

        task1.deleteCharacter("Hello", 2);

        task1.countChar("gooogle", 'o');

        task1.showLine("Hello World!", 7);

        task1.isPalindrom("роллор");

        task1.isAnagramm("рано", "нора");

        task1.fibonacchi(8);

        task1.factorial(6);


        task2.method1();

        task2.method2();

        task2.method3();
    }
}
