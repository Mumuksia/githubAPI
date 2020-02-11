package com.example.githubapi.service;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

@Service
public class DownloadFileService {

    public String getFileFromURL(String url) {
        try {
            return IOUtils.toString(new URL(url), Charset.defaultCharset());
        } catch (IOException e) {
            //not adding logger as it will be too much for test purposes
            e.printStackTrace();
        }
        return "";
    }
}
