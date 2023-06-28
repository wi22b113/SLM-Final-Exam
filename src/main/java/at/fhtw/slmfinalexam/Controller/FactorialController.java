package at.fhtw.slmfinalexam.Controller;


import at.fhtw.slmfinalexam.Total.Total;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    static Total t = new Total();

    @RequestMapping("api/factorial/total")
    public static long getTotal(){
        return t.getTotal();
    }

    @RequestMapping("api/factorial")
    public static int calcFactorial(@RequestParam int number){
        int result = 1;
        int total = t.getTotal();
        for(int i = number; i>=1;i--){
            result *= i;
        }
        int newtotal = total + result;
        t.setTotal(newtotal);
        return result;
    }

}


