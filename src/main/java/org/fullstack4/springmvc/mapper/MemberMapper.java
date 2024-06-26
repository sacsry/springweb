package org.fullstack4.springmvc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.fullstack4.springmvc.domain.MemberVO;

import java.util.List;

@Mapper
public interface MemberMapper {
    MemberVO login(String id);
    int join(MemberVO vo);
    MemberVO view(String id);
    int modify(MemberVO vo);
    int delete(String id);
    List<String> idList();
}
