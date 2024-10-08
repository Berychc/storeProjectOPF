package ru.skypro.homework.service;

import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.entity.Image;

import java.io.IOException;

public interface ImageService {

    Image downloadImage(MultipartFile file) throws IOException;

    void deleteImage(Integer id);

    byte[] getImage(Integer id);
}
