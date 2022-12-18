package com.calculator2.calculator2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Calculator2Controller {


    @GetMapping("/calculator2")
    public Calculator2 calculator2(@RequestParam (value="max",defaultValue = "1000") Integer max,
                                   @RequestParam(value = "divisor",defaultValue = "7")Integer divisor,
            @RequestParam(value = "limit",defaultValue = "3") Integer limit) {
            ArrayList<Integer> myArray = new ArrayList<Integer>();
        ArrayList array = new ArrayList();
        int resultIndex = 0;

        for (int i=1;i<max;i++) {
            if (i % divisor == 0) {
                myArray.add(i);
                resultIndex=myArray.size();
            }
        }
        for (int n = 1; n <=limit; n++) {
            array.add(" I am " +(myArray.get(resultIndex - n) + 2));

    }
       return new Calculator2 ( String.format(String.valueOf(array)));
    }

}