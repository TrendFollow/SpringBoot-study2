//package me.shinsunyoung.repository;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import me.shinsunyoung.domain.Member;
//
//@Repository
//public class MemberRepositoryImpl {
//	
//	@Autowired
//	MemberRepository memberRepository;
//	
//	// 멤버 전체 조회
//	public List<Member> findAll(){
//		return memberRepository.findAll();
//	}
//	
//	// 멤버 id로 조회
//	public Member selectOne(int id) {
//		return memberRepository.selectOne(id);
//	}
//	
//	// 멤버 전체 삭제
//	public void deleteAll() {
//		memberRepository.deleteAll();
//	}
//	
//	// 멤버 등록
//	public Member save(Member member) {
//		memberRepository.save(member);
//		return memberRepository.lastOne();
//	}
//}
