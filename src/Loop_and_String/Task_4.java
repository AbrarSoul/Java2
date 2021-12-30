package Loop_and_String;

public class Task_4 {
    public static void main(String[] args) {
        String str="1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr=(str.split(" "));
        double sharee_quantity=Double.parseDouble(arr[0]);
        double sharee_price=Double.parseDouble(arr[1]);
        double shirt_quantity=Double.parseDouble(arr[2]);
        double shirt_price=Double.parseDouble(arr[3]);
        double pant_quantity=Double.parseDouble(arr[4]);
        double pant_price=Double.parseDouble(arr[5]);
        System.out.println("Sharee price : "+sharee_price*sharee_quantity+" Tk.");
        System.out.println("Shirt price : "+shirt_price*shirt_quantity+" Tk.");
        System.out.println("Pant price : "+pant_price*pant_quantity+" Tk.");
        double total_price = (sharee_price*sharee_quantity)+(shirt_price*shirt_quantity)+(pant_price*pant_quantity);
        System.out.println("Total Price : "+total_price+" Tk.");
    }
}
