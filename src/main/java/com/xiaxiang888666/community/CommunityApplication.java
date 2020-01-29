package com.xiaxiang888666.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * echo "# community" >> README.md
 * git init
 * git add README.md
 * git commit -m "first commit"
 * git remote add origin git@github.com:xiaxiangboke/community.git
 * git push -u origin master
 */
@SpringBootApplication
public class CommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunityApplication.class, args);
    }

}

