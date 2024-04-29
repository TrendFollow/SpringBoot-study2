//package me.shinsunyoung.repository;
//
//import java.util.List;
//
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Options;
//import org.springframework.dao.DataAccessException;
//
//import me.shinsunyoung.domain.Member;
//
//@Mapper
//public interface MemberRepository {
//	
//	// 게시물 전체 조회
//	public List<Member> findAll() throws DataAccessException;
//	
//	// 게시물 id로 조회
//	public Member selectOne(int id) throws DataAccessException;
//	
//	// 멤버 전체 삭제
//	public void deleteAll() throws DataAccessException;
//	
//	// 멤버 등록
//    public void save(Member member) throws DataAccessException;
//   
//    // 마지막 등록된 멤버 조회
//    public Member lastOne() throws DataAccessException;
//}
