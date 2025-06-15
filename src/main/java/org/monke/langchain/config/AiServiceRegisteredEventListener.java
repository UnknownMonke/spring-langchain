package org.monke.langchain.config;

import dev.langchain4j.agent.tool.ToolSpecification;
import dev.langchain4j.service.spring.event.AiServiceRegisteredEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Listener to log registered tools on startup.
 */
@Slf4j
@Component
public class AiServiceRegisteredEventListener {

    @EventListener
    public void onAiServiceRegisteredEvent(AiServiceRegisteredEvent event) {
        Class<?> aiServiceClass = event.aiServiceClass();
        List<ToolSpecification> toolSpecifications = event.toolSpecifications();
        for (int i = 0; i < toolSpecifications.size(); i++) {
            log.info("[{}]: [Tool-{}]: {}\n", aiServiceClass.getSimpleName(), i + 1, toolSpecifications.get(i));
        }
    }
}
