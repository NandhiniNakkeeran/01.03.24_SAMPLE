interface WildCat {
    public String addSum(int a, int b);
}

class WildCatImpl implements WildCat {
    public String addSum(int a, int b) {
        int res = a + b;
        return "Hello Wilcat " + res;
    }
}