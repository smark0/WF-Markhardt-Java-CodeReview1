package cf.java;

public class CodeReview01 {
    private static void rectangleArea(int[] rectHeights, int[]rectWidths){
        int rectRes = rectHeights[0]*rectWidths[0];
        System.out.println("rectangleArea solution: " + rectRes + "cm");
    }

    private static void calcRectArea(int[] rectHeights, int[] rectWidths){
        int rectRes_1 = rectHeights[1]*rectWidths[1];
        int rectRes_2 = rectHeights[2]*rectWidths[2];
        System.out.println("calcRectArea solution 1: " + rectRes_1 + "cm");
        System.out.println("calcRectArea solution 2: " + rectRes_2 + "cm");
    }

    private static void squareArea(int squareWidth){
        int squareRes = squareWidth * squareWidth;
        System.out.println("squareArea solution: " + squareRes + "cm");

    }

    private static void squareParameter(int squareWidth){
        int squareRes_1 = squareWidth + squareWidth + squareWidth + squareWidth;
        System.out.println("squareParameter solution: " + squareRes_1 + "cm");

    }

    public static void main(String[] args) {
        int[] rectHeights = {2,30,50};
        int[] rectWidths = {5,20,40};
        int squareWidth = 4;
        rectangleArea(rectHeights,rectWidths);
        calcRectArea(rectHeights,rectWidths);
        squareArea(squareWidth);
        squareParameter(squareWidth);
    }

}
