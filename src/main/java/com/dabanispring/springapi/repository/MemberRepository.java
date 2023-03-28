package com.dabanispring.springapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dabanispring.springapi.models.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
  
}
