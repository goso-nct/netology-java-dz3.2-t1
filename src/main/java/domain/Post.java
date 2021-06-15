package domain;

import java.util.Date;
import java.util.List;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private Date date;
    private String text;
    private int replyPostId;
    private boolean frendsOnly;
    private MaterialSource materialSource;
    private int numView;
    private String postType; // post, copy, reply, postpone, suggest.
    private List<Attachment> attachments;
    private Geo geo;
}
