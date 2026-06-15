public class SearchArray {
    public static void main(String[] args) {
         
        int num[] = {45, 67, 34,67,89};
        int key = 67;

        boolean found = false;

        for(int i = 0; i < num.length; i++) {
            if(num[i] == key)
            {
                found = true;
                break;
            }
        }

        if(found) 
        {
            System.out.println("Element found in the array." + " The key is: " + key);
        } else {
            System.out.println("Element not found in the array.");
        }

    }
    
}
