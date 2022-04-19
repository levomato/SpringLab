package com.levo.SpringLab;

import com.levo.SpringLab.model.Task;
import com.levo.SpringLab.repositories.TaskRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;

@SpringBootApplication
public class SpringLabApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringLabApplication.class, args);

		Task FirstTask = new Task();
		FirstTask.setTitle("First Task");
		FirstTask.setContent("Spühlen");
		FirstTask.setDate(new Date());

		TaskRepository taskRepository = context.getBean(TaskRepository.class);
		taskRepository.save(FirstTask);
	}

}
