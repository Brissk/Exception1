
//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
public class Task3 {
    public static void main(String[] args) {
        int[] array1 = new int[]{11, 23, 32, 14, 55};
        int[] array2 = new int[]{2, 3, 4, 5, 6};
        division(array1, array2);
    }

    public static int[] division(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        int len = 0;
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] / arr2[i];
            System.out.println(arr3[i]);
        }

        return arr3;
    }
}
