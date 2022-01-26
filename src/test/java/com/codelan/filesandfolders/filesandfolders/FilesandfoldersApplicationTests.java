package com.codelan.filesandfolders.filesandfolders;

import com.codelan.filesandfolders.filesandfolders.models.File;
import com.codelan.filesandfolders.filesandfolders.models.Folder;
import com.codelan.filesandfolders.filesandfolders.models.User;
import com.codelan.filesandfolders.filesandfolders.repositories.FileRespository;
import com.codelan.filesandfolders.filesandfolders.repositories.FolderRespository;
import com.codelan.filesandfolders.filesandfolders.repositories.UserRespository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FilesandfoldersApplicationTests {

	@Autowired
	UserRespository userRespository;

	@Autowired
	FileRespository fileRespository;

	@Autowired
	FolderRespository folderRespository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUserFilesFolders(){
		User user = new User("Andrew Calder");
		userRespository.save(user);

		Folder folder1 = new Folder("Images", user);
		folderRespository.save(folder1);

		File file = new File("Sunset", "jpg", 10, folder1);
		fileRespository.save(file);


	}

}
