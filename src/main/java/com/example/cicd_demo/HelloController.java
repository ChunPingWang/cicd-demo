package com.example.cicd_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Hello API", description = "简单的问候 API")
public class HelloController {

    @GetMapping("/hello")
    @Operation(summary = "获取问候信息", description = "返回 Hello World 问候信息")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "成功返回问候信息")
    })
    public Mono<String> hello() {
        return Mono.just("Hello World !!!");
    }

    @GetMapping("/")
    @Operation(summary = "根路径问候", description = "在根路径返回 Hello World 问候信息")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "成功返回问候信息")
    })
    public Mono<String> root() {
        return Mono.just("Hello World !!!");
    }
} 