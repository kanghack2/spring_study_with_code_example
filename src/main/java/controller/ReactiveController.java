package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/**
 * 
 * @author hankanghak
 *
 * UI 로 마트 관련 데이터를 비동기로 전달해주는 동작을 구현하자.
 */
@RestController
public class ReactiveController {
	
	
	@GetMapping("/")
	public Mono<String> rest() {
		
		return Mono.just("Hello webFlux").log();
	}
	
}
