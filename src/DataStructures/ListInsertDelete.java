package DataStructures;

public class ListInsertDelete {
    public static void main(String[] args) {
        // given a list L, of N integers, perform Q queries on the list
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        
        java.util.ArrayList<Integer> L = new java.util.ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            L.add(sc.nextInt());
        }
        
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            String query = sc.next();
            if (query.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                L.add(x, y);
            } else if (query.equals("Delete")) {
                int x = sc.nextInt();
                L.remove(x);
            }
        }
        
        for (int i = 0; i < L.size(); i++) {
            System.out.print(L.get(i) + " ");
        }
        
        sc.close();
    }
}
