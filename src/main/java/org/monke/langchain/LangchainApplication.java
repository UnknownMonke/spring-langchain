package org.monke.langchain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class LangchainApplication {

	public static void main(String[] args) {
		SpringApplication.run(LangchainApplication.class, args);

//		ChatModel llamaModel = OllamaChatModel.builder()
//			.baseUrl("http://localhost:11434")
//			.modelName("llama3.1:8b-instruct-q4_0")
//			.build();
//
//		String answer = llamaModel.chat("Where is Paris");
//		System.out.println(answer);
	}
}
