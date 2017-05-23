package com.talaria.model;

import lombok.Data;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class QuestionAnswerTreePathVO { // Table : question_answer_tree_paths
    private long ancestor;
    private long descendant;
}
