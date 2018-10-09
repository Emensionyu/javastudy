package Àà;

class structdemo {
int n;
int m;
public int sum(int n,int m) {
	return m+n;
}
public int sum(int n,int m,int x) {
	return m+n+x;
}

public static void main(String[] args) {
	structdemo s=new structdemo();
	System.out.println(s.sum(10,20));
	System.out.println(s.sum(10,20,10));
	
}}