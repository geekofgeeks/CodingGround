import java.util.*;

public class codeSnippets {

    public void printNto1ByBacktrack(int i, int n) {
        if (i > n)
            return;
        else {
            printNto1ByBacktrack(i + 1, n);
            System.out.println(i);
        }
    }

    public int sumOfFirstNNumbers(int n) {
        if (n == 0)
            return 0;
        return n + sumOfFirstNNumbers(n - 1);
    }

    public int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public int[] reverseArray(int[] arr) {
        if (arr.length == 0 || arr.length == 1)
            return arr;
        return reverseArray(arr, 0, arr.length - 1);
    }

    public int[] reverseArray(int[] arr, int i, int j) {
        if (i >= j)
            return arr;
        swap(arr, i, j);
        return reverseArray(arr, i + 1, j - 1);
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1)
            return true;
        return isPalindrome(str, 0, str.length() - 1);
    }

    public boolean isPalindrome(String str, int i, int j) {
        if (i > (str.length()) / 2)
            return true;
        return str.charAt(i) == str.charAt(j) && isPalindrome(str, i + 1, j - 1);
    }

    public int fibonacciNumber(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

    public int sumOfFirstNFibonacciNumbers(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibonacciNumber(n) + sumOfFirstNFibonacciNumbers(n - 1);
    }

    public List<String> printAllSubsequences(char[] str) {
        if (str.length == 0)
            return Collections.emptyList();
        ArrayList<String> forLoopResult = new ArrayList<String>();
        ArrayList<String> recursiveResult = new ArrayList<String>();
        forLoopResult.add("forLoopResult :");
        printAllSubsequencesWithForLoopAndRecursion(0, str, forLoopResult, "");
        printAllSubsequencesWithRecursion(0, str, recursiveResult, "");
        forLoopResult.add("recursiveResult :");
        forLoopResult.addAll(recursiveResult);
        return forLoopResult ;
    }

    public void printAllSubsequencesWithForLoopAndRecursion(int index, char[] str, List<String> list, String answer) {
        list.add(answer);
        for (int i = index; i < str.length; i++)
            printAllSubsequencesWithForLoopAndRecursion(i + 1, str, list, answer + str[i]);
    }

    public void printAllSubsequencesWithRecursion(int index, char[] str, List<String> list, String answer) {
        if (index == str.length)
            list.add(answer);
        else {
            printAllSubsequencesWithRecursion(index + 1, str, list, answer + str[index]);
            printAllSubsequencesWithRecursion(index + 1, str, list, answer);
        }
    }

    public int[] mergeSort(int[] arr){
        if (arr == null || arr.length <= 1)
            return arr;
        mergeSort(arr, 0, arr.length-1);
        return arr;
    }

    public void mergeSort(int[] arr, int start, int end){
        if(start >= end)
            return;
        int mid = (start + end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
        
    }

    public void merge(int[] arr, int start, int mid, int end){
        if(end > start){
            int[] temp = new int[end-start + 1];
            int pos = 0;
            int left = start;
            int right = mid+1;

            while(left <= mid && right <= end){
                if(arr[left] <= arr[right]){
                    temp[pos] = arr[left];
                    left++;
                }
                else{
                    temp[pos] = arr[right];
                    right++;
                }
                pos++;
            }
            if(left <= mid){
                while(left <= mid && pos <= end-start){
                    temp[pos] = arr[left];
                    left++;
                    pos++;
                }
            }
            if(right <= end){
                while(right <= end && pos <= end-start){
                    temp[pos] = arr[right];
                    right++;
                    pos++;
                }
            }

            pos = 0;
            while(start <= end){
                arr[start] = temp[pos];
                pos++;
                start++;
            }
        }
    }

    public int[] quickSort(int[] arr){
        if (arr == null || arr.length <= 1)
            return arr;
        quickSort(arr, 0, arr.length-1);
        return arr;
    }

    public void quickSort(int[] arr, int start, int end){
        if(start < end){
            // System.out.println(start + ""  + end);
            
            int[] temp = new int[end-start + 1];
            int pivot = arr[start];
            int pos = start + 1;
            int left = 0;
            int right = end-start;
            while(pos <= end){
                if(arr[pos] <= pivot){
                    temp[left] = arr[pos];
                    left++;
                }
                else{
                    temp[right] = arr[pos];
                    right--;
                }
                pos++;
            }
            temp[left] = pivot;

            // System.out.println(Arrays.toString(temp));

            pos = 0;
            while(pos <= end-start){
                arr[start+pos] = temp[pos];
                pos++;
            }

            // System.out.println( left +  "" + right);

            quickSort(arr, start, start + (left-1));
            quickSort(arr, start + (right+1) , end);
        }
    }

    public ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target){
        ArrayList<ArrayList<Integer>> finalResult = new ArrayList<ArrayList<Integer>>();
        // combinationSumWithRepeat(0, arr, target, new ArrayList<Integer>(), finalResult);
        combinationSumWithoutRepeat(0, arr, target, new ArrayList<Integer>(), finalResult);

        return finalResult;
    }

    public void combinationSumWithRepeat(int index, int[] arr, int target, ArrayList<Integer> storage, ArrayList<ArrayList<Integer>> res){
        if(index == arr.length){
            if(target == 0)
                res.add(new ArrayList<>(storage));
            return;
        }
        if(target >= arr[index]) {
            storage.add(arr[index]);
            combinationSumWithRepeat(index, arr, target-arr[index], storage, res);
            storage.remove(storage.size()-1);
        }
        combinationSumWithRepeat(index+1, arr, target, storage, res);
    }

      public void combinationSumWithoutRepeat(int index, int[] arr, int target, ArrayList<Integer> storage, ArrayList<ArrayList<Integer>> res){
        if(index == arr.length){
            if(target == 0)
                res.add(new ArrayList<>(storage));
            return;
        }
        if(target >= arr[index]) {
            storage.add(arr[index]);
            combinationSumWithoutRepeat(index+1, arr, target-arr[index], storage, res);
            storage.remove(storage.size()-1);
        }
        combinationSumWithoutRepeat(index+1, arr, target, storage, res);
    }

    public List<Integer> subsetSum(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        subsetSum(arr, 0, 0, res);
        return res;    
    }

    public void subsetSum(int[] arr, int index, int sum, ArrayList<Integer> res){
        if(index == arr.length){
            res.add(sum);
            return;    
        }
        sum = sum + arr[index];
        subsetSum(arr, index+1, sum, res);
        sum = sum - arr[index];
        subsetSum(arr, index+1, sum, res);
    }
    
} 