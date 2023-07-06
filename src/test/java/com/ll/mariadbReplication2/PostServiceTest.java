package com.ll.mariadbReplication2;

import com.ll.mariadbReplication2.domain.post.PostService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class PostServiceTest {
    @Autowired
    private PostService postService;

    @Test
    @DisplayName("글 작성")
    void t1() {
        postService.save("제목1");
        assertThat(postService.findAll().size()).isEqualTo(1);
    }
}
