package com.jae.springwebservice.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsDao extends JpaRepository<Posts, Long> {
}
