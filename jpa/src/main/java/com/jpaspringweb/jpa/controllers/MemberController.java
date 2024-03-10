package com.jpaspringweb.jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.jpaspringweb.jpa.model.Members;
import com.jpaspringweb.jpa.services.MembersService;

@Controller
public class MemberController {

    @Autowired
    private MembersService membersService;

    public MemberController(MembersService membersService) {
        this.membersService = membersService;
    }
     
    @GetMapping("/addmember")
    public String addmember(){
        return "addMemberForm.jsp";

    }

    @PostMapping("/addmemberlib")
    public String addLibraryMember(Members members)
    {    
          membersService.saveMember(members);
          System.out.println("new member added succuessfully");
         return "memberaddSuccess.jsp";
    }

    @GetMapping("/Searchmember")
    public String searchonMember()
    {
     return"MemberSearchform.jsp";
    }

    @PostMapping("/MemberSearch")
    public ModelAndView MemberSearch(String name){
       ModelAndView mv=new ModelAndView();
       List<Members> listmember = membersService.findByMember(name);
       System.out.println(listmember.size());
       mv.addObject("listmember", listmember);
       mv.setViewName("searchOnMember.jsp");
      return mv;  
   }
     
   @GetMapping("/SearchmemberByYear")
   public String SearchmemberByYear(){
    return"SearchmemberByYearForm.jsp";
   }

   @PostMapping("/MemberSearchbyJoinyear")
    public ModelAndView MemberSearchbyJoinyear(@RequestParam int joinYear ){
        ModelAndView modelAndView = new ModelAndView();
        List<Members> lstbyYr = membersService.findByjoinYear(joinYear);
        System.out.println(lstbyYr.size());
        modelAndView.addObject("lstbyYr",lstbyYr);
        modelAndView.setViewName("SearchViewByYear.jsp");
        return modelAndView;

    }

   }


