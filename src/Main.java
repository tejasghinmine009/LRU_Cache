import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please give capacity of cache");
        int cap = Integer.parseInt(br.readLine());
        LRUCache<Integer> cache = new LRUCache<>(cap);

        int choice = 1;
        while(choice!=0){
            System.out.println("1: Put\n2: Get\n0: Exit");
            choice = Integer.parseInt(br.readLine());
            String key;
            int value;
            switch (choice){
                case 1:
                    System.out.println("Enter Key");
                    key = br.readLine();
                    System.out.println("Enter Value");
                    value = Integer.parseInt(br.readLine());
                    cache.put(key,value);
                    System.out.println("Inserted\n");
                    break;

                case 2:
                    System.out.println("Enter Key");
                    key = br.readLine();
                    System.out.println("value is : "+ cache.get(key).toString() + "\n");
                    break;

                default:
                    System.out.println("Invalid Input\n");
            }

        }

    }
}
