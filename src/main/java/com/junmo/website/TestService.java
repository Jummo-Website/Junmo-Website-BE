package com.junmo.website;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;


    @Transactional
    public String addTest(TestRequestDto requestDto) {

        TestTable testTable = TestTable.builder()
            .content(requestDto.content())
            .build();

        testRepository.save(testTable);

        return "저장완료";

    }

    @Transactional
    public String findTest(Long testId) {
        
        TestTable result = testRepository.findById(testId).orElseThrow();
        
        return "id : " + result.getId() + " content : " + result.getContent();
        
    }
}
