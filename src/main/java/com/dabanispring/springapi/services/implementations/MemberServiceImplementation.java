package com.dabanispring.springapi.services.implementations;

import org.springframework.stereotype.Service;

import com.dabanispring.springapi.models.Member;
import com.dabanispring.springapi.repository.MemberRepository;
import com.dabanispring.springapi.services.MemberService;

@Service
public class MemberServiceImplementation implements MemberService {

  private MemberRepository memberRepository;

  public MemberServiceImplementation(MemberRepository memberRepository) {
    super();
    this.memberRepository = memberRepository;
  }

  @Override
  public Member saveMember(Member member) {
    return memberRepository.save(member);
  }
  
}
