package com.kingfly.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kingfly.domain.Shseat;
import com.kingfly.service.IShseatService;

@Controller  
@RequestMapping("/seat")
public class ShseatController {
	@Resource  
    private IShseatService shseatService;  
      
    @RequestMapping("/showSeat")  
    public String toIndex(HttpServletRequest request,Model model){  
    	String seatNO= request.getParameter("seatNO");  
        Shseat seat = this.shseatService.getShseatByShSeatNo(seatNO); 
        model.addAttribute("seat", seat);  
        return "showSeat";  
    } 
}
