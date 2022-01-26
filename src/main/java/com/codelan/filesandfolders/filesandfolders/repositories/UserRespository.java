package com.codelan.filesandfolders.filesandfolders.repositories;

import com.codelan.filesandfolders.filesandfolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User, Long> {
}
