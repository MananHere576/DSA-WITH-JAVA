class Solution {
    public char nextGreatestLetter(char[] arr, char t) {
        return recursiveSearch(arr, t, 0, arr.length - 1);
    }
    private char recursiveSearch(char[] arr, char t, int start, int end) {
    if (start > end) {
      return arr[start % arr.length];
    }
    int mid = start + (end - start) / 2;
    if (arr[mid] == t && t == arr[(mid + 1) % arr.length]) return recursiveSearch(arr, t, mid + 1, end);
    if (t > arr[mid]) return recursiveSearch(arr, t, mid + 1, end);
    if (t < arr[mid]) return recursiveSearch(arr, t, start, mid - 1);
    return arr[(mid + 1) % arr.length];
  }
}