package fpt.edu.bikeke.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageAccount {
    private int pageSize;
    private Long totalElements;
    private int totalPages;
    private List<AccountDto> accountList;
}
