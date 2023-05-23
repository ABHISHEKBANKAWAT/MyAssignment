package Streams;

import java.util.*;
import java.util.function.Consumer;

class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;

    public News(int newsId, String postedByUser, String commentByUser, String comment) {
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }

    public int getNewsId() {
        return newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public String getComment() {
        return comment;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public void setPostedByUser(String postedByUser) {
        this.postedByUser = postedByUser;
    }

    public void setCommentByUser(String commentByUser) {
        this.commentByUser = commentByUser;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}

public class Question2 {
    public static int maxComments(List<News> news) {
        HashMap<Integer, Integer> newsCommentCount = new HashMap<Integer, Integer>();

        Consumer<News> countComments = news1 -> {
            int newsId = news1.getNewsId();
            newsCommentCount.put(newsId, newsCommentCount.getOrDefault(newsId, 0) + 1);
        };

        news.stream().forEach(countComments);

        int maxCommentNewsId = 0;
        int maxCommentCount = 0;
        for (Map.Entry<Integer, Integer> entry : newsCommentCount.entrySet()) {
            if (entry.getValue() > maxCommentCount) {
                maxCommentCount = entry.getValue();
                maxCommentNewsId = entry.getKey();
            }
        }
        return maxCommentNewsId;
    }

    public static int budgetCount(List<News> news) {
        int[] budgetWordCount = { 0 };

        Consumer<News> countBudget = news1 -> {
            String comment = news1.getComment();
            String[] commentWords = comment.split(" ");
            for (String str : commentWords) {
                if (str.toLowerCase().equals("budget")) {
                    budgetWordCount[0] += 1;
                }
            }
        };
        news.stream().forEach(countBudget);
        return budgetWordCount[0];
    }

    public static String maxCommentsByUser(List<News> news) {
        HashMap<String, Integer> newsCommentCount = new HashMap<String, Integer>();

        Consumer<News> countComments = news1 -> {
            String user = news1.getCommentByUser();
            newsCommentCount.put(user, newsCommentCount.getOrDefault(user, 0) + 1);
        };

        news.stream().forEach(countComments);

        String maxCommentsByUser = "";
        int maxCommentCount = 0;
        for (Map.Entry<String, Integer> entry : newsCommentCount.entrySet()) {
            if (entry.getValue() > maxCommentCount) {
                maxCommentCount = entry.getValue();
                maxCommentsByUser = entry.getKey();
            }
        }
        return maxCommentsByUser;
    }

    public static Map<String, Integer> sortMaxCommentsByUser(List<News> news) {
        Map<String, Integer> userCommentCount = new LinkedHashMap<>();

        Consumer<News> countCommentByUser = news1 -> {
            String commentUser = news1.getCommentByUser();
            userCommentCount.put(commentUser, userCommentCount.getOrDefault(commentUser, 0) + 1);
        };

        news.stream().forEach(countCommentByUser);
        return userCommentCount;
    }

    public static void main(String[] args) {

        List<News> news = new ArrayList<>();
        news.add(new News(102, "aa2", "bb1", "good budget"));
        news.add(new News(101, "aa1", "bb2", "good"));
        news.add(new News(101, "aa1", "bb2", "budget"));
        news.add(new News(101, "aa1", "bb4", "good"));

        // Find out the newsId which has received maximum comments
        int maxCommentNewsId = maxComments(news);
        System.out.println("NewsId with max comments : " + maxCommentNewsId);

        // Find out how many times the word 'budget' arrived in user comments all news
        int budgetWordCount = budgetCount(news);
        System.out.println("Budget word count : " + budgetWordCount);

        // Find out which user has posted maximum comments
        String maxUserComments = maxCommentsByUser(news);
        System.out.println("User who posted most comments : " + maxUserComments);

        // Display commentByUser wise number of comments.
        Map<String, Integer> userCommentCount = sortMaxCommentsByUser(news);
        System.out.println(userCommentCount);

    }
}