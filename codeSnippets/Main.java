// import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception { 

        {
        // target sum set 1d array
        
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
        //     arr[i] = Integer.parseInt(br.readLine());
        // }

        // int tar = Integer.parseInt(br.readLine());
        
        // int[] dp = new int[tar+1];
        
        // dp[0] = 1;
        
        // for(int i=0; i<arr.length; i++){
        //     for(int j=tar; j>=arr[i]; j--){
        //         if(dp[j-arr[i]] > 0)
        //            dp[j] = dp[j] + dp[j-arr[i]];
        //         for(int k=0; k<=tar; k++){
        //             System.out.print(dp[k]);
        //         }
        //         System.out.println( "-" +arr[i]);
        //     }
        // }
        // for(int j=0; j<=tar; j++){
        //     // System.out.print(arr[j]);
        //     System.out.print(dp[j]);
        // }
        }

        {
        // class Main {

        // // public static void main(String[] args) throws Exception {
        // // Scanner scn = new Scanner(System.in);
        // // int n = scn.nextInt();
        // // int m = scn.nextInt();

        // // ArrayList< String> paths = getMazePaths(1, 1, n, m);

        // // System.out.println(paths);
        // // scn.close();

        // public static void main(String[] args) throws Exception {
        // Scanner scn = new Scanner(System.in);
        // String str = scn.next();
        // printPermutations(str, "");
        // }

        // // sr - source row
        // // sc - source column
        // // dr - destination row
        // // dc - destination column
        // public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc)
        // {

        // if (sr > dr || sc > dc)
        // return new ArrayList<String>();

        // if (sr == dr && sc == dc) {
        // ArrayList<String> res = new ArrayList<String>();
        // res.add("");
        // return res;
        // }

        // ArrayList<String> p1 = getMazePaths(sr + 1, sc, dr, dc);
        // ArrayList<String> p2 = getMazePaths(sr, sc + 1, dr, dc);
        // ArrayList<String> p3 = getMazePaths(sr+1, sc+1, dr, dc);

        // ArrayList<String> finalRes = new ArrayList<String>();

        // for (String hpath : p2) {
        // finalRes.add("h" + hpath);
        // }

        // for (String vpath : p1) {
        // finalRes.add("v" + vpath);
        // }

        // for (String dpath : p3) {
        // finalRes.add("d" + dpath);
        // }

        // return finalRes;

        // }

        // public static void printPermutations(String str, String asf) {

        // if(str.length() == 0)
        // return;

        // for(int i=0; i<str.length(); i++){
        // char cc = str.charAt(i);
        // String ros = str.substring(i+1, str.length()-1);

        // System.out.println(printPermutations(ros, asf+cc));
        // System.out.println(printPermutations(ros, cc+asf));

        // }

        // }

        // // public static void main(String[] args) {
        // // Scanner scn = new Scanner(System.in);
        // // int n = scn.nextInt();
        // // int m = scn.nextInt();
        // // int[][] cost = new int[n][m];
        // // for (int i = 0; i < n; i++) {
        // // for (int j = 0; j < m; j++) {
        // // cost[i][j] = scn.nextInt();
        // // }
        // // }
        // // scn.close();

        // // System.out.println(minCostMazeTraversal(new int[n][m], cost, n-1, m-1,
        // n-1,
        // // m-1));
        // // }

        // // public static void main(String[] args) throws Exception {
        // // Scanner scn = new Scanner(System.in);
        // // String str = scn.next();
        // // String res = new String();
        // // printSS(str, res);
        // // System.out.println(res);
        // // }

        // // public static void main(String[] args) throws Exception {
        // // Scanner scn = new Scanner(System.in);
        // // String str = scn.next();
        // // ArrayList<String> words = getKPC(str);
        // // System.out.println(words);
        // // scn.close();
        // // }

        // // static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs",
        // "tu", "vwx", "yz" };

        // // public static ArrayList<String> getKPC(String str) {

        // // if (str.length() == 0) {
        // // ArrayList<String> bres = new ArrayList<>();
        // // bres.add("");
        // // return bres;
        // // }

        // // char ch = str.charAt(0);
        // // String ros = str.substring(1);
        // // ArrayList<String> rres = getKPC(ros);
        // // ArrayList<String> mres = new ArrayList<>();

        // // String codeforch = codes[ch - 0];

        // // for (int i = 0; i < codeforch.length(); i++) {
        // // char chcode = codeforch.charAt(i);
        // // for (String val : rres) {
        // // mres.add(chcode + val);
        // // }
        // // }
        // // return mres;

        // // }

        // // public static void printSS(String str, String ans) {
        // // if (str.length() == 0) {
        // // ans = str;
        // // }
        // // else{
        // // char character = str.charAt(0);
        // // if (str.substring(1) != null)
        // // printSS(str.substring(1), ans);
        // // else
        // // printSS("", ans);

        // // String[] result = ans.split(",");
        // // for (String subSequenceString : result) {
        // // ans.concat("" + ans +",");
        // // }
        // // for (String subSequenceString : result) {
        // // ans.concat(character + ans + ",");
        // // }
        // // }
        // // }

        // // public static void main(String[] args) throws Exception {
        // // Scanner scn = new Scanner(System.in);
        // // String str = scn.next();
        // // ArrayList<String> res = gss(str);
        // // System.out.println(res);
        // // }

        // // public static ArrayList<String> gss(String str) {
        // // if(str.equalsIgnoreCase("")){
        // // ArrayList<String> result = new ArrayList<String>();
        // // result.add(str);
        // // return result;
        // // }
        // // char character = str.charAt(0);
        // // ArrayList<String> subSequenceStrings = new ArrayList<>();
        // // if(str.substring(1) != null)
        // // subSequenceStrings = gss(str.substring(1));
        // // else
        // // subSequenceStrings = gss("");
        // // ArrayList<String> finalSubSequenceStrings = new ArrayList<String>();
        // // for(String subSequenceString : subSequenceStrings){
        // // finalSubSequenceStrings.add(character+subSequenceString);
        // // finalSubSequenceStrings.add("-"+subSequenceString);
        // // }
        // // return finalSubSequenceStrings;
        // // }

        // // public static int minCostMazeTraversal(int[][] dp, int[][] cost, int dr,
        // int
        // // dc, int i, int j) {
        // // for (; i >= 0; i--) {
        // // for (; j >= 0; j--) {
        // // if (i == dr && j < dc)
        // // dp[i][j] = cost[i][j] + cost[i][j+1];
        // // if (j == dc && i < dc)
        // // dp[i][j] = cost[i][j] + cost[i+1][j];
        // // if (i == dr && j == dc)
        // // dp[i][j] = cost[i][j];
        // // else
        // // dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j]);
        // // }
        // // }
        // // return dp[0][0];
        // // }

        // // public static ArrayList<String> getMazePaths(int i, int j, int m, int n) {
        // // if(i == m){
        // // ArrayList<String> returnPath = new ArrayList<>();
        // // for(int k = n; k>j; k--){
        // // if(returnPath.size() == 0)
        // // returnPath.add("h");
        // // else
        // // returnPath.set(0,returnPath.get(0)+"h");
        // // }
        // // return returnPath;
        // // }
        // // if(j == n){
        // // ArrayList<String> returnPath = new ArrayList<>();
        // // for(int k = m; k>i; k--){
        // // if(returnPath.size() == 0)
        // // returnPath.add("v");
        // // else
        // // returnPath.set(0,returnPath.get(0)+"v");
        // // }
        // // return returnPath;
        // // }

        // // ArrayList<String> totalPaths = new ArrayList<>();
        // // ArrayList<String> horizontalMovePaths = getMazePaths(i, j+1, m, n);
        // // ArrayList<String> verticalMovePaths = getMazePaths(i+1, j, m, n);
        // // for(String path: horizontalMovePaths ){
        // // totalPaths.add("h"+path);
        // // }

        // // for(String path: verticalMovePaths ){
        // // totalPaths.add("v"+path);
        // // }
        // // return totalPaths;
        // // }

        // // public static int countPaths() {
        // // int n = 10;
        // // int[] arr = new int[]{ 3,3,0,2,1,2,4,2,0,0 } ;
        // // Integer[] dp = new Integer[n + 1];
        // // dp[n] = 0;
        // // for (int i = n - 1; i >= 0; i--) {
        // // int moves = Integer.MAX_VALUE;
        // // for (int j = 1; j <= arr[i] && (i + j) <= n; j++) {
        // // moves = Math.min(moves, dp[i + j]);
        // // }
        // // dp[i] = moves;
        // // }
        // // return dp[0];
        // // }

        // }
        }

        //     Leetcode obj = new Leetcode();

//     BinaryTreeProb binaryTree = new BinaryTreeProb();

//     // binaryTree.sumRootToLeaf([1,0,1,0,1,0,1]);  
    
//     // System.out.println(obj.countVowelStrings(33));

//     // System.out.println(obj.countSquares());

//     // int[] int_1d_array = new int[]{ 5,3,4,4,7,3,6,11,8,5,11 }; 

//     // int[][] int_2d_array = {  {1,1,1,-1,-1}, {1,1,1,-1,-1}, {-1,-1,-1,1,1},  {1,1,1,1,-1},  {-1,-1,-1,-1,-1} };

//     // System.out.println(obj.numTeams(intArray));
    
//     // System.out.println(Arrays.toString(obj.findBall_bottom_column(int_2d_array)));

//     // System.out.println(obj.numDecodings("06"));


        // <============================================>
        
        codeSnippets codeSnippets = new codeSnippets();

        // codeSnippets.printNto1ByBacktrack(1,5);   

        // System.out.println(codeSnippets.sumOfFirstNNumbers(5));

        // System.out.println(codeSnippets.factorial(5));

        int[] arr = new int[]{3,2,5,1,4};

        // int[] arr = new int[]{3,2};

        // System.out.println(Arrays.toString(codeSnippets.reverseArray(arr)));

        // String str = "abccba";
        // String str = "abcdacba";

        // System.out.println(codeSnippets.isPalindrome(str));

        // System.out.println(codeSnippets.fibonacciNumber(5));

        // System.out.println(codeSnippets.sumOfFirstNFibonacciNumbers(5));

        // char[] arr = new char[]{'3','1','2'};

        // System.out.println(Arrays.toString(codeSnippets.printAllSubsequences(arr).toArray()));

        // System.out.println(Arrays.toString(codeSnippets.mergeSort(arr)));

        // System.out.println(Arrays.toString(codeSnippets.quickSort(arr)));

        System.out.println(codeSnippets.combinationSumWithRepeat(arr, 7));
    }

}

