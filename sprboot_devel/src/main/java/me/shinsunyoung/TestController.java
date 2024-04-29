//package me.shinsunyoung;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import me.shinsunyoung.domain.Member;
//
//
//@RestController
//public class TestController {
//	
//	@Autowired
//	TestService testService;
//	@Autowired
//	Member member;
//	
//	@GetMapping("/test")
//	public List<Member> getAllMembers(){
//		List<Member> members = testService.getAllMembers();
//		return members;
//	}
//	
//	@GetMapping("/test1")
//	public Member save() {
//		member.setName("김원기");
//		Member saved = testService.lastOne(member);
//		return saved;
//	}
//}
