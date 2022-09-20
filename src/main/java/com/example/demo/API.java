package com.example.demo;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class API {
    @RequestMapping(path = "/plus/{n1}/{n2}", method = RequestMethod.GET)
    public String myPlus(@PathVariable("n1") double n1, @PathVariable("n2") double n2){
        double v = n1+n2;
        String s = String.valueOf(v);
        return s;
    };
    @RequestMapping(path = "/minus/{n1}/{n2}", method = RequestMethod.GET)
    public String myMinus(@PathVariable("n1") double n1, @PathVariable("n2") double n2){
        double v = n1-n2;
        String s = String.valueOf(v);
        return s;
    }
    @RequestMapping(path = "/divide/{n1}/{n2}", method = RequestMethod.GET)
    public String myDivide(@PathVariable("n1") double n1, @PathVariable("n2") double n2){
        double v = n1*n2;
        String s = String.valueOf(v);
        return s;
    }
    @RequestMapping(path = "/multi/{n1}/{n2}", method = RequestMethod.GET)
    public String myMulti(@PathVariable("n1") double n1, @PathVariable("n2") double n2){
        double v = n1/n2;
        String s = String.valueOf(v);
        return s;
    }
    @RequestMapping(path = "/mod/{n1}/{n2}", method = RequestMethod.GET)
    public String myMod(@PathVariable("n1") double n1, @PathVariable("n2") double n2){
        double v = n1%n2;
        String s = String.valueOf(v);
        return s;
    }
    @RequestMapping(path = "/max", method = RequestMethod.POST)
    public String myMax(@RequestBody MultiValueMap<String, String> n){
        Map<String, String> d = n.toSingleValueMap();
        if(Double.parseDouble(d.get("n1")) > Double.parseDouble(d.get("n2"))){
            return d.get("n1");
        }else{
            return d.get("n2");
        }
    }
}
