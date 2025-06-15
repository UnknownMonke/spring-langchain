package org.monke.langchain.agent;

import dev.langchain4j.service.Result;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
interface Assistant {

    // Context prompt wrapped into each message.
    @SystemMessage("You are a polite assistant.")
    Result<String> chat(String userMessage);
}
