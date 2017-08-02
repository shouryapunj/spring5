package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@Configuration
@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private Calculator calculator;

    @RequestMapping("/")



   // for 3 arguments total
    public Greeting greeting(@RequestParam(value="Number1", defaultValue ="0") int num1,
                             @RequestParam(value="Number2", defaultValue = "0") int num2,
                             @RequestParam(value="Operation",defaultValue="+") char op,
                             @RequestParam(value ="Result",defaultValue ="0") int res) throws Exception {
//        Calculator calculator = new Calculator();
        calculator.setXY(num1,num2,op);
        res = calculator.getRes();

        return new Greeting(counter.incrementAndGet(),num1,num2,op,res);
    }

}