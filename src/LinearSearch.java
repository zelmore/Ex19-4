// Ex19-4
// Zachary Elmore
// 11/14/16
// Searches for integers in the array

public class LinearSearch {
	
	public static void main(String[] args) {
        Integer[] list = new Integer[21];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        System.out.println(linearSearch(list, 1));
        System.out.println(linearSearch(list, 10));
        System.out.println(linearSearch(list, 15));
        System.out.println(linearSearch(list, 20));
        System.out.println(linearSearch(list, 21));//can't because the elements start
        										   // at 0
        System.out.println(linearSearch(list, 30));
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E value) {

        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(value) == 0) {
                return i;
            }
        }
        return -1;
    }
}
