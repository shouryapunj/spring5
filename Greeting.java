package hello;

public class Greeting {

    private final long id;
    private final int num1;
    private final int num2;
    private final char op;
    private final int res;


    public Greeting(long id, int num1, int num2, char op, int res) {
        this.id = id;
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
        this.res = res;

    }

    public long getId() {
        return id;
    }

    public int getnum1() {
        return num1;
    }

    public int getnum2(){
        return num2;
    }

    public char getop(){
        return op;
    }

    public int getres(){
        return res;
    }
}