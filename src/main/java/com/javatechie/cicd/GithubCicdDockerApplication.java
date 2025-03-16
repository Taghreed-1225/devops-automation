package com.javatechie.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdDockerApplication {

	@GetMapping
	public String message(){
		return "Hello World Taghreed";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdDockerApplication.class, args);}

}
//echo "# devops-automation" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/Taghreed-1225/devops-automation.git
//git push -u origin main
