package controller;

import entity.po.AWSellerGradePo;
import org.springframework.web.bind.annotation.*;
import repository.AWSellerGradeRepository;

import java.awt.*;
import java.util.List;
/**
 * Created by huwenjing on 2017/4/11.
 */
@RestController
public class OperateController {
    @RequestMapping(value="/operate/awSellerGradeAdd",method = RequestMethod.POST,produces={"application/json"},consumes={"application/json"})
    @ResponseBody
    public boolean awSellerGradeAdd(@RequestBody AWSellerGradePo grade){
        new AWSellerGradeRepository().AddGrade(grade);
        return true;
    }

    @RequestMapping(value="/operate/awSellerGradeUpdate",method = RequestMethod.POST,produces={"application/json"},consumes={"application/json"})
    @ResponseBody
    public boolean awSellerGradeUpdate(@RequestBody AWSellerGradePo grade){
        new AWSellerGradeRepository().updateGrade(grade);
        return true;
    }

    @RequestMapping(value="/operate/awSellerGradeDelete",method = RequestMethod.POST)
    @ResponseBody
    public boolean awSellerGradeDelete(String gradeId){
        new AWSellerGradeRepository().deleteGrade(gradeId);
        return true;
    }
}
