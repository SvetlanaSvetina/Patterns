package ru.netology.web;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data // аннотация, которая применяет сразу несколько аннотаций Lombok
@RequiredArgsConstructor // создаёт конструктор с требуемыми аргументами

public class UserInfo{
    private final String city;
    private final String data;
    private final String name;
    private final String phone;
}