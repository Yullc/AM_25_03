//package org.example;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ArticleController {
//    int lastId = 1;
//    List<Article> articles = new ArrayList<>();
//    public void write() {
//        int id = lastId+1;
//        System.out.println(lastId+"번 글이 생성되었습니다.");
//        String title = Container.getScanner().nextLine();
//        String body = Container.getScanner().nextLine();
//
//        Article article = new Article(id, title, body);
//        articles.add(article);
//        lastId++;
//    }
//
//    public void list() {
//        if (articles.size() == 0) {
//            System.out.println("등록된거 없다");
//        return;
//        }
//
//        System.out.println("=".repeat(40));
//        System.out.printf("   id    /     title      /      body        \n");
//        for (int i = articles.size()-1; i>=0; i--){
//
//        }
//    }
//}
