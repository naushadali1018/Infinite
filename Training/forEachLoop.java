package Training;

public class forEachLoop {
    public static void main(String[] args) {
        int[] numbers = {68,79,86,99,23,2,41,100};
        int sum=0;

        //for-each loop (Enhanced for Loop)
        for(int number:numbers) {
            if(number%2==0)
                sum+=number;
        }

        // Uncomment the below given code and execute it instead of above loop
        // for understanding the usage of var in a for-each loop
		/*
		for(var number:numbers) {
			if(number%2==0)
				sum+=number;
		}*/

        // The local variable used in the for-each loop is declared using var
        // type of that variable will be inferred based on the values inside the array

        System.out.println("Sum of even numbers: "+sum);
    }
}
