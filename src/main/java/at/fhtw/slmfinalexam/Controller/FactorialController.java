package at.fhtw.slmfinalexam.Controller;


import at.fhtw.slmfinalexam.Total.Total;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    static Total t = new Total();

    @RequestMapping("api/factorial/total")
    public static long calculateTotal(long zahl){
        long sum = t.getTotal() + zahl;
        t.setTotal(sum);

        return t.getTotal();
    }

}


