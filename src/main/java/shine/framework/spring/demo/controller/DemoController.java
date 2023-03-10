package shine.framework.spring.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import shine.framework.core.dto.MultiR;
import shine.framework.core.dto.PageR;
import shine.framework.core.dto.SingleR;
import shine.framework.core.dto.reactive.ReactorR;
import shine.framework.spring.core.controller.BaseController;

import java.util.List;

/**
 * @author SilenceShine
 * @since 1.0
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController extends BaseController {

    @GetMapping("/single")
    public SingleR<String> single() {
        return SingleR.ok("single");
    }

    @GetMapping("/multi")
    public MultiR<String> multi() {
        return MultiR.ok("1", " 2");
    }

    @GetMapping("/page")
    public PageR<String> page() {
        return PageR.ok(1, 1, 1, List.of("1"));
    }

    @GetMapping("/monoSingle")
    public Mono<SingleR<String>> monoSingle() {
        return ReactorR.single("single");
    }

}
