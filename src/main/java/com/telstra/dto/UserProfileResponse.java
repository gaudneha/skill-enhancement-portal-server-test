package com.telstra.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileResponse {
    private Long id;

    private List<QuestionResponse> questionList = new ArrayList<>();
    private List<CommentResponse> commentList = new ArrayList<>();
    private List<UserResponse> followingList = new ArrayList<>();
    private List<UserResponse> followersList = new ArrayList<>();

    private Long points;
    private String name;
    private String email;
    private String github;
    private String linkedin;
}
