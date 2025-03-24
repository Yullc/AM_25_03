package org.example;

public class App {
    ArticleController articleController = new ArticleController();
    public void run() {
        while(true) {
            String cmd = Container.getScanner().nextLine().trim();
            if(cmd.equals("article write")){
                articleController.write();
            }
            else if(cmd.equals("article list")){
                articleController.list();
            }
        }

    }
}
