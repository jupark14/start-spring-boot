package org.blueissac.controller;

import org.blueissac.domain.SampleVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링의 빈에 등록하기 위한 어노테이션. 그냥 스프링에서는 <component scan>을 별도로 설정해야했지만 부트는 자동 설정해줌
// 단 기본 패키지가 아닌 다른 패키지에 작성한 코드를 이용하려면 @ComponentScan 어노테이션이 필요함
// RestController를 이용시 JSP, HTML 같은 View가 아니라 문자열 데이터를 브라우저에 전송하게 됨
@RestController 
public class SampleController {
	
	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello World";
	}
	
	@GetMapping("/sample")
	public SampleVO makeSample() {
		
		SampleVO vo = new SampleVO();
		vo.setVal1("v1");
		vo.setVal2("v2");
		vo.setVal3("v3");
		
		System.out.println(vo);
		System.out.println(vo.toString());
	
		// 객체를 return하면 웹에서 json으로 자동으로 반환하네
		return vo;
	}
}

