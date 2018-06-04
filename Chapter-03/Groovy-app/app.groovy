@RestController
class HelloController {
	@GetMapping("/")
	String hello() {
		return "Hello World!!!"
	}
} 
