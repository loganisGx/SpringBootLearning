package com.logan.springbootofficial;

import com.logan.springbootofficial.bean.Elf;
import com.logan.springbootofficial.bean.Magician;
import com.logan.springbootofficial.bean.Monster;
import com.logan.springbootofficial.bean.Warrior;
import com.logan.springbootofficial.listener.MessageEvent;
import com.logan.springbootofficial.listener.MessageListener;
import com.logan.springbootofficial.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);
		commonBoot(context);
		//eventBoot(context);

	}

	private static void eventBoot(ConfigurableApplicationContext context){
		context.publishEvent(new MessageEvent("今晚去打羽毛球"));
	}

	private static void commonBoot(ConfigurableApplicationContext context){
		int beanDefinitionCount = context.getBeanDefinitionCount();
		System.out.println("容器中bean的数量:" + beanDefinitionCount);

//		String[] names = context.getBeanDefinitionNames();
//		for (String name : names) {
//			System.out.println(name);
//		}

//		boolean user01 = context.containsBean("user01");
//		System.out.println("是否存在user01：" + user01);
//
//		boolean darkMagician = context.containsBean("darkMagician");
//		System.out.println("是否存在darkMagician：" + darkMagician);

//		System.out.println("==================");
//		Magician magician = context.getBean(Magician.class);
//		Elf elf = context.getBean(Elf.class);
//		Elf magicianElf = magician.getElf();
//		System.out.println(elf);
//		System.out.println(magicianElf);
//		System.out.println(elf == magicianElf);

//		System.out.println("===================");
//		String[] beanNamesForType = context.getBeanNamesForType(Monster.class);
//		for (String s : beanNamesForType) {
//			System.out.println("Monster的Bean：" + s);
//		}
//		String[] beanNamesForType1 = context.getBeanNamesForType(Elf.class);
//		for (String s : beanNamesForType1) {
//			System.out.println("Elf的Bean：" + s);
//		}
//		String[] beanNamesForType2 = context.getBeanNamesForType(Magician.class);
//		for (String s : beanNamesForType2) {
//			System.out.println("Magician的Bean：" + s);
//		}
//		String[] beanNamesForType3 = context.getBeanNamesForType(Warrior.class);
//		for (String s : beanNamesForType3) {
//			System.out.println("Warrior的Bean：" + s);
//		}
	}

	@Bean
	public MessageListener messageListener1(){
		return new MessageListener("Yasuo");
	}

	@Bean
	public MessageListener messageListener2(){
		return new MessageListener("Riven");
	}

	@Bean
	public MessageListener messageListener3(){
		return new MessageListener("Timo");
	}
}
