package com.offcn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.offcn.model.Mobile;
import com.offcn.service.MobileService;

@Controller
public class MobileController {

	@Autowired
	private MobileService mobileService;
	
	@RequestMapping("/getByNum")
	public String getByNum(@RequestParam(value="number") String number,Model model){
		Mobile mobile = mobileService.getByNum(number);
		if(mobile!=null){
			model.addAttribute("msg", number+"\t 归属地为:"+mobile.getMobileArea()+"\t 手机卡类型:"+mobile.getMobileType());
		}else{
			model.addAttribute("msg", "号码在号段库暂时不存在");
		}
		return "phone";
	}
	
}
