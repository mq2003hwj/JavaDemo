package controller;

import entity.po.AWSellerGradePo;
import org.springframework.web.bind.annotation.*;
import repository.AWSellerGradeRepository;

import java.awt.*;
import java.util.List;

/**
 * Created by huwenjing on 2017/4/1.
 */
@RestController
public class QueryController {
    @RequestMapping(value="/query/awSellerGradeGet",method = RequestMethod.POST)
    @ResponseBody
    public AWSellerGradePo awSellerGradeGet(String gradeId,Integer sellerId){
        return new AWSellerGradeRepository().GetAWSellerGrade(gradeId,sellerId);
    }

    @RequestMapping(value="/query/awSellerGradeListGet",method = RequestMethod.POST)
    @ResponseBody
    public List<AWSellerGradePo> awSellerGradeListGet(Integer sellerId){
        return new AWSellerGradeRepository().GetAWSellerGradeList(sellerId);
    }
}



    //@RequestMapping("/greeting2")
    //public String greeting2(@RequestParam(value="name",defaultValue = "meiyou") String name){
    //    return name;
    //}
