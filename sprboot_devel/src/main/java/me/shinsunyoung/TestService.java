//package me.shinsunyoung;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import me.shinsunyoung.domain.Member;
//import me.shinsunyoung.repository.MemberRepository;
//import me.shinsunyoung.repository.MemberRepositoryImpl;
//
//@Service
//public class TestService {
//	
//	@Autowired
//	MemberRepositoryImpl memberRepositoryImpl;
//	
//	public List<Member> getAllMembers(){
//		return memberRepositoryImpl.findAll();
//	}
//
//	public Member lastOne(Member member) {
//		return memberRepositoryImpl.save(member);
//	}
//	
//}
