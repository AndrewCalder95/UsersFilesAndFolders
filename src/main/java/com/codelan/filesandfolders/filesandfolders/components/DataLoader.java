package com.codelan.filesandfolders.filesandfolders.components;

import com.codelan.filesandfolders.filesandfolders.models.File;
import com.codelan.filesandfolders.filesandfolders.models.Folder;
import com.codelan.filesandfolders.filesandfolders.models.User;
import com.codelan.filesandfolders.filesandfolders.repositories.FileRespository;
import com.codelan.filesandfolders.filesandfolders.repositories.FolderRespository;
import com.codelan.filesandfolders.filesandfolders.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader  implements ApplicationRunner {

    @Autowired
    UserRespository userRespository;

    @Autowired
    FileRespository fileRespository;

    @Autowired
    FolderRespository folderRespository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User user1 = new User("Andrew");
        userRespository.save(user1);

        User user2 = new User("Brian");
        userRespository.save(user2);

        User user3 = new User("Callum");
        userRespository.save(user3);

        Folder folder1 = new Folder("Images", user1);
        folderRespository.save(folder1);

        Folder folder2 = new Folder("Videos", user2);
        folderRespository.save(folder2);

        Folder folder3 = new Folder("Documents", user3);
        folderRespository.save(folder3);


        File file1 = new File("Sunset", "jpg", 10, folder1);
        fileRespository.save(file1);

        File file2 = new File("Birthday", "mp4", 100, folder2);
        fileRespository.save(file2);

        File file3 = new File("Notes", "doc", 1, folder3);
        fileRespository.save(file3);


    }
}
