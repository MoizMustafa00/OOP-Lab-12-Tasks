package Lab12_Tasks;

public class Task1 {

    public void calculateAverage(String[] list) {
        try{
            if(list == null) {
                throw new NullPointerException();
            }
            if(list.length == 0) {
                throw new IndexOutOfBoundsException();
            }

        }
        catch (NullPointerException e) {
            System.out.println("List is NULL");
            return;
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("List is Empty");
            return;
        }

        double sum = 0;
        int validInt = 0;
        for(int i=0; i< list.length; i++) {
            try {
                int number = Integer.parseInt(list[i]);
                sum += number;
                validInt++;
            }
            catch (NumberFormatException e) {
                System.out.println("Skipping Invalid Integer: " + list[i]);
            }
        }

        try {
            if(validInt == 0) {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("No Valid Integers in the List");
            return;
        }

        double avg = sum / validInt;
        System.out.println("Average = " + avg);
    }

    public static void main(String[] args) {
        Task1 t = new Task1();
        String[] list1 = new String[] {"10", "20", "30", "40", "50"};
        String[] list2 = new String[] {"10", "abc", "30", "xyz", "50"};
        String[] list3 = new String[] {"abc", "xyz", "hello", "!@#"};
        String[] list4 = new String[] {};
        String[] list5 = new String[] {null};

        t.calculateAverage(list1);
        System.out.println();
        t.calculateAverage(list2);
        System.out.println();
        t.calculateAverage(list3);
        System.out.println();
        t.calculateAverage(list4);
        System.out.println();
        t.calculateAverage(list5);

    }
}
