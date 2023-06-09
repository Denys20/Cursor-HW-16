package com.example.MongoDB.service;

import com.example.MongoDB.documents.UserDocument;

import java.util.List;

public interface UserDocumentService {
    UserDocument createUser(UserDocument userDocument);
    List<UserDocument> getUsersByFirstName(String firstName);
    List<UserDocument> getUsersByLastName(String lastName);
    UserDocument getUserByEmail(String email);
    List<UserDocument> getUsersByAgeGreaterThan(int age);
    List<UserDocument> getUsersByIsMarried(Boolean isMarried);
    void deleteUsersById(Long id);
}
