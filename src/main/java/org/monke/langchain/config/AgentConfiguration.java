package org.monke.langchain.config;

import dev.langchain4j.model.chat.listener.ChatModelErrorContext;
import dev.langchain4j.model.chat.listener.ChatModelListener;
import dev.langchain4j.model.chat.listener.ChatModelRequestContext;
import dev.langchain4j.model.chat.listener.ChatModelResponseContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class AgentConfiguration {

    /**
     * Proxies chat requests, response and errors with access to parameters (tokens, tools...).
     */
    @Bean
    ChatModelListener chatModelListener() {
        return new ChatModelListener() {

            @Override
            public void onRequest(ChatModelRequestContext requestContext) {
                log.info("request : {}", requestContext.chatRequest());
            }

            @Override
            public void onResponse(ChatModelResponseContext responseContext) {
                log.info("response token usage : {}", responseContext.chatResponse().tokenUsage());
            }

            @Override
            public void onError(ChatModelErrorContext errorContext) {
                log.info("response in error : {}", errorContext.error().getMessage());
            }
        };
    }
}
