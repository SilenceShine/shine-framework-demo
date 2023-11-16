package io.github.SilenceShine;

import io.github.SilenceShine.mapper.TestMapper;
import io.github.SilenceShine.shine.core.dto.R;
import io.github.SilenceShine.shine.core.dto.SingleR;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author SilenceShine
 * @github <a href="https://github.com/SilenceShine">SilenceShine</a>
 * @since 1.0
 */
@Slf4j
@RestController
@AllArgsConstructor
@SpringBootApplication
public class SpringMybatisApplication {

    private final TestMapper testMapper;

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisApplication.class, args);
    }

    @GetMapping("/hello")
    public R<LocalDateTime> hello() {
        return SingleR.ok(LocalDateTime.now());
    }

}
