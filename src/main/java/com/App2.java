package com;

import com.chen.config.SpringConfig;
import com.chen.domain.Account;
import com.chen.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        Account account = accountService.findById(1);
        System.out.println(account);

    }
}
