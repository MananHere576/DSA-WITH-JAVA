class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ns = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                ns.add("FizzBuzz");
            }
            else if(i%3==0 && i%5!=0)
            {
                ns.add("Fizz");
            }
            else if(i%3!=0 && i%5==0)
            {
                ns.add("Buzz");
            }
            else 
            ns.add(String.valueOf(i));

        }
        return ns;
    }
}