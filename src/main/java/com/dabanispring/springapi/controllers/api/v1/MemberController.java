package com.dabanispring.springapi.controllers.api.v1;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dabanispring.springapi.models.Member;
import com.dabanispring.springapi.services.MemberService;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {
  private MemberService memberService;

  public MemberController(MemberService memberService) {
    super();
    this.memberService = memberService;
  }

  // Build create member REST API
  @PostMapping()
  public ResponseEntity<Member> saveMember (@RequestBody Member member) {
    return new ResponseEntity<Member> (memberService.saveMember(member), HttpStatus.CREATED);
  }

  // Build get all members REST API
  @GetMapping
  public List<Member> getAllMembers() {
    return memberService.getAllMembers();
  }
}