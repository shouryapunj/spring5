package hello;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private int x,y,res;

    private char op;
    public void setXY(int x, int y, char op){
        this.x=x;
        this.y=y;
        this.op=op;
    }

    public int getRes(){
        if(op == '+') res = x+y;
        else if(op == '-') res = x-y;
        else if(op == '*') res = x*y;
        else if(op == '/') res = x/y;
        else return 0;
//        System.out.println("Result :" + res);
        return res;
    }
}
