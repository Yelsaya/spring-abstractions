package org.example;

import services.CommentService;

public class Main {
    public static void main(String[] args) {
        DBCommentRepository commentRepository = new DBCommentRepository();
        EmailCommentNotificationProxy CommentNotificationProxy = new EmailCommentNotificationProxy();

        CommentService commentService = new CommentService(commentRepository, CommentNotificationProxy);

        Comment comment = new Comment();
        comment.setAuthor("Larry");
        comment.setText("Demo comment");

        commentService.publishComment(comment);
    }
}