class Operators{
    public static void main(String[] args) {
        int z=8;
        int a= z++ + ++z;
        int b= z-- + --z;
        int c= z++;
        int d=++z;
        int e=z--;
        int f=--z;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}