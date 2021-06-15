package domain;

import java.util.Date;
import java.util.List;

/*
В комментариях к сдаче ДЗ ответ на вопрос "почему (по вашему мнению),
в описании объектов в Vk оказались поля, которых не было в вашем классе?"

документация: https://vk.com/dev/objects/post

Далёк от соцсетей. Не то что поля, а термины не понятны - что значит закрепить запись ?
запись стояла на таймере ?
*/

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private Date date;
    private String text;
    private int replyPostId;
    private boolean frendsOnly;
    private int comments;
    private CanComment canComment;
    private int likes;
    private int views;
    private int reposts;
    private MaterialSource materialSource;
    private String postType; // post, copy, reply, postpone, suggest.
    private Attachment[] attachments;
    private Geo geo;
}

