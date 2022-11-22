package com.service;

import java.util.List;

public interface IEmailService  {
    List<String> language();

    List<Integer> pageSize();

    List<String> spamsFilter();
}
