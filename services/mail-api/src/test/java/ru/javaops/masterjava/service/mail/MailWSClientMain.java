package ru.javaops.masterjava.service.mail;

import com.google.common.collect.ImmutableSet;

public class MailWSClientMain {
    public static void main(String[] args) {
        MailWSClient.sendMail(
                ImmutableList.of(new Addressee("To <vlasovolder@yandex.ru>")),
                ImmutableList.of(new Addressee("Copy <vlasovolder@yandex.ru.ru>")), "Subject", "Body");
    }
}