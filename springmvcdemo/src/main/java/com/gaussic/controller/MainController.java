package com.gaussic.controller;
import java.util.List;
import com.gaussic.model.YmtAbroadFundAccountEntity;
import com.gaussic.repository.AbroadFundAccountRepository;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.awt.print.Pageable;

/**
 * Created by huwenjing on 2017/3/17.
 */
@Controller
public class MainController {

    @Autowired
    AbroadFundAccountRepository accountRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value="/admin/abroadfundaccounts",method = RequestMethod.GET)
    public String getAbroadFundAccounts(ModelMap modelMap){
        List<YmtAbroadFundAccountEntity> accountList = accountRepository.findAll();

        modelMap.addAttribute("accountList",accountList);

        return "admin/abroadfundaccounts";
    }

    @RequestMapping(value = "/admin/abroadfundaccounts/add",method= RequestMethod.GET)
    public String addUser(){
        return "admin/addabroadfundaccounts";
    }

    @RequestMapping(value="/admin/abroadfundaccounts/addAcc",method = RequestMethod.POST)
    public String addAccPost(@ModelAttribute("account")YmtAbroadFundAccountEntity accountEntity){
        accountRepository.saveAndFlush(accountEntity);
        return "redirect:/admin/abroadfundaccounts";
    }

    @RequestMapping(value="/admin/abroadfundaccounts/delete/{id}",method = RequestMethod.GET)
    public String deleteAcc(@PathVariable("id") String accountId ){
        accountRepository.delete(accountId);
        accountRepository.flush();

        return "redirect:/admin/abroadfundaccounts";
    }

}