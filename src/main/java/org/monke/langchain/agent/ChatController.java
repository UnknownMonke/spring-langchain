package org.monke.langchain.agent;

import dev.langchain4j.service.Result;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ChatController {

    private final Assistant assistant;

    @PostMapping("/chat")
    public String model(@RequestBody String message) {
        Result<String> response = assistant.chat(message); // Accesses parameters, token usage, tools... directly.
        return response.content();
    }
}
