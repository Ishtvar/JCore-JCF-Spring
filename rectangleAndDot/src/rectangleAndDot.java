import OwnLib.Java.OwnLib;

public class rectangleAndDot {
    public static void main(String[] args) {
        int leftUpX, leftUpY, rightDownX, rtightDownY, dotX, dotY;
        System.out.println("Введите координаты левого верхнего угла прямоугольника");
        System.out.print("X ");
        leftUpX = OwnLib.IntInput();
        System.out.print("Y ");
        leftUpY = OwnLib.IntInput();

        System.out.println("Введите координаты правого нижнего угла прямоугольника");
        System.out.print("X ");
        rightDownX = OwnLib.IntInput();
        System.out.print("Y ");
        rtightDownY = OwnLib.IntInput();

        while (leftUpX > rightDownX || leftUpY < rtightDownY) {
            System.out.println("Вы ввели не верные координаты");
            System.out.println("Повторно введите координаты правого нижнего угла прямоугольника");
            System.out.print("X ");
            rightDownX = OwnLib.IntInput();
            System.out.print("Y ");
            rtightDownY = OwnLib.IntInput();
        }

        System.out.println("Введите координаты точки");
        System.out.print("X ");
        dotX = OwnLib.IntInput();
        System.out.print("Y ");
        dotY = OwnLib.IntInput();
        getIfBelong(leftUpX, leftUpY, rightDownX, rtightDownY, dotX, dotY);

    }

    private static void getIfBelong(int leftUpX, int leftUpY, int rightDownX, int rtightDownY, int dotX, int dotY) {
        if (dotY < leftUpY && dotY > rtightDownY && dotX < rightDownX && dotX > leftUpX) {
            System.out.println("Точка принадлежит прямоугольнику");

        } else {
            System.out.println("Точка не принадлежит прямоугольнику");
        }

    }
}
