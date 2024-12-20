package com.aptproject.SpringLibraryProject.library.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class GenericDTO {

    private Long id;
    private String createdBy;
    private LocalDateTime createdWhen;
    private LocalDateTime deletedWhen;
    private String deletedBy;
    private boolean isDeleted;

}
