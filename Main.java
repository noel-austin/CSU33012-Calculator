import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void printer(String result){
        System.out.print(result);
        return;
    }

    public static String operations(String firstNum, String secondNum, String operator){
        double result = 0;
        switch (operator) {
            case "*":
                result = result + Double.parseDouble(firstNum) * Double.parseDouble(secondNum);
                break;
            case "-":
                result = result + Double.parseDouble(firstNum) - Double.parseDouble(secondNum);
                break;
            case "+":
                result = result + Double.parseDouble(firstNum) + Double.parseDouble(secondNum);
                break;
        }
        return Double.toString(result);
    }

    public static List recognize(String expression){
        String string = "";
        char [] expressions = expression.toCharArray();
        List<String> expressionList = new ArrayList<>();
        for (int i = 0; i < expressions.length; i++){
            if (Character.isDigit(expressions[i])){
                string = string + Character.toString(expressions[i]);
            }
            else {
                expressionList.add(string);
                expressionList.add(Character.toString(expressions[i]));
                string = "";
            }
        }
        expressionList.add(string);


        return expressionList;
    }

    public static String toDoTheOperation(List expressionLists){
        String result = "";
        String firstNum = "";
        String secondNum = "";
        String operator = "";
        for (int i = 0; i < expressionLists.size(); i++) {
            if (expressionLists.get(i).equals("*")) {
                firstNum = expressionLists.get(i - 1).toString();
                secondNum = expressionLists.get(i + 1).toString();
                result = operations(firstNum, secondNum, "*");
                expressionLists.remove(i - 1);
                expressionLists.remove(i);
                expressionLists.set(i - 1, result);
                i = 0;
            }
        }
        for (int j = 0; j <expressionLists.size(); j++){
            if (expressionLists.get(j).equals("+")) {
                firstNum = expressionLists.get(j - 1).toString();
                secondNum = expressionLists.get(j + 1).toString();
                result = operations(firstNum, secondNum, "+");
                expressionLists.remove(j - 1);
                expressionLists.remove(j);
                expressionLists.set(j - 1, result);
                j = 0;
            }
            if (expressionLists.get(j).equals("-")) {
                firstNum = expressionLists.get(j - 1).toString();
                secondNum = expressionLists.get(j + 1).toString();
                result = operations(firstNum, secondNum, "-");
                expressionLists.remove(j - 1);
                expressionLists.remove(j);
                expressionLists.set(j - 1, result);
                j = 0;
                }
            }
        return result;
    }
    public static int checkError(String expression){

       return 0;
    }

    public static void main(String[] args) {
        System.out.println("Please type your expression to the calculator:");
        Scanner input = new Scanner(System.in);
        String expression = input.next();
        if (checkError(expression) == 0){
            List expressionLists = recognize(expression);
            String result = toDoTheOperation(expressionLists);
            printer(result);
        }
    }

}