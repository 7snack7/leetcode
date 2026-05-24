public class Solution28 {
    public static void main(String[] args) {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        long startTime = System.nanoTime();
        
        System.out.println(strStr(haystack1, needle1));
        
        long endTime = System.nanoTime();
        long executionTimeNano = endTime - startTime;
        double executionTimeMs = executionTimeNano / 1_000_000.0;
        System.out.println("Время выполнения java: " + executionTimeMs + " мс");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        startTime = System.nanoTime();
        
        System.out.println(strStrAlgo(haystack1, needle1));
        
        endTime = System.nanoTime();
        executionTimeNano = endTime - startTime;
        executionTimeMs = executionTimeNano / 1_000_000.0;
        System.out.println("Время выполнения алгоритм: " + executionTimeMs + " мс");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        
        // ----------------------------------------------------------------------------------------------------------------------------------------
        
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        startTime = System.nanoTime();
        
        System.out.println(strStr(haystack2, needle2));
        
        endTime = System.nanoTime();
        executionTimeNano = endTime - startTime;
        executionTimeMs = executionTimeNano / 1_000_000.0;
        System.out.println("Время выполнения java: " + executionTimeMs + " мс");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        startTime = System.nanoTime();
        
        System.out.println(strStrAlgo(haystack2, needle2));
        
        endTime = System.nanoTime();
        executionTimeNano = endTime - startTime;
        executionTimeMs = executionTimeNano / 1_000_000.0;
        System.out.println("Время выполнения алгоритм: " + executionTimeMs + " мс");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
       
        // ----------------------------------------------------------------------------------------------------------------------------------------

        String haystack3 = "aaaaaaaaab";
        String needle3 = "aaaab";
        startTime = System.nanoTime();
        
        System.out.println(strStr(haystack3, needle3));
        
        endTime = System.nanoTime();
        executionTimeNano = endTime - startTime;
        executionTimeMs = executionTimeNano / 1_000_000.0;
        System.out.println("Время выполнения java: " + executionTimeMs + " мс");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        startTime = System.nanoTime();
        
        System.out.println(strStrAlgo(haystack3, needle3));
        
        endTime = System.nanoTime();
        executionTimeNano = endTime - startTime;
        executionTimeMs = executionTimeNano / 1_000_000.0;
        System.out.println("Время выполнения алгоритм: " + executionTimeMs + " мс");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
    
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static int strStrAlgo(String haystack, String needle) {
        int n = haystack.length();
        int k = needle.length();
        int i = 0;
        while (i<n-k+1) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 1;
                while (i+j<n && j<k && haystack.charAt(i+j) == needle.charAt(j)) {
                    j++;
                }
                if (j==k) return i;
            }
            i++;
        }
        return -1;
    }
}
