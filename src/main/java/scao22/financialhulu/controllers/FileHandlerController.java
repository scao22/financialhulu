package scao22.financialhulu.controllers;

import org.springframework.stereotype.Controller;
import scao22.financialhulu.services.AmazonS3ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@Controller
//@RequestMapping("/files")
public class FileHandlerController {

    @Autowired
    private AmazonS3ClientService amazonS3ClientService;


    @GetMapping("/")
    public String homepage() {
        return "index";
    }


    @PostMapping("/upload")
    public String uploadFile(@RequestPart(value = "file") MultipartFile file)
    {
        this.amazonS3ClientService.uploadFileToS3Bucket(file, false);

        Map<String, String> response = new HashMap<>();
        response.put("message", "file [" + file.getOriginalFilename() + "] uploading request submitted successfully.");

        return "redirect:/item/list";
    }

//    @DeleteMapping
//    public Map<String, String> deleteFile(@RequestParam("file_name") String fileName)
//    {
//        this.amazonS3ClientService.deleteFileFromS3Bucket(fileName);
//
//        Map<String, String> response = new HashMap<>();
//        response.put("message", "file [" + fileName + "] removing request submitted successfully.");
//
//        return response;
//    }
}
