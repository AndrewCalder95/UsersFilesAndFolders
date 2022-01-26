package com.codelan.filesandfolders.filesandfolders.repositories;

import com.codelan.filesandfolders.filesandfolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRespository extends JpaRepository<Folder, Long> {
}
