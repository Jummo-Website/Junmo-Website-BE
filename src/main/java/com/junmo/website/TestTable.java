package com.junmo.website;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TestTable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_table_id")
    private Long id;

    private String content;

    @Builder
    public TestTable(Long id, String content) {
        this.id = id;
        this.content = content;
    }
}
