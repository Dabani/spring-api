package com.dabanispring.springapi.services;

import java.util.List;

import com.dabanispring.springapi.models.Member;

public interface MemberService {
  Member saveMember(Member member);
  List<Member> getAllMembers();
  Member getMemberById(long id);
  Member updateMember(Member member, long id);
  void deleteMember(long id);
}
