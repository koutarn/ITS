package com.example.its.web.issue;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class IssueForm {

    @NotBlank
    @Size(max=255)
    private String summary;

    @NotBlank
    @Size(max=255)
    private String description;
}
