package com.wynk.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTopic is a Querydsl query type for Topic
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTopic extends EntityPathBase<Topic> {

    private static final long serialVersionUID = 1441874532L;

    public static final QTopic topic = new QTopic("topic");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QTopic(String variable) {
        super(Topic.class, forVariable(variable));
    }

    public QTopic(Path<? extends Topic> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTopic(PathMetadata metadata) {
        super(Topic.class, metadata);
    }

}

