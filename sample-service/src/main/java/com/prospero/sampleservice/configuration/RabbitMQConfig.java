package com.bizappbot.emailservices.config;

import com.bizappbot.emailservices.constant.QueueConstants;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig implements QueueConstants{


    @Bean
    public Queue SubscribeNewDevice (){
        return new Queue(SubscribeNewDevice);
    }

    @Bean
    public Queue ResetPasswordCode (){
        return new Queue(ResetPasswordCode);
    }


    @Bean
    public Queue ExpiredLicense (){
        return new Queue(ExpiredLicense);
    }


    @Bean
    public Queue ResetPasswordSucces (){
        return new Queue(ResetPasswordSucces);
    }

    @Bean
    public Queue NearlyExpiredLicense (){
        return new Queue(NearlyExpiredLicense);
    }
    @Bean
    public Queue PaidInvoice (){
        return new Queue(PaidInvoice);
    }
    @Bean
    public Queue PaymentNotComplete (){
        return new Queue(PaymentNotComplete);
    }
    @Bean
    public Queue RenewalInvoice (){
        return new Queue(RenewalInvoice);
    }
    @Bean
    public Queue SuccessRegister (){
        return new Queue(SuccessRegister);
    }

    @Bean
    public TopicExchange exchange(){
        return new TopicExchange(EXCHANGE);
    }
    @Bean
    public Binding SubscribeNewDeviceBinding(@Qualifier("SubscribeNewDevice") Queue queue, TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(HEADERS_SubscribeNewDevice);
    }
    @Bean
    public Binding ResetPasswordCodeBinding(@Qualifier("ResetPasswordCode") Queue queue, TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(HEADERS_ResetPasswordCode);
    }
    @Bean
    public Binding NearlyExpiredLicenseBinding(@Qualifier("NearlyExpiredLicense") Queue queue, TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(HEADERS_NearlyExpiredLicense);
    }
    @Bean
    public Binding ResetPasswordSuccesBinding(@Qualifier("ResetPasswordSucces") Queue queue, TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(HEADERS_ResetPasswordSucces);
    }
    @Bean
    public Binding PaidInvoiceBinding(@Qualifier("PaidInvoice") Queue queue, TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(HEADERS_PaidInvoice);
    }
    @Bean
    public Binding PaymentNotCompleteBinding(@Qualifier("PaymentNotComplete") Queue queue, TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(HEADERS_PaymentNotComplete);
    }
    @Bean
    public Binding ExpiredLicenseBinding(@Qualifier("ExpiredLicense") Queue queue, TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(HEADERS_ExpiredLicense);
    }

    @Bean
    public Binding RenewalInvoiceBinding(@Qualifier("RenewalInvoice") Queue queue, TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(HEADERS_RenewalInvoice);
    }
    @Bean
    public Binding SuccessRegisterBinding(@Qualifier("SuccessRegister") Queue queue, TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(HEADERS_SuccessRegister);
    }
    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }
    @Bean
    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter());
        return rabbitTemplate;
    }
}
