package com.ExhbPJ.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExhbPJ.entity.RvMember;

public interface RvMemberRepository extends JpaRepository<RvMember, Integer> {

	Optional<RvMember> findByMuserid(String muserid);

}
