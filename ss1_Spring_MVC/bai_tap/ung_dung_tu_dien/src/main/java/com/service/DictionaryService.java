package com.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryService implements IDictionaryService {
    private static Map<String, String> dictionaryMap = new HashMap<>();

    static {
        dictionaryMap.put("Hello", "Xin Chào");
        dictionaryMap.put("Bye", "Tạm Biệt");
        dictionaryMap.put("Star", "Ngôi Sao");
        dictionaryMap.put("Dog", "Con Chó");
    }

    @Override
    public String change(String english) {
        if (dictionaryMap.get(english) == null) {
            return "Không có từ này trong từ điển nhé!!";
        } else {
            return dictionaryMap.get(english);
        }
    }
}
