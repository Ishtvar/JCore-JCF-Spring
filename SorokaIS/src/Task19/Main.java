package Task19;

public class Main {
    public static void main(String[] args) {

        System.out.println("Making new container with 1 element");
        Container container1 = new Container(2);
        System.out.println(container1);
        System.out.println();
        System.out.println("Adding an elements");
        container1.add(5);
        System.out.println(container1);
        System.out.println("one more");
        container1.add(3);
        System.out.println(container1);
        System.out.println();

        System.out.println("Checking if container contains element 3");
        if (container1.contains(3)) {
            System.out.println("There is such element in container");
        } else {
            System.out.println("There is no such element");
        }
        System.out.println("Checking if container contains element 6");
        if (container1.contains(6)) {
            System.out.println("There is such element in container");
        } else {
            System.out.println("There is no such element");
        }
        System.out.println();

        System.out.println("Creating another container");
        int[] arr = new int[]{9, 7, 11};
        Container container2 = new Container(arr);
        System.out.println(container2);
        System.out.println("Adding all elements from the second container to the first");
        container1.addAll(container2);
        System.out.println(container1);
        System.out.println();

        System.out.println("Creating another container");
        Container container3 = new Container(container1);
        System.out.println(container3);
        System.out.println("Checking if the third is equal to the first");
        if (container1.equals(container3)) {
            System.out.println("These containers are equal");
        } else {
            System.out.println("These containers are not equal");
        }
        System.out.println("Checking if the second is equal to the first");
        if (container1.equals(container2)) {
            System.out.println("These containers are equal");
        } else {
            System.out.println("These containers are not equal");
        }
        System.out.println();

        System.out.println("Clearing third container");
        container3.clear();
        System.out.println(container1 + " first");
        System.out.println(container2 + " second");
        System.out.println(container3 + " third");
        System.out.println();

        System.out.println("Getting an index of element 9 from the first container");
        System.out.println(container1.indexOf(9));
        System.out.println("Getting an index of element 13 from the first container");
        System.out.println(container1.indexOf(13));
        System.out.println();

        System.out.println("Getting a size of the first container");
        System.out.println(container1.getSize());
        System.out.println();

        System.out.println("Sorting the first container");
        container1.sort();
        System.out.println(container1);
    }
}
