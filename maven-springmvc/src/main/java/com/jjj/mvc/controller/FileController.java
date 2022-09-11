package com.jjj.mvc.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.UUID;

/**
 * @className: com.jjj.mvc.controller.FileController
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-10 20:38
 */
@Controller
public class FileController {
    @RequestMapping("/download")
    public ResponseEntity<byte[]> downloadFile(HttpSession session)
            throws IOException {
        ServletContext application = session.getServletContext();
        String realPath = application.getRealPath("/static/png/2022Java学习路线图.png");
        InputStream is = new FileInputStream(realPath);
        byte[] bytes = new byte[is.available()];
        is.read(bytes);
        HttpStatus status = HttpStatus.OK;
        MultiValueMap<String, String> header = new HttpHeaders();
        header.add("Content-Disposition", "attachment;filename=学习路线.png");
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, header, status);
        is.close();
        return responseEntity;
    }
    @RequestMapping(value = "/upgrade", method = RequestMethod.POST)
    public String  upgrade(MultipartFile multipartFile, HttpSession session) throws IOException {
        String filename = multipartFile.getOriginalFilename();
        assert filename != null;
        String suffix = filename.substring(filename.lastIndexOf("."));
        filename = UUID.randomUUID() + suffix;
        String dirPath = session.getServletContext().getRealPath("/static/files");
        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdir();
        }
        File finalFile = new File(dirPath + File.separator + filename);
        multipartFile.transferTo(finalFile);
        return "success";
    }
}
