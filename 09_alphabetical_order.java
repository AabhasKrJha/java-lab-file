public class stringrewrite {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a string");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        System.out.println("The string in alphabetical order is: ");
        System.out.println(ch);
    
    }
}