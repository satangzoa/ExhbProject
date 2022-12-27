package com.ExhbPJ.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ExhbPJ.dto.MemberForm;
import com.ExhbPJ.service.RvMemberService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {

	private final RvMemberService rvMemberService;
	
	@RequestMapping(value = "/")
	public String home() {
		
		return "redirect:index";
	}
	
	
	@RequestMapping(value = "/index")
	public String index() {
		
		 
		
		return "index";
	}
	
	
	 


	@RequestMapping(value = "/join")
		public String join(MemberForm memberForm) {
					
			return "join_form";
		}
		
	@PostMapping(value = "/joinOk")
		public String joinOk(@Valid MemberForm memberForm, BindingResult bindingResult) {
			
			if(bindingResult.hasErrors()) {
				return "join_form";
			}
			
			
			try {
				rvMemberService.memberCreate(memberForm.getMuserid(), memberForm.getMusername(), memberForm.getMpw(), memberForm.getMemail());
			}catch(Exception e){
				e.printStackTrace();
				bindingResult.reject("joinFail", "이미 등록된 아이디입니다.");
				return "join_form";
			}
			return "redirect:index";
		}
		
}

