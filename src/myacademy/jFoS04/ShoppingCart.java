package myacademy.jFoS04;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        
        // Get the index of the space character (" ") in custName.
        spaceIdx = custName.indexOf(" ");
        System.out.println(spaceIdx);


        // Use the substring method parse out the first name and print it.
        firstName = custName.substring(0,spaceIdx);
        System.out.println(firstName);


    }

    
}
