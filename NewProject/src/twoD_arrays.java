public class twoD_arrays {
    public static void main(String[] args){
        // 2D arrays - An Array where each element is an array,
        //             it's useful for storing a matrix of data.

        String[] fruits = {"Apple", "mango", "orange", "graps"};
        String[] vegetables ={"Potato", "onion", "coriander", "corrot", "tomato", "Garlic"};
        String[] meats = {"Chiken", "Moton", "fish"};

        String[][] Groceries = {fruits, vegetables, meats};

        // To replace any element

        Groceries[0][0] = "Pineapple"; //replace apple by pineapple
                                      // [0]-1st array | [0]position of that element in array




        for(String[] food:Groceries){
            for (String foods: food){
                System.out.print(foods+ " ");

            }
            System.out.println();
        }
    }
}
