package com.codelan.filesandfolders.filesandfolders.repositories;

import com.codelan.filesandfolders.filesandfolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRespository extends JpaRepository<File, Long> {
}
