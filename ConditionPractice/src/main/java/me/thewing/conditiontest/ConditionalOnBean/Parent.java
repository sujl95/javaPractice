package me.thewing.conditiontest.ConditionalOnBean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

import me.thewing.conditiontest.ConditionTest2.Client;

@ConditionalOnClass(Client.class)
@ConditionalOnBean
@ConditionalOnMissingBean
public class Parent {
}


