package com.dabanispring.springapi.services.implementations;

import java.util.List;
// import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dabanispring.springapi.exception.ResourceNotFoundException;
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

  @Override
  public List<Member> getAllMembers() {
    return memberRepository.findAll();
  }

  @Override
  public Member getMemberById(long id) {
    /* 
    Optional<Member> member = memberRepository.findById(id);
    if (member.isPresent()) {
      return member.get();
    } else {
      throw new ResourceNotFoundException("Member", "Id", id);
    }
    */
    return memberRepository.findById(id)
      .orElseThrow(() -> new ResourceNotFoundException("Member", "Id", id));
  }
  
}
